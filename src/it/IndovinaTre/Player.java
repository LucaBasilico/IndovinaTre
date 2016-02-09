package it.IndovinaTre;

public class Player {
	private int cash;
	private int bet;
	private int game = 0; //I could omit but I prefer to indicate this number
	private int totalWin;
	private int totalLoose;
	
	
	public Player(){
	}
	
	public Player(int cash, int bet) {
		super();
		this.cash = cash;
		this.bet = bet;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public void setBet(int bet) {
		this.bet = bet;
	}
	public int getBet() {
		return bet;
	}
	public void setGame() {
		this.game = this.game + 1;
	}
	public int getGame(){
		return this.game;
	}
	
	
	public int getTotalWin() {
		return totalWin;
	}

	public void setTotalWin(int totalWin) {
		this.totalWin = this.totalWin + totalWin;
	}

	public int getTotalLoose() {
		return totalLoose;
	}

	public void setTotalLoose(int totalLoose) {
		this.totalLoose = this.totalLoose - totalLoose;
	}

	public void addWin(int winDeal) {
		// TODO Auto-generated method stub
		this.cash = this.cash + winDeal;
	}
	public void minusLoose(int looseDeal) {
		// TODO Auto-generated method stub
		this.cash = this.cash - looseDeal;
	}

	public void addCash(int winDeal) {
		// TODO Auto-generated method stub
		this.cash = this.cash + winDeal;
	}

	public void reduceCash(int looseDeal) {
		// TODO Auto-generated method stub
		this.cash = this.cash - looseDeal;
	}

}
