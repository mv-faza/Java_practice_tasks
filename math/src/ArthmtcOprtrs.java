public class ArthmtcOprtrs {
    public static void main(String[] args){

        int a,b,c;
        a=25;    //этот оператор для вычисления остатка
        b=12;
        c=a%b;
        System.out.println("The answer is:" +c);
        int d;          //инкремент
        d=10;
        System.out.println("Increment=" + d++);  // с правой стороны два плюса значит плюс одни тесть 10+1=11 но в дисплее будет 10
        System.out.println("Increment1=" + ++d);  // с левой стороны два плюса значит 11 + 1 =12
        int e;
        e=10;       // декримент
        System.out.println("Decriment=" + e--);   //10-1=9 но в скрине будет 10
        System.out.println("Decriment1=" + --e);    //9-1=8 и в скрин пойдет 8

        int t;
        t=40;
        System.out.println("40="+Integer.toBinaryString(t));
        System.out.println(t>>2); // shift right and left
        System.out.println(t<<2);
    }
}
