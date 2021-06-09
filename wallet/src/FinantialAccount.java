import java.util.Scanner;

public class FinantialAccount {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int q;//balans =q
        q=5000;
        do{
            System.out.println("*******FINANCIAL ACCOUNT*******\n");
            System.out.println("1) Enter money.");
            System.out.println("2) Withdraw money.");
            System.out.println("3) My balance.");
            System.out.println("4) Finish process.\n");

            int a=in.nextInt();
            if (a==1){
                System.out.println("Would you enter money? Yes! press 1, No! press 2");
                int b=in.nextInt();
                if (b==1){
                    System.out.println("Chose the amount that you want transfer");
                    System.out.println("$50. $100. $250. $500. $1000");
                    int c=in.nextInt();
                    System.out.println("Successfully transferred! now your balance:"+c);
                    System.out.println("");
                }
                else
                    System.out.println("You canceled entering money!\n");}
            else if (a==2) {
                System.out.println("Do you want withdraw :$____(press 1) or want cancel this process?(press 2) ");
                int m = in.nextInt();
                if (m == 1) {
                    System.out.println("Amount of the money than you want withdraw :$");
                    int s = in.nextInt();
                    if (s<=5000)
                        System.out.println("Thank you!" + s + " Successfully transferred!\n");
                    else if (s>=5001)
                        System.out.println("The entered value is unrecognized!\n");
                }
                else if (m == 2)
                    System.out.println("You canceled withdrawing money!\n");
                else if (m>2)
                    System.out.println("The entered value is unrecognized!\n");
            }

            else if (a==3){
                System.out.println("Your current balance is :$" +q);
                System.out.println("\n");}
            else if (a>=4){
                System.out.println("Thank you for your trust!\n\n");
                return;}
            else if (a<=1)
                return;
        } while(true);


    }

}
