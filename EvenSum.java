/*Write a function in Java that takes an array of integers as input and returns the sum of all the even numbers in the array.
 If the input array is empty or doesn't contain any even numbers, the function should return 0.
 */
import java.util.Scanner;
public class EvenSum
{
    public static int even(int N,int arr[])
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        if(sum!=0) {
            return sum;
        }
        else
        {
            return 0;
        }

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }
        int x=even(N,arr);
        System.out.println(x);

    }
}
