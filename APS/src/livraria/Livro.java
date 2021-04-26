package livraria;

public class Livro extends Base implements Interface {
    private String autor;
    
    Livro(String nome, String autor, String editora, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.aberto = false;
        this.atPag = 1;
    }
    
    private void info() {
        String abrt;
        if (this.aberto) {
            abrt = "Sim";
        } else {
            abrt = "Não";
        }
        
        System.out.println("---- * ----");
        System.out.println("Informações do livro:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor(a): " + this.autor);
        System.out.println("Qnt. Páginas: " + this.paginas);
        System.out.println("Aberto: " + abrt);
        System.out.println("Página atual: " + this.atPag);
    }

    @Override
    public void dadosLivro() {
        info();
    }

    @Override
    public void abrirlivro() {
        abrir();
    }

    @Override
    public void abrirpagina(int pagina) {
        abrir();
        irPag(pagina);
    }

    @Override
    public void fecharlivro() {
        fechar();
    }
}
