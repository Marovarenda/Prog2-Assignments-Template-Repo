//Mohamed kamal
//20216446

import java.util.Scanner;

public class JavaApplication18 
{
    public static void main(String[] args) 
    {
        int n ;
        int f = 0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A= new int[n];
        for(int i =0 ; i<n ; i++)
        {
            A[i]=sc.nextInt();
        }
        int a;
        a=sc.nextInt();
         for(int i =0 ; i<n ; i++)
        {
            if(a==A[i])
            {
                System.out.println(i);
                f=1;
                 break;
            }
        }
         if(f==0)
           System.out.println(-1);
    }
}
