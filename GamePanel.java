import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener{
	
	public static final int GROUNDWIDTH = 269;
	public static final int GROUNDHEIGHT = 65;
	private ImageIcon character;
	private ImageIcon ground;
	private int charxPos;
	private int charyPos;
	private Timer timer;
	private int delay = 100;
	
	private boolean right = false;
	private boolean left = false;
	GamePanel(){
		setSize(1024, 600);
		setBackground(new Color(0xADD8E6));
		ground = new ImageIcon("ground.png");
		character = new ImageIcon("Character.png");
		charxPos = 0;
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
	
	
	}
	public void paint(Graphics g){
		for(int i=0; i<3; i++){
			ground.paintIcon(this, g, i * (GROUNDWIDTH+150),(600-GROUNDHEIGHT-20));
			
		
		}
		character.paintIcon(this, g, charxPos, (600-GROUNDHEIGHT-90));
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {

		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("True");
			//right = true;
			//left = false;
			charxPos += 10;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			//left = true;
			//right = false;
			charxPos -= 10;
		}
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
	
	}
	

}
