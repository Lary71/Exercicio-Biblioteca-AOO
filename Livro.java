public class Livro {
    public String nome;
    public Autor Autor;
    public Pessoa emprestadoPor;

    public Livro(String nome, Autor Autor){
        this.Autor = Autor;
        this.nome = nome;
    }
        public String getnome(){
            return this.nome;
    }
    public void setnome(String nome){
            this.nome = nome;
    }  
    public Autor getAutor(){
        return this.Autor;
}
public void setAutor(Autor Autor){
        this.Autor = Autor;
}  
public Pessoa getemprestadoPor(){
    return this.emprestadoPor;
}
public void setemprestadoPor(Pessoa emprestadoPor){
    this.emprestadoPor = emprestadoPor;
}  
    
}