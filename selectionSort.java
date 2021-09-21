import java.util.Scanner;
class Selection{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	}
	select(a);
		print(a);}
	
		public static void select(int[] a)
		{
				int n=a.length;
			for(int i=0;i<n;i++)
			{ 
	
				 int min=i;
				for(int j=i+1;j<n;j++)
				
			if(a[min]>a[j])
			
				min=j;
		
			
			
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		public static void print(int[] a)
		{
			int n=a.length;
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+ " ");
			}
}}
				
