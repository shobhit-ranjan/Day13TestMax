
public class MaxOfThree {

	public static void main(String[] args) {
		Integer firstNum = 15;
		Integer secondNum = 19;
		Integer thirdNum = 22;

		if (firstNum.compareTo(secondNum) == 1 && firstNum.compareTo(thirdNum) == 1) {
			System.out.println(firstNum + " is Greatest");
		} else if (secondNum.compareTo(firstNum) == 1 && secondNum.compareTo(thirdNum) == 1) {
			System.out.println(secondNum + " is Greatest");
		} else {
			System.out.println(thirdNum + " is Greatest");
		}

	}

}
