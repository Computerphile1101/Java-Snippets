//OBJECT CLASS

import java.awt.*;
import java.util.*;
public class RandomWalker {

	int x;
	int y;
	int steps;
	
	public RandomWalker() {
		x = 0;
		y = 0;
		steps = 0;
	}
	
	public void move() {
	 
		Random rand = new Random();
		int number = rand.nextInt(4)+1;
		if(number==1) {
			x-=1;//left
		}else if(number==2){
			x+=1;//right
		}else if(number==3){
			y-=1;//up
		}else if(number==4) {
			y+=1;//down
		}
		steps++;	
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSteps() {
		return steps;
	}
	
}



//EXECUTABLE FILE

public class TestRandomWalker {
    public static final int STEPS = 500;
    
    public static void main(String[] args) {
        RandomWalker walker = new RandomWalker();
        
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        
        // advanced features -- center and zoom in the image
        panel.getGraphics().translate(250, 250);
        panel.getGraphics().scale(4, 4);
        
        // make the walker walk, and draw its movement
        int prevX = walker.getX();
        int prevY = walker.getY();
        for (int i = 1; i <= STEPS; i++) {
            g.setColor(Color.BLACK);
            g.drawLine(prevX, prevY, walker.getX(), walker.getY());

            walker.move();
            prevX = walker.getX();
            prevY = walker.getY();
            
            g.setColor(Color.RED);
            g.drawLine(prevX, prevY, walker.getX(), walker.getY());

            int steps = walker.getSteps();
            if (steps % 10 == 0) {
                System.out.println(steps + " steps");
            }
            
            panel.sleep(100);
        }
    }
}
