package livraria;

public class Main {
    public static void main(String[] args) {

            Livro l1 = new Livro("Harry Potter", "JK Rolling", "Record", 390);
            l1.dadosLivro();
            l1.abrirpagina(105);
            l1.dadosLivro();
            l1.fechar();
            l1.dadosLivro();
            
            Revista veja = new Revista("Nome revista","veja","27/04/2021",100,1);
            veja.abrir();
            veja.irPag(107);
            veja.fechar();
            veja.inforev();

            Gibi g1 = new Gibi("Turma da Monica","Mauricio de Souza", "Panini", 70);
            g1.info();
    }




}
