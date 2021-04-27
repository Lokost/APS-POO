package livraria;

public class Livro extends Base implements Intf_Livro {
    private String autor;
    private String data_lancamento;
    
    Livro(String nome, String autor, String editora,String data_lancamento, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.data_lancamento = data_lancamento;
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
        System.out.println("Editora: " + this.editora);
        System.out.println("Data de lançamento: " + this.data_lancamento);
        System.out.println("Qnt. Páginas: " + this.paginas);
        System.out.println("Aberto: " + abrt);
        System.out.println("Página atual: " + this.atPag);
    }

    @Override
    public void dados() {
        info();
    }

    @Override
    public void abrir() {
        abrirb();
    }

    @Override
    public void abrirpagina(int pagina) {
        abrirb();
        irPag(pagina);
    }

    @Override
    public void fechar() {
        fecharb();
    }
}
