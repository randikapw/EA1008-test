package drawingboard;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public final class DrawingBoard extends JPanel {
	private int boardWidth;
	private int boardHeight;
	
	public DrawingBoard() {
	   boardWidth = 400;
	   boardHeight = 300;
	}
	
	@Override
	public int getWidth() {
		int superWidth = super.getWidth();
		if(superWidth > 0){
			return superWidth; 
		} 
		
		return boardWidth;
	}
	
	@Override
	public int getHeight() {
		int superHeight = super.getHeight();
		if (superHeight > 0) {
			return superHeight;
		} 
		
		return boardHeight;
	}
	
	public void setBoardWidth(int boardWidth) {
		this.boardWidth = boardWidth;
	}

	public void setBoardHeight(int boardHeight) {
		this.boardHeight = boardHeight;
	}

	private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, boardWidth, boardHeight);
        g2d.setColor(Color.RED);
        g2d.fill3DRect(49, 3, 10, 21, true);
        g2d.fill3DRect(49, 3, 10, 21, true);
        g2d.drawString("Java 2D", 50, 50);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(0, 0, boardWidth, boardHeight);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
    
    public void drawCircle(){
    	Graphics2D g2d = (Graphics2D)getGraphics();
    	g2d.setColor(Color.BLUE);
    	g2d.fillOval(4, 25, 20, 20);
    	this.update(g2d);
    }
}
