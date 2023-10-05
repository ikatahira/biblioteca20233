package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Autor;
import application.model.AutorRepository;


@Controller
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorRepository autorRepo;


    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("autores", autorRepo.findAll());
        return "/autor/list";
  
    
}

@RequestMapping("/insert")

public String insert(){
    return "/autor/insert";
}


@RequestMapping(value ="/insert", method = RequestMethod.POST)
public String insert(@RequestParam("nome") String nome){
    Autor autor =new Autor();
    autor.setNome(nome);

    autorRepo.save(autor);

    return "redirect:/autor/list";
}


@RequestMapping("/update")

public String update(){
    return "/autor/update";
}

@RequestMapping(value ="/update", method = RequestMethod.POST)
public String update(@RequestParam("id") int id, @RequestParam("nome") String nome ){
 Optional<Autor> autor = autorRepo.findById(id);   
    if(autor.isPresent()){
         autor.get().setNome(nome);
         autorRepo.save(autor.get());
    }
    return "redirect:/autor/list";
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
