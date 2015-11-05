package com.objects.ball;

public class Ball {

	
		 Boolean bouncy = true;
		 String color = "";
		 int weight = 5;
		 
		 
		 public void bounce() {
			if (bouncy == true) {
				System.out.println("The " + color + " ball that weighs " + weight + " ounces is bouncing!");
				
			}else {
				
				System.out.println("That Ball can't bounce!");
			}
			 
			 
		 }
		 
		 

	

}
