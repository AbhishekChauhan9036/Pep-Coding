import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int space = n / 2;
    for (int i = 1; i <= n; i++)
    {
      if (i == (n / 2)+1)
      {
        for (int j = 1; j <= n / 2 ; j++)
        {
          System.out.print("*	");
        }
      }
      else
      {
        for (int j = 1; j <= space; j++)
        {
          System.out.print("	");
        }
      }
      if (i <= n / 2)
      {
        for (int j = 0; j < i; j++)
        {
          System.out.print("*	");
        }
      }
      else
      {
        for (int j = 0; j < n - i + 1; j++)
        {
          System.out.print("*	");
        }
      }
      System.out.println();
    }


  }
}
