
public class largestnumber {

	public static void main(String[] args) {
		int a[] = {10, 5, -15, 20,-30};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max< a[i])
			{
				max= a[i];
			}
				}
		System.out.print("max:" +max);
	}
	

}
