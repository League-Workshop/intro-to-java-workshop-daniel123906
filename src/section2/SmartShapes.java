package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot Ronald = new Robot ();
Robot.setWindowImage("section2/haha.jpg");
Ronald.changeRobot("http://www.city-data.com/forum/attachments/photography/3686d1179820789-weird-pictures-real-life-beavis.jpg");
        // 3. Put the robot's pen down
Ronald.penDown();


        // 6. Make the robot move as fast as possible
Ronald.setSpeed(100);


        // 5. Use a for loop to repeat everything below 4 times. 
for (int i = 0; i < 360; i++) {

	


        //         2. Move your robot 200 pixels
		Ronald.move(2);

        //         4. Turn the robot 90 degrees to the right
		Ronald.turn(360/360);
    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }}
}

