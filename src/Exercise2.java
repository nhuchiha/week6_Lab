//O(N) 
public class Exercise2 
{
	public static void main(String[] args) 
	{
		int N = 5; 
		System.out.println(foo(N));
	}
	static int foo(int N) 
	{
		 int result = 0;
		 for (int i=0; i<N; i++) //<--O(N) 
			 result++;
		 for (int j=0; j<1000000; j++) //<-- O(N)
			 result+=j;

		 return result;
	}
}
// The time complexity O(N)