
public class SwapOf2Elements {
	public static void Swap(Integer [] main,int i,int j)
	{
	
		int m;
		m=main[i];
		main[i]=main[j];
		main[j]=m;}
	

	public static void main(String[] args)
	{
		Integer[] list= {1,2,3,4,5};
		Swap(list,3,4);
		for(Integer i:list)
			System.out.print(i+" ");
	}
}

