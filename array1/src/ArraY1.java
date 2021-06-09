import java.util.Arrays;
import java.util.Scanner;

public class ArraY1 {
    public static void main (String[] args){
        int a=7;
        int[] b;
        b=new int[3];
        System.out.println(b[0]);
        b[0]=10;
        b[1]=20;
        b[2]=30;
        for (int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }
        int c[]={1,2,3};
        for (int d=0; d<c.length; d++){
            System.out.println(c[d]);
        }
        String[] str1=new String[3];
        str1[0]="Hello";
        str1[1]="you";
        str1[2]="to";
        System.out.println(str1[2]);
        for(String str2:str1){
            System.out.println(str2);
        }
        System.out.println("list of the home pats");
        String[] str3=new String[4];
        str3[0]="dog";
        str3[1]="cat";
        str3[2]="caw";
        str3[3]="fog";
        for (String str4:str3){
            System.out.println(str4);
        }
        int[] e={12,23,43,234,432};
        System.out.println(e[2]);

        int[][]f={
                {1,2,3,4},
                {5,6,7,8},
                {10,11,12,13}
        };
        System.out.println(f[0][0]);
        System.out.println(f[1][3]);//perviy stroka vtoroy kolonna

        int[][] r={{1,4,7},{2,5,8},{3,6,9}};
        for (int t=0; t<r.length;t++){
            for (int s=0; s<r[t].length;s++){
                System.out.println(r[t][s]);
            }
            System.out.println();
        }



    }
}
