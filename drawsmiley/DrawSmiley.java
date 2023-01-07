package drawsmiley;
import java.awt.*;
import javax.swing.*;

public class DrawSmiley extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//drawing the face
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,200,200);
		
		//drawing the eyes
		g.setColor(Color.BLACK);
		g.fillOval(50,60,20,20);
		g.fillOval(140,60,20,20);
		
		//drawing the mouth
		g.setColor(Color.RED);
		g.fillOval(40,120,140,50);
		g.setColor(Color.YELLOW);
		g.fillRect(50, 100, 120, 35);
		g.fillOval(40, 120, 140, 40);

	}
}
