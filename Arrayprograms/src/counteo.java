
public class counteo {

	public static void main(String[] args) {
		int a[]= {11, 12, 13, 14, 15};
		int c1=0,c2=0;
		for(int i=0; i<a.length; i++)
		{
			if( a[i]%2 == 0)
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
		System.out.println("count of even numbers:" + c1);
		System.out.print("count of odd numbers:" + c2);
	}
}

