import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception     {
    
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    pzz(n);
    }

    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
    System.out.print(n+" ");
    pzz(n-1);
    System.out.print(n+" ");
    pzz(n-1);
    System.out.print(n+" ");
        
    }

}
