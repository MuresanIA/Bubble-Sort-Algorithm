
public class ArrayStructures2 {

	private int[] theArray = new int[50];

	private int arraySize = 10;

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printHorzArray(int i, int j) {

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + theArray[n] + " ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING

			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		if (i != -1) {

			// ADD THE -1 TO FIX SPACING

			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();

	}

	public void bubbleSort() {

		for (int i = arraySize - 1; i > 1; i--) {

			for (int j = 0; j < i; j++) {

				if (theArray[j] > theArray[j + 1]) {

					swapValues(j, j + 1);

					printHorzArray(i, j);

				}
				printHorzArray(i, j);

			}

		}

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];

		theArray[indexOne] = theArray[indexTwo];

		theArray[indexTwo] = temp;

	}

	public static void main(String[] args) {

		ArrayStructures2 newArray = new ArrayStructures2();

		newArray.generateRandomArray();

		
		newArray.bubbleSort();

	}
}
