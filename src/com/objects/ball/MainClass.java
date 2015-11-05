package com.objects.ball;

public class MainClass {

	public static void main(String[] args) {
		Ball myBall = new Ball();
		myBall.bouncy = true;
		myBall.color = "Blue";
		myBall.weight = 6;
		
		myBall.bounce();
				
		Ball newBall = new Ball();
		newBall.bouncy = false;
		newBall.color = "Red";
		newBall.weight = 3;
		
		newBall.bounce();

	}

}
