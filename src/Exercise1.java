//Exercise 1
//Write the simplest Java method that would have 𝑂(𝑁3) time complexity, where 𝑁 is the single
//input parameter to the method.
import java.util.Scanner;
public class Exercise1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int inputN;
		System.out.print("Enter something: ");
		inputN = scan.nextInt();
		scan.close();
		System.out.println("0(N3) time complexity is: " + getTime(inputN));
	}
	public static int getTime(int N)
	{
		int nTime = 0; 
		for(int i = 0; i < N; i++ )
			for(int j = 0; j < N; j++)
				for(int k = 0; k < N; k++)
					nTime++;
		return nTime;
	}
}
