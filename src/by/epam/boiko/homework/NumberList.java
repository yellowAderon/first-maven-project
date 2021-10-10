package by.epam.boiko.homework;

import java.util.Random;
import java.util.Scanner;

public class NumberList {

	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;

	public NumberList() {

	}

	public NumberList(int firstNumber, int secondNumber, int thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public int getNumberFromConsole() {
		int numberFromConsole;
		Scanner consoleNumberFinder = new Scanner(System.in);
		System.out.print("Input number: ");
		while (!consoleNumberFinder.hasNextInt()) {
			consoleNumberFinder.nextLine();
			System.out.println("Wrong number. Input new number: ");

		}
		numberFromConsole = consoleNumberFinder.nextInt();
		return numberFromConsole;

	}

	public int getPseudorandomNumber() {
		int randomNumber;
		Random randomNumberGenerator = new Random();
		randomNumber = randomNumberGenerator.nextInt(20);
		return randomNumber;
	}

	public NumberList numberListGenerator(String command) {
		NumberList generatedNumberList = new NumberList();
		if (command.equals("1")) {
			generatedNumberList.setFirstNumber(generatedNumberList.getPseudorandomNumber());
			generatedNumberList.setSecondNumber(generatedNumberList.getPseudorandomNumber());
			generatedNumberList.setThirdNumber(generatedNumberList.getPseudorandomNumber());
		} else {
			generatedNumberList.setFirstNumber(generatedNumberList.getNumberFromConsole());
			generatedNumberList.setSecondNumber(generatedNumberList.getNumberFromConsole());
			generatedNumberList.setThirdNumber(generatedNumberList.getNumberFromConsole());
		}
		return generatedNumberList;
	}

	public int comparisonMax(NumberList numberList) {
		int maxNumber;
		int firstNumber, secondNumber, thirdNumber;
		firstNumber = numberList.getFirstNumber();
		secondNumber = numberList.getSecondNumber();
		thirdNumber = numberList.getThirdNumber();
		if (firstNumber > secondNumber & firstNumber > thirdNumber) {
			maxNumber = firstNumber;
		} else if (secondNumber > thirdNumber & secondNumber > firstNumber) {
			maxNumber = secondNumber;
		} else {
			maxNumber = thirdNumber;
		}
		return maxNumber;
	}

	public int comparisonMin(NumberList numberList) {
		int minNumber, firstNumber, secondNumber, thirdNumber;
		firstNumber = numberList.getFirstNumber();
		secondNumber = numberList.getSecondNumber();
		thirdNumber = numberList.getThirdNumber();
		if (firstNumber < secondNumber & firstNumber < thirdNumber) {
			minNumber = firstNumber;
		} else if (secondNumber < thirdNumber & secondNumber < firstNumber) {
			minNumber = secondNumber;
		} else {
			minNumber = thirdNumber;
		}
		return minNumber;
	}

	public int sumMinAndMax(NumberList numberList) {
		int sum;
		sum = numberList.comparisonMax(numberList) + numberList.comparisonMin(numberList);
		return sum;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	@Override
	public String toString() {
		return "[firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", thirdNumber=" + thirdNumber + "]";
	}

}
