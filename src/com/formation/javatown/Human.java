package com.formation.javatown;

public class Human {
	private String name;
	public String favoriteDrink;
	
	public Human(String name) {
		this.name = name;
		this.favoriteDrink="eau";
	}
	public void talk (String text) {
		System.out.println(this.name + " - " + text );
	}
	
	public void introduceHimself () {
		this.talk("Bonjour ! Mon nom est "+this.sayName()+"\n Ma boisson favorite est "+ this.favoriteDrink );
	}
	
	public void drink() {
		this.talk("Ah ! un bon verre de " + this.favoriteDrink + "! GLOUPS !");
	}
	
	public String getName() {
		return this.name;
	}
	
	protected String sayName() {
		return this.getName();
	}
	
	public String getFavoriteDrink() {
		return this.favoriteDrink;
		
		
	}
}

