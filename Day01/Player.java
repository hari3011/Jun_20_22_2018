//You can have any number of classes or interfaces in a single .java file
//BUT only class can be public and that public class name should be the name of the .java file
//package friendly

package com.gbig.confusion;

interface Guitarist{
	void play();
}
interface Cricketer{
	void play();
}
public class BaseGuitarist implements Guitarist{
	public void play(){
		
	}
}
public class Player{
	public void playGuitar(){
		Guitarist guitarist1 = new Guitarist(){
			public void play(){
				System.out.println("Ting Ting");
			}	
		};
		Guitarist guitarist2 = new Guitarist(){
			public void play(){
				System.out.println("Ting Ting");
			}	
		};
		Guitarist guitarist3 = new Guitarist(){
			public void play(){
				System.out.println("Ting Ting");
			}	
		};
	}
	public void playCricket(){
		Cricketer cricketer = new Cricketer(){
			public void play(){
				System.out.println("Howzzat");
			}
		};
		Cricketer cricketer2 = new Cricketer(){
			public void play(){
				System.out.println("Howzzat");
			}
		};
		Cricketer cricketer3 = new Cricketer(){
			public void play(){
				System.out.println("Howzzat");
			}
		};
	}
}