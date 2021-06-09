import java.util.Scanner;

public class FinantialAccount {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("*******FINANCIAL ACCOUNT*******\n");
        System.out.println("1) Enter money.");
        System.out.println("2) Withdraw money.");
        System.out.println("3) My balance.");
        System.out.println("4) Finish process.\n");
        int q;//balans =q
        q=5000;
        int a=in.nextInt();
        if (a==1){
            System.out.println("Would you enter money? Yes! press 1, No! press 2");
            int b=in.nextInt();
            if (b==1){
                System.out.println("Chose the amount that you want transfer");
                System.out.println("$50. $100. $250. $500. $1000");
                int c=in.nextInt();
                System.out.println("Successfully transferred! now your balance:"+c);
            }
            else
                System.out.println("You canceled entering money!");}
        else if (a==2) {
            System.out.println("Do you want withdraw :$____(press 1) or want cancel this process?(press 2) ");
            int m = in.nextInt();
            if (m == 1) {
                System.out.println("Amount of the money than you want withdraw :$");
                int s = in.nextInt();
                System.out.println("Thank you!" + s + " Successfully transferred!");}
            else if (m == 2)
                System.out.println("You canceled entering money!");
        }

        else if (a==3)
            System.out.println("Your current balance is :$" +q);
        else if (a==4)
            System.out.println("Thank you for your trust!");

        in.close();
    /*
        System.out.println("Your current balance is : $0.000");
        System.out.println("Would you enter money? Yes! press 1, No! press 2");
        int a=in.nextInt();
        System.out.printf("%d\n",a);
        if (a==1)
            System.out.println("Chose the amount that you want transfer");

        else
            System.out.println("You cancel it!");


        int b=in.nextInt();
  //      System.out.printf("");
       /* if (a==1)
            System.out.printf("Successfully transferred!");
        else
            System.out.printf("You canceled entering money!");
*/

    }

}
