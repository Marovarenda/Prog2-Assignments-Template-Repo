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
        for(int i = 1 ; i <=n ; i++)
        {
            for(int j = n ; j >i ; j--)
            {
            System.out.print('*');
            }
                        System.out.println('*');

        }
    }
}
