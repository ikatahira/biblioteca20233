package application.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import application.model.Autor;
import application.model.Genero;

@Entity
@Table(name="livros")
public class Livro{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String titulo;


@ManyToOne
@JoinColumn(name="id_genero")
private Genero genero;

public void setGenero (Genero genero){
    this.genero=genero;
}
public Genero getGenero(){
    return this.genero;
}

@ManyToOne
@JoinColumn(name = "id_autor")
private Autor autor;
public void setAutor(Autor autor){
    this.autor=autor;
}
public Autor getAutor(){
   return this.autor;
}


public void setId(int id) {
    this.id = id;
}public int getId() {
    return id;
}
public String getTitulo(){
    return this.titulo;
}
public void setTitulo(String titulo){
    this.titulo=titulo;
}

}