public class Sumarray {

	public static void main(String[] args) {
		int sum=0;
		int c=0;
		int a[]= {10, 20, 30};
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
		
			System.out.print("="+sum);
		}

	}

