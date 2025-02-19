import java.util.Scanner;
public class UserEntrance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String name = input.next();

        System.out.println("Digite sua idade");
        int age = input.nextInt();

        System.out.printf("Aluna: %s, Idade: %d", name, age);
    }
}
