package livraria;
public class Revista extends Livro{
    public Revista(String nome, String autor, String editora, int paginas) {
      
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.aberto = false;
        this.atPag = 1;
        
    }
    public void abrir() {
        if (!aberto) {
            this.aberto = true;
            System.out.println("---- * ----");
            System.out.println("O livro foi aberto.");
        } else {
            System.out.println("---- * ----");
            System.out.println("O livro já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            this.aberto = false;
            System.out.println("---- * ----");
            System.out.println("O livro foi fechado.");
            this.atPag = 1;
        } else {
            System.out.println("---- * ----");
            System.out.println("O livro já está fechado.");
        }
    }

    public void info() {
        System.out.println("---- * ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Nº de páginas: " + this.paginas);
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Página atual: " + this.atPag);
    }

    public void irPag(int pag) {
        if (pag < 1) {
            System.out.println("---- * ----");
            System.out.println("Não é possível ir para uma página abaixo de 1");
        } else if(pag > this.paginas) {
            System.out.println("---- * ----");
            System.out.println("O livro não tem essa página");
        } else {
            System.out.println("---- * ----");
            System.out.printf("Avançado da página: %d%n para a página: %d%n" , this.atPag, pag);
            this.atPag = pag;
        }
    
    }
}
