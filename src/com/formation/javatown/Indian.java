package com.formation.javatown;

public class Indian extends Human {
	
	private int nbFeather;
	private String totem;

	public Indian(String name) {
		super(name);
		this.favoriteDrink="Jus de racine";
		this.nbFeather = 1;
		this.totem = "Coyote";
	}
	
	@Override 
	public void talk (String text) {
		super.talk(text + "Ugh !");
	}
	
	public void scalp () {
		nbFeather ++;
		System.out.println("L'indien " + this.getName() + " a désormais : " + nbFeather + " Plumes !");
	}
}
