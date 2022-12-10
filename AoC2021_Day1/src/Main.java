import java.util.List;

import fun.learn.aoc.LineReader;

public class Main {

	public static void main(String[] args) {
		List<String> strings = LineReader.read("ext/input.txt");

		int sum = 0;

		for (int i = 0; i < strings.size() - 1; i++) {
			if (Integer.valueOf(strings.get(i + 1)) > Integer.valueOf(strings.get(i)))
				sum++;
		}

		System.out.println(sum);
	}
}
