package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        // Uso do switch
        // imprima o dia da semana, considerando 1 como domingo
        int diaSemana = 5;
        // so pode armazenar -> char, int, byte, short, enum, String
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break; // break -> e para manter a parada de linha, quando Escolher.
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
        char sexo = 'm';
        switch (sexo) {
            case 'm':
                System.out.println("Masculino");
                break;
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo invalido");
                break;
        }

    }
}
