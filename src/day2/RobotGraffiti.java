package day2;

import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bob = new Robot();
		// 2. Make the Robot draw the first letter of your name
		bob.penDown();
		bob.setSpeed(100);
		bob.move(200);
	    bob.turn(90);
	    bob.move(120);
	    for (int i=0;i<180;i++){
		    bob.move(2);  
	        bob.turn(1);
	    }
	        bob.move(124); 
            bob.turn(-90);
            bob.move(200);
	        bob.turn(-90);
	        bob.turn(-90);
	        bob.move(200);
	        bob.turn(90);
	        bob.move(150);
	        bob.turn(45);
	        bob.move(200);    
 	} 
}

