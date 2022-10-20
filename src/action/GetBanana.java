package action;

import java.util.List;

import app.Window;
import items.Banana;
import items.Monkey;
import usage.Map;

public class GetBanana extends Action {

	public GetBanana(Map m,Window w) {
		super(m,w);
		super.setPre(List.of(new Climb(map,w)));
	}

	@Override
	protected void dothis() {
		var m = super.map.getFirstItemById("Monkey");
		var b = super.map.getFirstItemById("Banana");
		if(m instanceof Monkey && b instanceof Banana) {
			var mk = (Monkey) m;
			var ba = (Banana) b;
			log(mk.toString()+" grasp the "+b.toString()+" ");
			log(mk.grasp(ba));
			log(".\n");
		}
	}

}
