public class Evenodd {
	
	public static void main(String[] args) {
		int a[] = {1, 2, 5, 6, 3, 2};
		System.out.print("odd numbers =");
		for(int i=0; i<a.length; i++)
		{
		if( a[i]%2 != 0)
		{
			System.out.print(a[i]+ " ");
		}
		}
		System.out.println();
		System.out.print("even number =");
		for(int i=0; i<a.length; i++)
		{
		if( a[i]%2 == 0)
		{
			System.out.print(a[i]+ " ");
		}
		}
		
	}
	}
