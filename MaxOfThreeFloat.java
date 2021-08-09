
public class MaxOfThreeFloat {

	public static void main(String[] args) {
		Float firstNum = 15.8f;
		Float secondNum = 19.8f;
		Float thirdNum = 22.7f;

		if (firstNum.compareTo(secondNum) == 1 && firstNum.compareTo(thirdNum) == 1) {
			System.out.println(firstNum + " is Greatest");
		} else if (secondNum.compareTo(firstNum) == 1 && secondNum.compareTo(thirdNum) == 1) {
			System.out.println(secondNum + " is Greatest");
		} else {
			System.out.println(thirdNum + " is Greatest");
		}

	}

}
