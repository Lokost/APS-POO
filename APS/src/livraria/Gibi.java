
package livraria;


public class Gibi extends Base implements Intf_Gibi {
     String Cartunista;
    
    Gibi(String nome, String Edicao, String Cartunista,String Editora, String data_lancamento, int Paginas){
        this.nome = nome;
        this.Cartunista = Cartunista;
        this.Edicao = Edicao;
        this.editora = Editora;
        this.data_lancamento = data_lancamento;
        this.paginas = Paginas;
        this.atPag = 1;
        this.aberto = false;
               
         
        
    }
   private void info() {
        String abrt;
        if (this.aberto) {
            abrt = "Sim";
        } else {
            abrt = "Não";
        }
        
        System.out.println("---- * ----");
        System.out.println("Informações do Gibi:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Edição: " + this.Edicao);
        System.out.println("Editora: " + this.editora);
        System.out.println("Data de lançamento: " + this.data_lancamento);
        System.out.println("Cartunista: " + this.Cartunista);
        System.out.println("Qnt. Páginas: " + this.paginas);
        System.out.println("Aberto: " + abrt);
        System.out.println("Página atual: " + this.atPag);
        
   }

    @Override
    public void dados(){
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
