import java.util.Scanner;
import operacao.OperacoesAvancadas;
import operacao.OperacoesBasicas;

public class Calculadora {

    public static void main(String[] args) {
        //variaveis
        Scanner leia = new Scanner(System.in);
        OperacoesBasicas op = new OperacoesBasicas();
        OperacoesAvancadas opera = new OperacoesAvancadas();
        String operacao = "";
        int num1;
        int num2;

        //pedir informações para o usuário
        System.out.println("Informe o primeiro número: ");
        num1 = leia.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = leia.nextInt();

        System.out.println("Informe a operação: ");
        operacao = leia.next();

        if (operacao.equals("somar")) {
            System.out.println(op.somar(num1, num2));
        } else if (operacao.equals("subtrair")) {
            System.out.println(op.subtrair(num1, num2));
        } else if (operacao.equals("dividir")) {
            System.out.println(op.dividir(num1, num2));
        } else if (operacao.equals("multiplicar")) {
            System.out.println(op.multiplicar(num1, num2));

        }else if (operacao.equals("potencia")){
            System.out.println(opera.potencia(num1, num2));
        }

    }
}
