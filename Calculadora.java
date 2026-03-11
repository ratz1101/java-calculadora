import java.util.Scanner;

public class Calculadora {

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        double numero1 = lerNumero(scanner, "Digite o primeiro número: ");
        double numero2 = lerNumero(scanner, "Digite o segundo número: ");

        int operacao = lerOperacao(scanner);

        calcularResultado(numero1, numero2, operacao);

        scanner.close();
    }

    private double lerNumero(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    private int lerOperacao(Scanner scanner) {
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        return scanner.nextInt();
    }

    private void calcularResultado(double n1, double n2, int operacao) {

        if (operacao == 1) {
            System.out.println("Resultado: " + somar(n1, n2));
            return;
        }

        if (operacao == 2) {
            System.out.println("Resultado: " + subtrair(n1, n2));
            return;
        }

        if (operacao == 3) {
            System.out.println("Resultado: " + multiplicar(n1, n2));
            return;
        }

        if (operacao == 4) {
            dividir(n1, n2);
            return;
        }

        System.out.println("Operação inválida.");
    }

    private double somar(double a, double b) {
        return a + b;
    }

    private double subtrair(double a, double b) {
        return a - b;
    }

    private double multiplicar(double a, double b) {
        return a * b;
    }

    private void dividir(double a, double b) {

        if (b == 0) {
            System.out.println("Erro: divisão por zero.");
            return;
        }

        System.out.println("Resultado: " + (a / b));
    }
}