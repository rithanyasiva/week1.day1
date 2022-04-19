package week1.day2;

public class AmstrongNumber {
public static void main(String[] args) {
	int n=153;
	int d,c,sum=0,r;
	while(n>0)
	{
		r=n%10;
		c=r*r*r;
		sum=sum+c;
		d=n/10;
		n=d;
	}
	System.out.println("Amstrong num is");
	System.out.println(sum);
}
}
