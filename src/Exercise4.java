import java.util.Scanner;
/* index       0  1   2   3   4   5   6   7   8   9
 * The array: {1, 14, 15, 24, 55, 59, 73, 90, 94, 99}
 * The number needs to search: 73
 * First search: Middle element: list(middle) = list(4) = 55. Its left bound is 0 and its right bound is 9
 * Since the middle number 55 < the searched number 73, we will continue the search with the later half of the array {59, 73, 90, 94, 99}
 * Second search: Middle number: list(middle) = list(7) = 90. Its left bound is 5 and its right bound is 9. 
 * Since the middle number 90 > the searched number 73, we will continue the search with the before half of the array {59,73}
 * The third search: Middle number: list(middle) = list(5) = 59. Its left bound is 5 and its right bound is 6. 
 * Since the middle number 59 < the searched number 73, we will continue the search with the later half of the array {73}
 * The forth search: Middle number: list(middle) = list(7) = 73. If the middle number is equal to the search number, the number is found. 
 */
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
		
		do 
		{
			int middle = (left + right) / 2; 
		    
			if(numList[middle] < number)
			{
				System.out.print("Left Bound: " + left + ". ");
				System.out.print("Right Bound: " + right + ". ");
				left = middle + 1;				
				System.out.println("The middle element: " + numList[middle]);	
			}
			else if (numList[middle] > number)
			{
				System.out.print("Left Bound: " + left + ". ");
				System.out.print("Right Bound: " + right + ". ");
				right = middle - 1;
				System.out.println("The middle element: " + numList[middle]);
			}
			else if(numList[middle] == number)
			{
				System.out.print("Left Bound: " + left + ". ");
				System.out.print("Right Bound: " + right + ". ");
				System.out.println("The middle element: " + numList[middle]);
				System.out.println("\n!!!Number is found!!!"); 
				break;
			}
		}
		while (left <= right);
	}
}
