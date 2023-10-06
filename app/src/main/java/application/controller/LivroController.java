package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Autor;
import application.model.Genero;
import application.model.AutorRepository;
import application.model.GeneroRepository;
import application.model.Livro;
import application.model.LivroRepository;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private GeneroRepository generoRepo;

    @Autowired
    private LivroRepository livroRepo;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("livros", livroRepo.findAll());
        return "list.jsp";
  
    
}

@RequestMapping("/insert")

public String insert(Model model){
    model.addAttribute("generos", generoRepo.findAll());
    model.addAttribute("autores", autorRepo.findAll());
    return "insert.jsp";
}


@RequestMapping(value ="/insert", method = RequestMethod.POST)
public String insert(@RequestParam("titulo") String titulo,
@RequestParam("genero") int generoId,
@RequestParam("autor") int autorId){
    Livro livro = new Livro();
    livro.setTitulo(titulo);
    livro.setGenero(generoRepo.findById(generoId).get());
    livro.setAutor(autorRepo.findById(autorId).get());
    livroRepo.save(livro);

    return "redirect:/livro/list";
}


@RequestMapping("/update")

public String update(){
    return "/livro/update";
}

@RequestMapping(value ="/update", method = RequestMethod.POST)
public String update(@RequestParam("titulo") String titulo, 
@RequestParam("id") int id, 
@RequestParam("genero") int generoId,
@RequestParam("autor") int autorId){
 Optional<Livro> livro = livroRepo.findById(id);   
    if(livro.isPresent()){
         livro.get().setTitulo(titulo);
         livroRepo.save(livro.get());
    }
    return "redirect:/livro/list";
}

@RequestMapping("/delete")
public String delete(Model model, @RequestParam("id") int id){
   Optional<Autor> autor = autorRepo.findById(id);
   
   if(autor.isPresent()){
    model.addAttribute("autor", autor.get());
    return "/autor/delete";
}
return "redirect:/autor/list";
}

}
