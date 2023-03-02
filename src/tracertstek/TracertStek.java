package tracertstek;

import java.util.Scanner;

public class TracertStek {

    public static int fact(int n){
        System.out.println("factorial"+n+":");
        Throwable t=new Throwable();
        StackTraceElement[] frames=t.getStackTrace();
        for(StackTraceElement f:frames){
            System.out.println(f);
        }
        int r;
        if(n<=1) r=1;
        else r=n*fact(n-1);
        System.out.println("return"+r);
        return r;
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=in.nextInt();
        fact(n);
    }
    
}
