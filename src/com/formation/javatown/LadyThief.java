package com.formation.javatown;

public class LadyThief extends Lady implements Outlaw {

	private String look;
	private int nbKidnappedLadies;
	private int rewardValue;
	private boolean isInJail;
	
	public LadyThief(String name) {
	super(name);
	}
	
	@Override
	public void kidnap(Lady lady) {
		this.talk("Ahah ! " + lady.getName() + ", tu es mienne d�sormais !");
		lady.beKidnapped(this);
		this.nbKidnappedLadies++;
		this.rewardValue = rewardValue + 100;
	}

	@Override
	public void jailled(Cowboy cowboy) {
		this.talk("Damn ! " + cowboy.getName() + ", tu m'a eu !");
		this.isInJail=true;
		System.out.println(cowboy.getName() + " a remport� la prime de " + this.getRewardValue() + "$");
	}
	
	@Override
	public int getRewardValue() {
		return rewardValue;
	}
	
	public boolean getisInJail() {
		return isInJail;
	}
	@Override
	public String sayName() {
		return super.sayName() + " " + this.look ;
	}
	
	@Override
	public void introduceHimself() {
	super.introduceHimself();
	this.talk("j'ai l'air "+this.look+ " et j'ai d�j� kidnapp� "+ this.nbKidnappedLadies+ " dames");
	this.talk("ma t�te est mise � prix � "+this.rewardValue+ "$");
	}
		
		

}
