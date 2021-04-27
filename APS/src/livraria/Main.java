package livraria;

public class Main {
    public static void main(String[] args) {

            Livro l1 = new Livro("Harry Potter e a Pedra filosofal", "JK Rolling", "Rocco","26/06/1997", 390);
            l1.dados();
            l1.abrirpagina(105);
            l1.dados();
            l1.fechar();
            l1.dados();
            
            Revista veja = new Revista("Recreio Battle Scenes ","Caras","14/09/2017",100,1);
            veja.abrir();
            veja.irPag(107);
            veja.fechar();
            veja.dados();

            Gibi g1 = new Gibi("My Hero Academic", "Vol 1 ", "Kohei Horikoshi", "JBC","03/11/2020", 200);
            g1.dados();
    }




}
