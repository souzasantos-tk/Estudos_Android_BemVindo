import java.util.Scanner;

public class BemVindo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String name = scanner.nextLine();

        System.out.println("Bem Vindo "+name);
    }
}
