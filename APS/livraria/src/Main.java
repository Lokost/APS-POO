public class Main {
    public static void main(String[] args) {

            Livro l1 = new Livro("Harry Potter", "JK Rolling", "Record", 390);
            l1.info();
            l1.abrir();
            l1.irPag(105);
            l1.info();
            l1.fechar();
            l1.info();
    }
}
