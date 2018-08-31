import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obediant_Robot {
	Robot rob = new Robot();
public static void main(String[] args) {
	Obediant_Robot bob = new Obediant_Robot();
	bob.start();
}
	void start () {
String color = JOptionPane.showInputDialog("What color would you like?");
if (color.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
if (color.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.blue);
}
if (color.equalsIgnoreCase("green")) {
	rob.setPenColor(Color.green);
}
if (color.equalsIgnoreCase("yellow")) {
	rob.setPenColor(Color.yellow);
}
if(color.equalsIgnoreCase("purple")) {
	rob.setPenColor(Color.pink);
}
if (color.equalsIgnoreCase("orange")) {
	rob.setPenColor(Color.orange);
}
String shape = JOptionPane.showInputDialog("What shape would you like?");
if (shape.equalsIgnoreCase("square")) {
	makeSquare();
}
if (shape.equalsIgnoreCase("triangle")) {
	makeTriangle();
}
if (shape.equalsIgnoreCase("circle")) {
	makeCircle();
}
	}
	
void makeSquare() {
	rob.penDown();
	rob.setSpeed(10);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(50);

}
void makeTriangle() {
 rob.penDown();
 rob.setSpeed(10);
 rob.move(100);
 rob.turn(120);
 rob.move(100);
 rob.turn(120);
 rob.move(100);
}
void makeCircle() {
rob.penDown();
rob.setSpeed(10);
for (int i = 0; i<360; i++) {
rob.turn(1);
rob.move(1);
}
}
}
