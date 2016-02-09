package it.IndovinaTre;

import java.util.Random;

public class Dice {

	public static int getDice() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int dice = rnd.nextInt(6)+1;
		return dice;
		}

}
