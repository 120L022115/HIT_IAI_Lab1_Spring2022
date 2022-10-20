package action;

import app.Window;
import items.Box;
import items.Monkey;
import usage.Map;

public class GoBoxPos extends Action {

	public GoBoxPos(Map m,Window w) {
		super(m,w);
	}

	@Override
	protected void dothis() {
		var m = super.map.getFirstItemById("Monkey");
		var x = super.map.getFirstItemById("Box");
		if(m instanceof Monkey && x instanceof Box) {
			var mk = (Monkey) m;
			var bx = (Box) x;
			log(mk.toString()+" goto the "+bx.toString()+" position ");
			log(((Monkey) m).move(x.pos()));
			log(".\n");
		}
	}

}
