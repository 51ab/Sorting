
import java.util.Scanner;
class partition{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{ a[i]=sc.nextInt();
		}
		int l=0,h=n-1;
		int pivot=sc.nextInt();
		parti(a,pivot,l,h);
		
		print(a);
		
	}
	public static int parti(int[] a,int pivot,int l,int h)
	{
			
		int i=l,j=l;
		int n=a.length;
		while(i<=h)
		{
			if(a[i]<pivot)
			{
				int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
				i++;
				j++;
			}
			
			else 
			{
			i++;}
		}
	
		
		return (j-1);
	}
	
	public static void print(int[] a)
		{
			int n=a.length;
			for(int i=0;i<n;++i)
			{
				System.out.print(a[i] +" ");
			}
		}
}
			
