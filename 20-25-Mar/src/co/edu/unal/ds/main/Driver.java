package co.edu.unal.ds.main;

import co.edu.unal.ds.pokemon.*;

public class Driver{
	public static void main(String args[]){
		Pokeball<Charmander> pokeball1 = new Pokeball<>(new Charmander());
		FirePokeball<Charmander> fp1 = new FirePokeball<>(new Charmander());
		fp1.rapidFlameThrower();
	}
}
