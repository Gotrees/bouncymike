import javax.swing.JFrame;


public class HelloWindow {
	public static void main(String [] args){
		JFrame window = new JFrame("title");
		window.setSize(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		words m1 = new words();
		window.add(m1);
		window.setVisible(true);

	}
	
}
