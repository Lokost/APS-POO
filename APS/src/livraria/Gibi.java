
package livraria;


public class Gibi extends Base{
    String Cartonista;
    Gibi(String nome,String Cartonista, String Editora, int Paginas){
        this.nome = nome;
        this.Cartonista = Cartonista;
        this.editora = Editora;
        this.paginas = Paginas;
        this.atPag = 1;
        this.aberto = false;
               
         
        
    }
   public void info() {
        String abrt;
        if (this.aberto) {
            abrt = "Sim";
        } else {
            abrt = "Não";
        }
        
        System.out.println("---- * ----");
        System.out.println("Informações do Gibi:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cartonista: " + this.Cartonista);
        System.out.println("Qnt. Páginas: " + this.paginas);
        System.out.println("Aberto: " + abrt);
        System.out.println("Página atual: " + this.atPag);
   }
}
