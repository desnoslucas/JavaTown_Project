package com.formation.javatown;

public class History {

	public static void main(String[] args) {
		Human john = new Human("John Smith");
		john.introduceHimself();
		john.drink();
		
		Lady lady = new Lady("Rose");
		lady.introduceHimself();
		lady.changeDress("rouge");
	
		Thief thief = new Thief ("Pablo");
		thief.introduceHimself();
		thief.kidnap(lady);
		
		Barman barman = new Barman("Bob");
		Sheriff clint = new Sheriff ("Clint");
		
		Indian indian = new Indian("Rico");
		
		int a = 0;
		a = thief.getRewardValue();
		System.out.println(a);
		
		Cowboy cowboy = new Cowboy ("John");
		cowboy.introduceHimself();
		thief.jailled(cowboy);
		boolean b = false;
		b = thief.getisInJail();
		System.out.println(b);

		// Un cowboy est un Humain qui est caractérisé
		cowboy.freeLady(lady);
		cowboy.shootThief(thief);
		
		cowboy.sayName();
		thief.introduceHimself();
		lady.introduceHimself();
		cowboy.introduceHimself();
		
		barman.introduceHimself();
		barman.serve(cowboy);
		
		
		clint.introduceHimself();
		clint.arrest(thief);
		
		Outlaw outlaw = new Thief("Michel");
		clint.arrest(outlaw);
		outlaw.kidnap(lady);
		
		Outlaw outlaw1 = new Corrupted("Dalton");
		Corrupted corrupted1 = new Corrupted("Jack");
		
		corrupted1.arrest(outlaw);
		corrupted1.kidnap(lady);
		
		LadyThief ladyThief1 = new LadyThief("Ursula");
		ladyThief1.kidnap(lady);
		lady.scalpBy(indian);
	}

}
