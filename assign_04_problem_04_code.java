//Mohamed kamal
//20216446


import java.util.*;

public class JavaApplication18 
{
    public static void main(String[] args) 
    {
        int n ;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A= new int[n];
        for(int i =0 ; i<n ; i++)
        {
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
         for(int i =0 ; i<n ; i++)
        {
            System.out.print(A[i] + " ");
            
        }
    }
}
