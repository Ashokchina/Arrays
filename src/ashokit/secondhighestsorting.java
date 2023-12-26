package ashokit;

public class secondhighestsorting {

	public static void main(String[] args) {
		int[] array = {9, 2, 5, 1, 7, 3, 8, 6};
int max = Integer.MIN_VALUE;
		        int secondMax = Integer.MIN_VALUE;

		        for (int i = 0; i < array.length; i++) {
		            if (array[i] > max) {
		                secondMax = max;
		                max = array[i];
		            } else if (array[i] > secondMax && array[i] != max) {
		                secondMax = array[i];
		            }
		        }

		        if (secondMax == Integer.MIN_VALUE) {
		            System.out.println("No second highest element found.");
		        } else {
		            System.out.println("The second highest element is: " + secondMax);
		        }
		    }
		

	}


