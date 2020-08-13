//O(logN)
public class Exercise3 
{
	public static void main(String[] args) 
	{
		int N = 6; 
		System.out.println(bar(N));
	}
	static int bar(int N) 
	{
		 int result = 1;
		 for (int i=1; i< N; i*=2) // <-- O(logN)
			 result+=2;
		 return result;
	}
}
//The loop variable i is multiplied by a constant number 2. Therefore, The time complexity is O(logN)