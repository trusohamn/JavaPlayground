package hackerrank;

import java.util.*;

//https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
public class IceCreamParlor {

	// Complete the whatFlavors function below.
	static void whatFlavors(int[] cost, int money) {
		//binary search
		/*
		for(int i=1; i<cost.length; i++) {
			if(cost[i-1]<money){
				for(int j = i+1;  j<= cost.length; j++) {
					if(cost[i-1] + cost[j-1] == money) {
						System.out.println (i + " " + j);
						return;
					}
				}
			}
		}
		*/
		HashMap<Integer, Integer> map = new HashMap <>();
		for(int i=1; i<cost.length; i++) {
			if(cost[i-1]<money){
				if(map.containsKey(money-cost[i-1])) {
					System.out.println(map.get(money-cost[i-1]) + " " + i);
					return;
				}
				else {
					map.put(cost[i-1], i);
				}	
			}			
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int money = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] cost = new int[n];

			String[] costItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int costItem = Integer.parseInt(costItems[i]);
				cost[i] = costItem;
			}

			whatFlavors(cost, money);
		}

		scanner.close();
	}
}
