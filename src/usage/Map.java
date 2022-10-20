package usage;

import java.util.ArrayList;
import java.util.List;

import items.Item;

public class Map {
	private List<Item> items;
	public Map() {
		items = new ArrayList<>();
	}
	public List<Item> items() {
		return items;
	}
	public void add(Item item) {
		items.add(item);
	}
	public Item getFirstItemById(String ID) {
		var i = items.iterator();
		while(i.hasNext()) {
			var d = i.next();
			if(d.id().equals(ID)) return d;
		}
		return null;
	}
	public String toString() {
		return items.toString();
	}
}
