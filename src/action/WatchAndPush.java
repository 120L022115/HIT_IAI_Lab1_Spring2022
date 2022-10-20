package action;

import java.util.List;

import app.Window;
import items.Box;
import items.Monkey;
import usage.Map;

public class WatchAndPush extends Action {

	public WatchAndPush(Map m,Window w) {
		super(m,w);
		super.setPre(List.of(new GoBoxPos(m,w)));
	}

	@Override
	protected void dothis() {
		var m = super.map.getFirstItemById("Monkey");
		var x = super.map.getFirstItemById("Box");
		if(m instanceof Monkey && x instanceof Box) {
			var mk = (Monkey) m;
			var bp = mk.watch(map);
			var bx = (Box) x;
			log(mk.toString()+" watched the banana at "+bp.toString()+".\n");
			log(mk.toString()+" push the "+bx.toString()+" to "+bp.toString()+" ");
			log(mk.push(bx, bp));
			log(".\n");
		}
	}

}
