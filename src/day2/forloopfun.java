package day2;

import org.jointheleague.graphical.robot.Robot;

public class forloopfun {
public static void main(String[] args) {


int sides =105;
int angle =360/sides;
Robot bob=new Robot();
bob.penDown();
bob.setSpeed(100);
for (int i=0; i <sides; i=i +1){	
   bob.move(angle);
   bob.turn(angle);
}
}
}

	
	
	
	
	
	





