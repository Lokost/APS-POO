package livraria;

public class Base {
    protected String nome, Edicao, editora, data_lancamento;
    protected int paginas, atPag;
    protected boolean aberto;
    
    // Método abrir, verificando se o livro já está aberto, ou não
    protected void abrirb() {
        if (!aberto) {
            this.aberto = true;
            System.out.println("---- * ----");
            System.out.println("O livro foi aberto.");
        } else {
            System.out.println("---- * ----");
            System.out.println("O livro já está aberto.");
        }
    }
    
    // Método fechar, verificando se o livro já está fechado, ou não.
    protected void fecharb() {
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
    
    protected void irPag(int pag) {
        if (aberto) {
            if (pag < 1) {
                System.out.println("---- * ----");
                System.out.println("Não é possível ir para uma página abaixo de 1");
            } else if(pag > this.paginas) {
                System.out.println("---- * ----");
                System.out.println("O livro não tem essa página");
            } else if (pag == this.atPag) {
                System.out.println("---- * ----");
                System.out.println("O livro já está nessa página");
            } else {
                System.out.println("---- * ----");
                System.out.printf("Avançado da página: %d%n para a página: %d%n" , this.atPag, pag);
                this.atPag = pag;
            }
        } else {
            System.out.println("---- * ----");
            System.out.println("O livro não está aberto para trocar a página.");
        }
    }
}
