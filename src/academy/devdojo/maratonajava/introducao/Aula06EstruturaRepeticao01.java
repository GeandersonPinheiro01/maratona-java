package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao01 {
    public static void main(String[] args) {
        //while, do-while, for

        int count = 0;
        while (count < 10) {
            System.out.println("contador " + count);
            count++;// -> count = count + 1;
        }

        count = 0;
        do {
            System.out.println("Dentro do-while");//-> basicamente a diferencia de while é do-while.É que o do-while ele imprimi uma vez e depois faz a condicao.
            count++;
        } while (count < 10);

        // for -> for trabalha com indice Sintaxe-> for( INICIO declara uma variavel ; BOOLEAN condicao ;  ATUALIZACAO REPETICAO) EXEMPLO ABAIXO

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+i);
        }
    }
}