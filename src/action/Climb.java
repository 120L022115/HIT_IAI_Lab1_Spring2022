package action;

import java.util.List;

import app.Window;
import items.Box;
import items.Monkey;
import usage.Map;

public class Climb extends Action {

	public Climb(Map m,Window w) {
		super(m,w);
		super.setPre(List.of(new WatchAndPush(m,w)));
	}

	@Override
	protected void dothis() {
		var m = super.map.getFirstItemById("Monkey");
		var x = super.map.getFirstItemById("Box");
		if(m instanceof Monkey && x instanceof Box) {
			var mk = (Monkey) m;
			var bx = (Box) x;
			log(mk.toString()+" climb the "+bx.toString()+" ");
			log(mk.climb(bx));
			log(".\n");
		}
	}

}
