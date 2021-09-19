import java.util.Scanner;
class BubbleSort{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		bubbleSort(a,n);
		printArray(a,n);
	}
		  public static void printArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
	
	
	 public static void bubbleSort(int a[], int n)
	 {
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
	 }
	 }}
	 }
	
		
}
		
