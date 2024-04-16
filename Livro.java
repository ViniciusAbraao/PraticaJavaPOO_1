
package atividade_praticapoo;


public class Livro {
    
    String titulo;
    String autor;
    int anoPublicacao;
    int numPaginas;
    boolean emEmprestimo;
    
    
    public void exibirDetalhes(){
        System.out.printf("Titulo: " + titulo);
        System.out.printf("\nAutor: " + autor);
        System.out.printf("\nAno de Publicação: " + anoPublicacao);
        System.out.printf("\nNúmero de Páginas: " + numPaginas);
        System.out.printf("\nEmprestado: " + emEmprestimo);
    }
    public void emprestar(){
        emEmprestimo = true;
    }
    public void devolver(){
        emEmprestimo = false;
    }
    
    
    
    public static void main(String[] args) {
        Livro AM = new Livro();
        AM.titulo = "A Montanha Magica";
        AM.autor = "Thomas Mann";
        AM.anoPublicacao = 1924;
        AM.numPaginas = 934;
        AM.emprestar();
        AM.exibirDetalhes();
        AM.devolver();
    }
}
