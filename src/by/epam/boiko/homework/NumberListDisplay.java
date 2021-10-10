package by.epam.boiko.homework;

import java.util.Scanner;

public class NumberListDisplay {
	
	public NumberListDisplay() {
		
	}

	public void printResult(NumberList numberList) {
		
		System.out.println(numberList.toString());
		System.out.println("Min + max = " + numberList.sumMinAndMax(numberList));
		
	}
	
	public String setGenerationType() {
		System.out.println("Select NumberList generation (input 1 for random generation // another key for read from console)");
		String command;
		Scanner getCommand = new Scanner(System.in);
		if (getCommand.nextLine().equals("1")) {
			command = "1";
		} else {
			command = "console";
		}
		return command;
	}

}
