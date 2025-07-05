package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadiCompraBebida = idade>=18;

        /* if(isAutorizadiCompraBebida){
            System.out.println("Autortizado compra bebida alcólica");
        }
        // ! (NÃO)
        if(!isAutorizadiCompraBebida){
            System.out.println("Não autorizado");
        } */
           // PARA MELHOR USAR O IF -> SEM CRIA UM LOOP USANDO SO IF.  TEM O ELSE
        if(isAutorizadiCompraBebida){
            System.out.println("Autortizado compra bebida alcólica");
        }else{
            System.out.println("Não autorizado a compra");
        }

    }
}
