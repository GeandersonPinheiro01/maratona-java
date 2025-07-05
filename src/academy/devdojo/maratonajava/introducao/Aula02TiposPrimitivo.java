package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivo {
    public static void main(String[] args) {
        //tipos Primitivos : int, double, float , char, byte , short , long , boolean
        //como de declara uma variavel TIPO NOME = VALOR;

        int idade = 10; // int e entre -2,147,483,648 e +2,147,483,648
        double salarioDouble = 2000; //double e entre 1,7e-038 e 1,7e+38
        float salarioFloat = 2500;//float e entre 3.4e-038 e 3.4e+038
        byte idadeByte = 10;//byte e entre -127 e 128
        short idadeShort = 10;//-32.768 e +32.768
        boolean verdadeiro = true;//verdade ou falso(true ou false)
        boolean falso = false;//verdade ou falso(true ou false)

        char caractere = 'm'; //uma caractere (basicamente pega uma letra)
        String conjuntosDeCaractere = "geanderson";// diferenca entre char e String

        //System.out.println(); COMANDO DE SAÍDA DE DADOS;
        System.out.println("minha idade é " + idade);// "+" e usado pra fazer uma junção
        System.out.println("meu salario é " + salarioDouble);
        System.out.println("meu salario é " + salarioFloat);
        System.out.println("minha idade é " + idadeByte);
        System.out.println("minha idade é " + idadeShort);
        System.out.println("valor é " + verdadeiro);
        System.out.println("valor é " + falso);
        System.out.println("sexo é " + caractere);
        System.out.println("qual seu nome " + conjuntosDeCaractere);

    }
}


