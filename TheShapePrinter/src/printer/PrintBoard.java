package printer;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;

import drawingboard.DrawingBoard;


public class PrintBoard extends JFrame {
	 private DrawingBoard surface;
	 private static final int FRAME_THIKNESS_X = 17, FRAME_THICKNESS_Y = 40;
	 public PrintBoard() {
	        initUI();
	    }

	    private void initUI() {
	    	surface = new DrawingBoard();
	        add(surface);
	        surface.drawCircle();
	        setTitle("Simple Java 2D example");
	        setSize(surface.getWidth()+FRAME_THIKNESS_X, surface.getHeight()+FRAME_THICKNESS_Y);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	    }

	    public static void main(String[] args) {

	        EventQueue.invokeLater(new Runnable() {

	            @Override
	            public void run() {
	            	PrintBoard ex = new PrintBoard();
	                ex.setVisible(true);
	            }
	        });
	    }
}
