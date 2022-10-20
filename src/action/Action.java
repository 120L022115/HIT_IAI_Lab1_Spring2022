package action;

import java.util.ArrayList;
import java.util.List;

import app.Window;
import usage.Map;

public abstract class Action {
	private List<Action> pre;
	protected Map map;
	protected Window win;
	public Action(Map m,Window w) {
		this.map = m;
		win = w;
		setPre(new ArrayList<>());
	}
	protected void setPre(List<Action> pre) {
		this.pre = new ArrayList<>(pre);
	}
	public void doAct() {
		var i = pre.iterator();
		while(i.hasNext()) {
			var d = i.next();
			d.doAct();
		}
		dothis();
	}
	protected abstract void dothis();
	protected void log(String str) {
		System.out.print(str);
		win.add(str);
	}
	protected void log(boolean str) {
		System.out.print(str);
		win.add(Boolean.toString(str));
	}
}
