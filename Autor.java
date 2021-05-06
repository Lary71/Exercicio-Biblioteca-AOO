public class Autor extends Pessoa {
    
    public String nacionalidade;
    
    public String getnacionalidade(){
        return this.nacionalidade;
    }
    public void setnacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public Autor(String nome){
        super(nome);
    }
    public Autor(String nome,String nacionalidade){
        super(nome);
        this.nacionalidade = nacionalidade;
    }
}