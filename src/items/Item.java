package items;

import usage.Position;

public abstract class Item {
	private Position position;
	private String ID;
	public Item(Position p,String ID){
		this.position = p;
		this.ID = ID;
	}
	public Position pos() {
		return position;
	}
	public String id() {
		return ID;
	}
	public String toString() {
		return ID+position.toString();
	}
	protected boolean move(Position p) {
		this.position = p;
		return true;
	}
}
