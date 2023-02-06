import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			// creating Scanner
		System.out.println("Enter the Data: ");
		String user_data = scanner.nextLine();				// Get Data
// Using Split to change String into array, so we don't need to ask user to enter length of array
		String[] raw_data = user_data.split(" ");
		int[] int_data = new int[raw_data.length];			// Convert String type array into integer type
		for (int i = 0; i< raw_data.length; i++){
			int_data[i] = Integer.parseInt(raw_data[i]);
		}

		int sum= 0;											// calculate Sum of array elements
		for (int intDatum : int_data) {
			sum += intDatum;
		}

		int mean = sum/int_data.length;						// calculating mean
		System.out.println("Arithmetic Mean is: " + mean);	// Display mean

	}
}