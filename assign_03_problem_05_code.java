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
            int num1 , num2,sum = 0;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int min,max;
            if(num1>num2)
            {
                max=num1;
                min=num2;
            }
            else 
            {
             max=num2;
             min=num1;
            }
            for(int i=min+1 ; i< max ; i++)
            {
                if( i % 2 ==1 )
                    sum+=i;
            }
            System.out.println(sum);
        }  
    }
}
