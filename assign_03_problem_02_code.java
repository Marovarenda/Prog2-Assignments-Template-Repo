//mohamed kamal
//20216446
import java.util.Scanner;
public class NewClass5 
{
    public static void main(String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x==1){
        System.out.print(0);
        }
        else
        {
            int num1 = 0, num2 = 1;
            System.out.print(num1 +" "+ num2 +" ");
            for(int i=2 ; i<x ; i++)
            {
                int y = num1+num2;
                System.out.print(y + " ");
                num1=num2;
                num2=y; 
            }
        }
        
    }
}
