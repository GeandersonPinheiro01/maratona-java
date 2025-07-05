package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        //idade< 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto

        int idade = 17;
        //String categoria; -> deixar o codigo mais limpo.
         if (idade < 15){
             //categoria = "voce pertence ao grupo infantil";
             System.out.println("voce pertence ao grupo infantil ");
         } else if (idade>=15 && idade<18) {
             //categoria = "voce pertence ao grupo juvenil";
             System.out.println("voce pertence ao grupo juvenil");
         }else {
             //categoria = "voce pertence ao gruop adulto";
             System.out.println("voce pertence ao grupo do adulto");
         }
        //System.out.println(categoria);
        }
    }