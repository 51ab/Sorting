import java.util.Scanner;
class InsertionSort{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		inser(a);
		print(a);
	}
		public static void inser(int[] a)
		{
			int n=a.length;
			for(int i=1;i<n;i++)
			{
				int temp=a[i];
				int j=i-1;
				while(j>=0 && a[j]>temp)
				{
					a[j+1]=a[j];
				j--; }
				a[j+1]=temp;
				
		}}
		public static void print(int[] a)
		{
			int n=a.length;
			for(int i=0;i<n;++i)
			{
				System.out.print(a[i] +" ");
			}
		}
		}
		
		