package drawsmiley;
import javax.swing.*;

public class DrawSmileyTest {
	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}
}
