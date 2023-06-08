import java.util.Scanner;
public class Merge
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		int arr3[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length+arr2.length;i++)
		{
			System.out.print("Enter value for array1");
			arr1[i]=s.nextInt();
			System.out.print("Enter value for array2");
			arr2[i]=s.nextInt();
			if(i<=arr1.length)
			{
				arr3[i]=arr1[i];
			}
			else
			{
				arr3[i]=arr2[i];
			}
		}
		for(int i=arr1.length+arr2.length;i>0;i--)
		{
			System.out.print(arr3[i]);
		}
	}
}