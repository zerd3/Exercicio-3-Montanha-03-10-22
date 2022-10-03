import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite um número: ");

        Float n1 = console.nextFloat();

        System.out.println("Digite um segundo número: ");

        Float n2 = console.nextFloat();

        System.out.println(n1 + n2);

    }
}
