import java.util.List;

import fun.learn.aoc.LineReader;

public class Main {

	public static void main(String[] args) {
		List<String> strings = LineReader.read("ext/input.txt");
		
		Submarine sub = new Submarine();
		
		for (String string : strings) {
			String[] splitCmd = string.split(" ");
			switch (splitCmd[0]) {
			case "forward":
				sub.goForward(Integer.valueOf(splitCmd[1]));
				break;
			case "up":
				sub.goUp(Integer.valueOf(splitCmd[1]));
				break;
			case "down":
				sub.goDown(Integer.valueOf(splitCmd[1]));
				break;
			default:
				break;
			}
		}
		
		System.out.println(sub.getDepth() * sub.getDistance());
	}

}
