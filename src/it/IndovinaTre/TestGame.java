package it.IndovinaTre;

import java.util.Scanner;

public class TestGame {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		Dice dice = new Dice();
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		System.out.println("Quanti soldi vuoi giocare?");
		int money = sc.nextInt();
		player.setCash(money);
		
		do {
			int bet = 0;
			while( player.getCash() > 0 ){
				System.out.println("Inserisci la cifra che vuoi puntare:");
				bet = sc.nextInt();
				player.setBet(bet);
				System.out.println("Inserisci il numero che vuoi indovinare");
				int numberChoose = sc.nextInt();
				
				System.out.println("******************");
				if( dice.getDice() == numberChoose){
					int winDeal = 2 * player.getBet();
					System.out.println("Congratulazioni, hai vinto una cifra pari a:"+ winDeal);
					player.addWin(winDeal);
					player.setTotalWin(winDeal);
					player.addCash(winDeal);
				}else{
					int looseDeal = player.getBet();
					System.out.println("Mi dispiace ma hai perso i tuoi "+ looseDeal);
					player.minusLoose(looseDeal);
					player.setTotalLoose(looseDeal);
					player.reduceCash(looseDeal);
				}
				player.setGame();
				System.out.println("**************************");
				System.out.println("Vuoi continuare a giocare?");
				String continueGame = sc.next();
				if (continueGame.equalsIgnoreCase("no")) {
					condition = true;
					break;
				}
			}
		} while (!condition);
		
		System.out.println("Gioco concluso!");
		System.out.println("Hai giocato "+player.getGame()+" partite");
		System.out.println("Rispetto alla situazione iniziale hai vinto:"+player.getTotalWin());
		System.out.println("Rispetto alla situazione iniziale hai perso:"+Math.abs(player.getTotalLoose()));
		
	}

}
