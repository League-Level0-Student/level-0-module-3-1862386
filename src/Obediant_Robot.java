import org.jointheleague.graphical.robot.Robot;

public class Obediant_Robot {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.setRandomPenColor();
	rob.setSpeed(10);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
}
}
