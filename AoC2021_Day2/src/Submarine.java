
public class Submarine {

	private int distance;
	private int depth;

	public Submarine() {
		this.distance = 0;
		this.depth = 0;
	}

	public int getDistance() {
		return distance;
	}

	public int getDepth() {
		return depth;
	}

	public void goForward(int meters) {
		this.distance += meters;
	}

	public void goUp(int meters) {
		this.depth -= meters;
	}

	public void goDown(int meters) {
		this.depth += meters;
	}

	@Override
	public String toString() {
		return "Submarine [distance=" + distance + ", depth=" + depth + "]";
	}

}
