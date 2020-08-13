//O(logN)
public class Exercise3 
{
	public static void main(String[] args) 
	{
		int N = 10; 
		System.out.println(bar(N));
	}
	static int bar(int N) 
	{
		 int result = 1;
		 for (int i=1; i<N; i*=2) // <-- O(logN)
		 {
			 result+=2;
			 System.out.println(result);
		 }
		 return result;
	}
}
//The time complexity is O(logN)