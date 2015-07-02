package com.tut6.kay;

public class Aufgabenblatt6 implements Runnable
{
	private String message;

	public Aufgabenblatt6(String message) {
		this.message = message;
	}


	  @Override 
	  public void run() {
	    for ( int i = 0; i < 5; i++ )
	      System.out.println(message);
	  }
}


Thread faden1 = new Thread(new Aufgabenblatt6("Ich bin faden111111"));
faden1.start();

Thread faden2 = new Thread(new Aufgabenblatt6("Ich bin faden222222###"));
faden2.start();


Ausgabe:
Ich bin faden111111
Ich bin faden222222###
Ich bin faden222222###
Ich bin faden111111
Ich bin faden222222###
Ich bin faden111111
Ich bin faden111111
Ich bin faden222222###
Ich bin faden111111
Ich bin faden222222###

