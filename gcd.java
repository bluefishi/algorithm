package algorithm;
/*
  iterative version
  
*/
public class gcd {
	
	
	private int computegcd(int m, int n)
	{
		int tempm;
		while(n!=0)
		{
			tempm = m;
			m = n;
			n = tempm % n;
			//computegcd(m,n); 
		}
		return m>0?m:-m;//m,n should be positive integer 
	}
	
	public static void main(String args[])
	{
		gcd testgcd = new gcd();
		int result ;
		result = testgcd.computegcd(2, 20);
		System.out.print(result);
		
	}

}
