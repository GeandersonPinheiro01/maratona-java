package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioEstruturaRepeticao02 {
    public static void main(String[] args) {
        //Exercicio Imprima todos os números pares de 0 até 1000000

        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
