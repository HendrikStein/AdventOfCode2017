package aoc.day1;

import java.io.File;
import java.io.IOException;
import java.text.StringCharacterIterator;

import org.apache.commons.io.FileUtils;

public class Runner {

	public static void main(String[] args) throws IOException {
		String input = FileUtils.readFileToString(new File("src//main//resources//day1.input"), "UTF-8");

		task1(input);

		int half = input.length() / 2;
		task2(input.substring(0, half), input.substring(half, input.length()));

	}

	private static void task2(String list1, String list2) {
		int sum = 0;

		for (int i = 0; i < list1.length(); i++) {
			int currentList1 = Character.getNumericValue(list1.charAt(i));
			int currentList2 = Character.getNumericValue(list2.charAt(i));

			if (currentList1 == currentList2) {
				sum += currentList1 + currentList2;
			}
		}

		System.out.println("Summe Task 2: " + sum);
	}

	private static void task1(String input) {
		StringCharacterIterator iterator = new StringCharacterIterator(input);
		int sum = 0;
		for (int i = 0; i < input.length() - 1; i++) {

			int current = input.charAt(i);
			int next = input.charAt(i + 1);
			if (current == next) {
				sum += Character.getNumericValue(input.charAt(i));
			}
		}

		if (iterator.first() == iterator.last()) {
			sum += Character.getNumericValue(iterator.first());
		}

		System.out.println("Summe Taks 1: " + sum);
	}

}