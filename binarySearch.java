
import java.util.Scanner;
class binarySearch{
	public static void main(String...args)
	{Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int item=sc.nextInt();
		int first=0;
		int last=n-1;
		int middle=(first+last)/2;
  while( first <= last )
      {
         if ( a[middle] < item )
           first = middle + 1;
         else if ( a[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}
