//O(N) 
public class Exercise2 
{
	public static void main(String[] args) 
	{
		int N = 3; 
		System.out.println(foo(N));
	}
	static int foo(int N) 
	{
		 int result = 0;
		 for (int i=0; i<N; i++) //<--O(N) 
			 result++;
		 for (int j=0; j<1000000; j++) //<-- O(1) 
			 result+=j;

		 return result; 
	}
}
// O(N) + O(1) is still O(N). The time complexity is O(N)