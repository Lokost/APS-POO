package livraria;

public class Revista extends Base {

     private int numero_edicao;
     private String data_lancamento;

     public Revista(String nome, String editora, String data_lacamento, int paginas, int numero_edicao, int data_lancamento) {

        this.nome = nome;
        this.editora = editora;
        this.paginas = paginas;
        this.aberto = false;
        this.atPag = 1;
        this.numero_edicao = numero_edicao;
        this.data_lancamento = data_lacamento;
    }

     public void inforev(){
        System.out.println("Numero da edição: " + this.numero_edicao);
        System.out.println("Data de lançamento: " + this.data_lancamento);

     }

}