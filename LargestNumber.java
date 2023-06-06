import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int arr[]=new int[N];
        int x=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                x=arr[i+1];
            }
            else
            {
                x=arr[i];
            }
        }
        System.out.println(x);

    }
}
