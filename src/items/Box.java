package items;

import usage.Position;

public class Box extends Item {
	private Item on;
	public Box(Position p) {
		super(p, "Box");
	}
	public void on(Item i) {
		on = i;
	}
	public Item getOnItem() {
		return on;
	}
}
