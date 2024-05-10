import java.util.Scanner;

public class task1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        int[] denominations = {100, 50, 10, 5, 2, 1}; // Array of denominations
	int totalNotes = 0;
        for (int denomination : denominations) 
	{
            totalNotes += change / denomination;
            change %= denomination;
        }
	System.out.println(totalNotes);
    }
}
