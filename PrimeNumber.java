package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int n=13;
	boolean flag=false;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			flag=true;
			break;
		}
		else
		{
			flag=false;
		}
		
	}
	if(flag==true)
	{
		System.out.println("Its is a Not Prime Number");
	}
	else
	{
		System.out.println("It is a Prime Number");

	}
}
}
