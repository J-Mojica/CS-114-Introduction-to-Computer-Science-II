public class PS1_Jose_Mojica_Perez
{
	public static void main(String[] args)
	{	
		long startTime = System.currentTimeMillis();
		
		int a = 20000000, b = 20000000;
		int product = Multiply(a,b);
		System.out.println(product);
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " ms");
	
	}
	private static int Multiply(int x, int y)
	{
		if(y == 1)
		{
			return x;
		}
		else
		{
			return x + Multiply(x, y-1);
		}

	} 
}
