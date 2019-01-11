package hackerrank;

/*https://www.hackerrank.com/snippets/011a3cf1-e814-4f70-953e-0527681e2b31/trusohamns-snippet-from-new-year-chaos
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NewYearChaos {


	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int bribes = 0;
		int index = q.length-1;

		while(index!= 0) {
			if(index+1 == q[index]) index--;
			else if (index>1 && index+1 == q[index-2]) {
				System.out.println("switching " + q[index] + " and " + q[index-2]);
				int digit1 = q[index];
				int digit2 = q[index-1];
				int digit3 = q[index-2];
				q[index] = digit3;
				q[index-1] = digit1;
				q[index-2] = digit2;
				bribes=bribes+2;
				index--;
			}
			else if (index+1 == q[index-1]) {
				System.out.println("switching " + q[index] + " and " + q[index-1]);
				int temp = q[index];
				q[index]= q[index-1];
				q[index-1] = temp;

				bribes++;
				index--;
			}
			else {
				System.out.println("Too chaotic");
				bribes = -1;
				break;
			}
			System.out.println(Arrays.toString(q));
		}
		if(bribes!=-1)System.out.println(bribes);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}

