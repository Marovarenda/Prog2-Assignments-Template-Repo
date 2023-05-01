//mohamed kamal
//202106446
import java.util.Scanner;
public class NewClass5 
{
    public static void main(String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(int i=1 ; i<=x*4 ; i++)
        {
            if(i%4==0)
                System.out.println("PUM");
            else
                System.out.print(i+" ");
        }
    }
}