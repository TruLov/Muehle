package competition.muehle.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * Panel class
 * 
 * creates the panel with its size and background and sets it visible
 * 
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Image mBackgroundImage;

	protected int mWidth;
	protected int mHeight;

	/**
	 * Main-constructor
	 * 
	 * @param widthIn
	 * @param heightIn
	 * @param backgroundIn
	 * @param nameIn
	 */
	public Panel(int widthIn, int heightIn, Image backgroundIn, String nameIn) {

		System.out.println("Creating Panel '" + nameIn + "'...");

		this.mWidth = widthIn;
		this.mHeight = heightIn;
		this.mBackgroundImage = backgroundIn;

		repaint();
	}

	/**
	 * Chain-constructor
	 * 
	 * Sets member-variables, size and requests focus in Window
	 * 
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 * @param nameIn
	 *            panel-name
	 * 
	 */
	public Panel(int widthIn, int heightIn, String nameIn) {
		this(widthIn, heightIn, null, nameIn);
	}

	/**
	 * Chain-constructor
	 * 
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 * 
	 */
	public Panel(int widthIn, int heightIn) {
		this(widthIn, heightIn, "");
	}

	// Getters
	public int getmWidth() {
		return mWidth;
	}

	public int getmHeight() {
		return mHeight;
	}

	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("paintComponent(g)...");
		super.paintComponent(g);
		if (mBackgroundImage != null) {
			g.drawImage(mBackgroundImage, 0, 0, this);
		}
	}
}
