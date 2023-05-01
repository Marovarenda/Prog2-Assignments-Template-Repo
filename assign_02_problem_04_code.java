//mohamed kamal
//202106446
import java.util.Scanner;
public class NewClass5 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0)
        {
            int num,x=0;
            num = sc.nextInt();
            for(int i=1 ; i<= num ; i++)
            {
                if( num % i == 0 )
                    x++;
            }
            if (x==2)
                System.out.println("Prime");
            else
                System.out.println("Not");
        }  
    }
}
