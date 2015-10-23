import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


public class words extends GameDriver{

	Rectangle r1 = new Rectangle(10,10,20,20);
	Rectangle bg = new Rectangle(0,0,600,600);
	Rectangle r2 = new Rectangle(50,20,300,300);
	Rectangle r3 = new Rectangle(0,0,600,600);
	Color c1 = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
	int dx = 0, dy = 0;
	int gravity = 1;
	public void draw(Graphics2D win) {
		win.setColor(Color.WHITE);
		win.fill(bg);
		win.fill(r1);
		dy+=gravity;
		double elasticity = .7; 
		if (r1.getY() > 500){
		dy = (int)(-1*dy*elasticity);
		}
	
		while(dx==0&&(int)(r1.getY())<200){
			dx=10;
		}
		
	/*	if(dy==0 && (int)(r1.getY())>=500){
			dx/=2;
			while(dx !=0){
				dx/=2;
			}
		}*/
		
		if(dy!=0&&(r1.getX() > 550 || r1.getX() < 10)){
			//c1 = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			dx = -dx;
			//win.setColor(c1);
			//win.fill(r1);
		}
		if(r1.getY() > 600 || r1.getY() < 10){
			//c1 = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			dy = -dy;
			// win.setColor(c1);
			// win.fill(r1);
		}
	
		r1.translate(dx, dy);
		win.setColor(c1);
		 win.fill(r1);
			win.drawImage(swamp, null, (int)bg.getX(), (int)bg.getY());
		win.drawImage(mike, null, (int)r1.getX(), (int)r1.getY());
		if(r1.getX()>700){
			win.drawString("RIP SULLEY", 300, 300);
			win.drawString("high schore:"+(int)(Math.random()*100+1), 289, 313);
			bg.translate(0, -2);
		}
		int n = 0;
		if(n>10){
			c1= new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			win.setColor(c1);
			win.fill(r3);
		}
		if(bg.getY()<0){
			win.setColor(Color.BLACK);
			win.drawString("GAME OVER", (int)(Math.random()*600), (int)(Math.random()*600));
			n = n+1;
		}
		
	
	
	}
	BufferedImage swamp = null;
	BufferedImage mike = null;
	//constructor
	public words()/*fdsaikillmeashfldsakjhflsajd*/{
		swamp = this.addImage("swamp.jpg");
		mike = this.addImage("mike.jpg");
	}

}
