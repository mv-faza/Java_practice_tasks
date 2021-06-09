import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.println("My name is Fazliddin.");
        System.out.println("Guess how old am I?");

        System.out.println("Your guess is :");
        int a=in.nextInt();
        System.out.printf("%d\n",a);
        if (a==20)
            System.out.printf("Yes! You are right!\n");
        else
            System.out.printf("NO! You guess wrong!\n");
        System.out.println("I am 20 years old\n");
        in.close();
    }

}

