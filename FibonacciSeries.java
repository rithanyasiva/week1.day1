package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n=5,f=0,s=1,sum=0;
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(f);
			sum=f+s;
			f=s;
			s=sum;
			
		}
		
	}
	

}
