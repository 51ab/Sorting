import java.util.Scanner;
class Josephus
{
public static void main(String...args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	josh(n,k);
	System.out.print(josh(n,k));
}
	static int josh(int n,int k)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (josh(n-1,k)+k-1)%n+1;
	}}
}
