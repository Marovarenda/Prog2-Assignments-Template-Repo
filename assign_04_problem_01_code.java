//Mohamed kamal
//20216446
import java.util.*;
public class Assignment_4 {
    public static void main(String[] args) {
        int n ;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] numbers= new int[n];
        for(int i =0 ; i<n ; i++)
        {
            numbers[i]=sc.nextInt();
        }
        for(int i =0 ; i<n ; i++)
        {
            if(numbers[i]>0)
            {
                numbers[i]=1;
            }
            if(numbers[i]==0)
            {
                numbers[i]=0;
            }            
            if(numbers[i]<0)
            {
                numbers[i]=2;
            }
            System.out.print(numbers[i] +" ");

            
        }

        
    }
}