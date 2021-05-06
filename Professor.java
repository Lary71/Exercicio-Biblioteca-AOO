public class Professor extends Pessoa {
    public String codigo;

    public Professor(String nome){
        super(nome);
    }
    public Professor(String nome,String codigo){
        super(nome);
        this.codigo = codigo;
    }
        public String getcodigo(){
            return this.codigo;
    }
    public void setcodigo(String codigo){
            this.codigo = codigo;
    } 
}