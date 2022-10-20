package app;

import action.Action;
import action.GetBanana;
import items.Banana;
import items.Box;
import items.Monkey;
import usage.Map;
import usage.Position;

public class AIMonkey {
	private static Action act;
	private static Map map;
	public static void init() {
		map = new Map();
		map.add(new Banana(new Position(Math.random()*10,Math.random()*10)));
		map.add(new Box(new Position(Math.random()*10,Math.random()*10)));
		map.add(new Monkey(new Position(Math.random()*10,Math.random()*10)));
	}
	public static void main(String[] args) {
		init();
		var w = new Window();
		w.add(map.toString()+"\n");
		act = new GetBanana(map,w);
		act.doAct();
	}

}
