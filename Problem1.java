
public class Problem1 {

	public static void main(String[] args) {
		int oranges = 100;
		int apples = 0;

		int combinationBox = 0;
		int appleBox = 0;
		int orangeBox = 0;

		while (true) {
			if (oranges >= 100 && apples >= 100) {
				combinationBox++;
				oranges -= 100;
				apples -= 100;
			} else if (oranges >= 50) {
				orangeBox++;
				oranges -= 50;
			} else if (apples >= 50) {
				appleBox++;
				apples -= 50;
			} else {
				break;
			}
		}

		System.out.println("Combinations Box= " + combinationBox);
		System.out.println("Apple Box= " + appleBox);
		System.out.println("Orange Box= " + orangeBox);

	}

}
