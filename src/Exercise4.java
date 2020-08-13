import java.util.Scanner;

public class Exercise4 
{

	public static void main(String[] args) 
	{
		int[] numList = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};
		int left = 0; 
		int right = numList.length - 1; 
		int number = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you want to search in the array: ");
		number = scan.nextInt();
		scan.close();
		
		while (left <= right)
		{
			int middle = (left + right) / 2; 
			if(numList[middle] < number)
			{
				left = middle + 1;
				System.out.println("The middle element: " + numList[middle]);
				System.out.println("Left Bound: " + (middle-1));
				System.out.println("Right Bound: " + (middle+1));
			}
			else if (numList[middle] > number)
			{
				right = middle - 1;
				System.out.println("The middle element: " + numList[middle]);
				System.out.println("Left Bound: " + (middle-1));
				System.out.println("Right Bound: " + (middle+1));
			}
			else if(numList[middle] == number)
			{
					System.out.println("The number is the middle element: " + numList[middle]);
					System.out.println("Left Bound: " + (middle-1));
					System.out.println("Right Bound: " + (middle+1));
					System.out.println("\n!!!Number is found!!!"); 
					break;
			}
		}
	}
}
