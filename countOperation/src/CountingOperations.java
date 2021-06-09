import java.util.Scanner;
public class CountingOperations {
    public static void main(String[] args){
        int a,b,c,Sum;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number:");
        a=in.nextInt();
        System.out.println("Enter number:");
        b=in.nextInt();
        System.out.println("Enter number:");
        c=in.nextInt();
        System.out.printf("Your numbers are: a=%d,b=%d and c=%d\n",a,b,c);
        Sum=a+b+c;
        System.out.println("This is the answer of the sum of three numbers" +Sum);
        Sum=a-b-c;
        System.out.println("This is the answer of the subtraction of three numbers" +Sum);
        Sum=a*b*c;
        System.out.println("This is the answer of the multiplication of three numbers" +Sum);
        Sum=a/b/c;
        System.out.println("This is the answer of the decision of three numbers" +Sum);
        in.close();

    }
}

