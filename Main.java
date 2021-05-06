public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("");
        autor1.nome = "Stephen Hawking";
        autor1.nacionalidade = "Reino Unido";
        Autor autor2 = new Autor("");
        autor1.nome = "Stephen Covey";
        autor1.nacionalidade = "Estados Unidos";
        Aluno aluno = new Aluno("");
        aluno.nome = "Larissa";
        aluno.codigo = "000112";
        Professor prof = new Professor("Efraim","00204");
        Livro livro1 = new Livro("Uma breve historia do tempo",autor1);
        livro1.emprestadoPor = new Aluno("Larissa");
        System.out.println("O livro " + livro1.nome + " de " + autor1.nome + " do " + autor1.nacionalidade + " foi emprestado pelo(a) " + livro1.emprestadoPor.nome );
        Livro livro2 = new Livro("Os 7 habitos das pessoa altamente eficazes",autor2);
        livro2.emprestadoPor = new Professor("Efraim");
        System.out.println("O livro " + livro2.nome + " de " + autor2.nome + " do " + autor2.nacionalidade + " foi emprestado pelo(a) " + livro2.emprestadoPor.nome);
    }
}