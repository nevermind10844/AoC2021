import java.util.List;

import fun.learn.aoc.LineReader;

public class Main {

	public static void main(String[] args) {
		List<String> strings = LineReader.read("ext/input.txt");

		int sum = 0;

		for (int i = 0; i < strings.size() - 3; i++) {
			int sumA = 0;
			int sumB = 0;
			
			for(int j=0; j<3; j++) {
				sumA += Integer.valueOf(strings.get(i+j));
				sumB += Integer.valueOf(strings.get(i+j+1));
			}
			
			if (sumB>sumA)
				sum++;
		}
		
		System.out.println(sum);
	}
}
