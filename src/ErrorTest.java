import java.util.Scanner;

public class ErrorTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        int name = input.next();

        System.out.println("Digite sua idade");
        String age = input.nextInt();

        System.out.println("Aluna: %s, Idade: %d", name, age);
    }
}
