package com.formation.javatown;

public class Cowboy extends Human implements PaleFace{
	private int popularity;
	private String adjective;
	public Cowboy(String name) {
		super(name);
		this.favoriteDrink="whisky";
		this.popularity=0;
		this.adjective="Vaillant";
	}
	public void shootThief(Outlaw thief) {
		System.out.println("Le "+ this.adjective+" "+this.sayName() +" tire sur "+thief.sayName()+ " PAN!");
		this.talk("Prends �a rascal!");
	}
	public void freeLady(Lady lady) {
		this.talk("Que vous �tes belle!!!");
		if (lady.isCaptive()) {
			lady.beFreed(this);
			this.popularity++;
		}else {
			lady.talk("Je suis d�ja libre");
		}
	}
	
	@Override
	public void introduceHimself() {
		super.introduceHimself();	
		this.talk("je suis un cowboy "+this.adjective+"!");
		this.talk("Pour l'instant, j'ai une popularit� de "+this.popularity+".");
	}
	
	@Override
	public void scalpBy(Indian indian) {
		this.talk("A�e ma t�te !!");
	}
}
