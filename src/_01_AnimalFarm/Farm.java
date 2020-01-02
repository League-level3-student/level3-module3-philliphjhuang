package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[]args){
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Cow());
		farm.add(new Dog());
		farm.add(new Chicken());
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Dog());
		for(int i = 0; i<farm.size();i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
