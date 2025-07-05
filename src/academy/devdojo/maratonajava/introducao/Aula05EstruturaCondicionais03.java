package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        // operador tenario -> SINTAXE (condicao) ? verdadeiro : falso;
        // Doar ser salario > 5000
        double salario = 5000;
        String resultado = (salario > 5000) ? "Doar para o devDojo" : "Não doar agora!";

       System.out.println(resultado);


        // Operador ternario, usando o EXEMPLO ANTERIOR (Não e bom fazer)
        //idade< 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto

        int idade = 15;
        String resultado1 = (idade < 15) ? "categoria infatil" : (idade >= 15 && idade < 18) ? "categoria juveneil" : "categoria adulto"; //NÃO E UMA BOA PRATICA FAZER ISSO. E SO UM EXEMPLO PARA PRATICAR.

        System.out.println(resultado1);
    }
}


