import java.util.Scanner;
class task2B
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	int count=0;
	long d=0;
	while(n!=0)
	{
		d=n%10;
		if(d==4)
		{
			count+=1;
		}
		n=n/10;
	}
	System.out.println(count);
}
}