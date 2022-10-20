package items;

import usage.Map;
import usage.Position;

public class Monkey extends Item {
	private Item under = null;
	
	public Monkey(Position p) {
		super(p,"Monkey");
	}
	
	@Override
	public boolean move(Position p) {
		if(under == null) {
			super.move(p);
			return true;
		}
		return false;
			
	}
	
	public boolean push(Box b,Position p) {
		if(super.pos().equals(b.pos())) {
			super.move(p);
			b.move(p);
			return true;
		}
		return false;
	}
	
	public boolean climb(Box b) {
		if(super.pos().equals(b.pos())) {
			b.on(this);
			under = b;
			return true;
		}
		return false;
	}
	
	public boolean grasp(Banana b) {
		if(under instanceof Box && super.pos().equals(b.pos())) {
			return true;
		}
		return false;
	}
	
	public Position watch(Map m) {
		var i = m.items().iterator();
		while(i.hasNext()) {
			var d = i.next();
			if(d instanceof Banana) {
				return ((Banana) d).pos();
			}
		}
		return null;
	}
}
