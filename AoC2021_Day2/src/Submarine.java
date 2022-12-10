
public class Submarine {

	private int distance;
	private int depth;
	private int aim;

	public Submarine() {
		this.distance = 0;
		this.depth = 0;
		this.aim = 0;
	}

	public int getDistance() {
		return distance;
	}

	public int getDepth() {
		return depth;
	}

	public void goForward(int meters) {
		this.distance += meters;
		this.depth += this.aim*meters;
	}

	public void goUp(int meters) {
		this.aim -= meters;
	}

	public void goDown(int meters) {
		this.aim += meters;
	}

	@Override
	public String toString() {
		return "Submarine [distance=" + distance + ", depth=" + depth + "]";
	}

}
