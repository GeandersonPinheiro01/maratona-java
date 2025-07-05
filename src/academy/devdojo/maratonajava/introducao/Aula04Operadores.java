package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

      // + - / * -> operadores basicos
        int numero1 = 10;
        int numero2 = 20;
        int total = numero1 + numero2;
        //System.out.println(numero1 + numero2);
        System.out.println(total);

     // % -> resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);
        System.out.println();

    // < >  <= >=  !=  == -> operadores logicos (sempre retorna valor booleano)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteVinte);
        System.out.println();

// && (E)  || (OU)  ! (NÃO) d
        int idade = 18;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4600;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3300;
        System.out.println("isDentroMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCinco = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("Da pra compra : " + isPlaystationCinco);
        System.out.println();

    // = += -= *= /= %= -> operador de atribuicao (ter uma maior agilidade na hora de fazer um calculo)
        double bonus = 1000;// 1000
        bonus += 1000;// 2000
        bonus -= 1000;// 1000
        bonus *= 2;// 2000
        bonus /= 2;// 1000
        bonus %= 2;// 0
        System.out.println(bonus);
    // Operadores unarios
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // contador + contador
        --contador;
        ++contador;
        int contador2= 0;
        System.out.println(contador2);
    }
}
