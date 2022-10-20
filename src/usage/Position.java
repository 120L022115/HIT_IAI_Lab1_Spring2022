package usage;

public class Position {
	private int x;
	private int y;
	public Position(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public Position(double x, double y) {
		this.x = (int) Math.floor(x);
		this.y = (int) Math.floor(y);
	}
	public int x() {
		return x;
	}
	public int y() {
		return y;
	}
	public String toString() {
		return "("+Integer.toString(x)+","+Integer.toString(y)+")";
	}
}
