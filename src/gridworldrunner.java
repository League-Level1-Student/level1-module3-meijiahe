import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworldrunner {
	public static void main(String[] args) {
		World w=new World();
		w.show();
		Flower f=new Flower();
		f.setColor(Color.pink);
		Bug b = new Bug();
		b.setColor(Color.red);
		b.turn();
		Location l=new Location(6, 5);
		w.add(l, f);
	}
}
