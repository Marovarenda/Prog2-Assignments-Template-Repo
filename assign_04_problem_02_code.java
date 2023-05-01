//Mohamed kamal
//20216446
import java.util.Scanner;
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
            if(A[i]<=10)
            {
                System.out.println("A[" + i + "] = " + A[i] );
            }
            else
                continue;
        }
        
    }
}
