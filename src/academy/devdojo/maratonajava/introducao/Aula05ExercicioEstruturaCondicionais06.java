package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioEstruturaCondicionais06 {
    public static void main(String[] args) {
        // utilizando e dados os valores de 1 a 7, imprima se é dia util ou fim de semana
        // cosiderando 1 como domingp
        int diaSemana = 3;
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Dia da Semana Invalido");
                break;
        }
    }
}
