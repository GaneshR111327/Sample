import java.util.*;
import javax.swing.*;
public class SwingExample extends JFrame {

	/**
	 * @param args
	 */
	JFrame f;
	SwingExample(){
		
		JButton buton=new JButton("Click");
		buton.setBounds(100,100,100,40);
		add(buton);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingExample();
	}

}
