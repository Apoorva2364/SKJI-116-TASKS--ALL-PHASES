import java.util.Scanner;
class task2A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int e=0,o=0;
		long d=0;
		while(n!=0)
		{
			d=n%10;
			if(d%2==0)
			{
				e+=d;
			}
			else
			{
				o+=d;
			}
			n=n/10;
		}
		System.out.println(o+" "+e);
	}
}