package academy.devdojo.maratonajava.introducao;

public class Aula03ExercicioTiposPrimitivo {
    public static void main(String[] args) {
        //como fazer um casting
        //int salario = 2000.0D;
        //int salarioo = (int) 2000.0D ;// forcando o java a coloca numero double dentro de um inteiro
        //System.out.println(salarioo);

        /*/ EXERCÍCIO 01: crue variaveeis para campos descritivo abaixo entre <> e imprima a seguinte mansagem:
            EU <nome>, morando no endereço <endereco>,
            confirmo que recebi o salário de <salário>, na data <data>
         /*/
       String nome = "Geanderson";
       String endereço ="Rua ALELUIA";
       double salario = 2000.0D;
       String dataRecebimentoSalario ="26/06/25";
        System.out.println("Eu " + nome + ", moro no endereço " + endereço + " confirmo que recebi o salário de R$" + salario + " ,na data" + dataRecebimentoSalario);
    }
}
