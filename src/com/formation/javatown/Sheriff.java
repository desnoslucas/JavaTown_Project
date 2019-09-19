package com.formation.javatown;

public class Sheriff extends Cowboy{

	private int nbArrest;
	private String adjective;
	
	public Sheriff(String name){
		super(name);
		this.nbArrest=0;
		this.adjective= "honnete";
	}

	public void arrest (Outlaw thief){
		this.talk("Au nom de la loi, je vous arrete!");
		thief.jailled(this);
	}
	
	public void search (Outlaw thief){
		System.out.println(this.getName()+" placarde une affiche dans toute la ville");
		this.talk("OYEZ OYEZ BRAVE GENS!! "+ thief.getRewardValue()+"$ à qui arretera"+ thief.sayName()+" le brigand mort ou vif!");
	}

	@Override
	public void introduceHimself() {
		super.introduceHimself();
		this.talk("j'ai deja coffré "+ this.nbArrest);
	}

	@Override
	protected String sayName() {
	return "Sheriff "+super.sayName();
	}
	
	
	
}
