public class average {

	public static void main(String[] args) {
		int sum=0;
		int c=0;
		int a[]= {10, 20, 30, 40, 50};
		System.out.print("sum of arrays=");
		for(int i=0; i<a.length; i++)
		{
			c++;
		sum=sum+a[i];
		if(c==1)
		{
			System.out.print(a[i]);
		}
		else
		{
			System.out.print("+"+a[i]);
		}
		
		}
		    System.out.println("="+sum);
		    float avg = sum/5;
		    System.out.println(" average is:"+  sum/5);
		}
}

		
