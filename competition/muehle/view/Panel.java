package competition.muehle.view;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * Panel class
 * 
 * Creates the panel with its size and background and sets it visible
 * 
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class Panel extends JPanel implements IPanel {

	private static final long serialVersionUID = 1L;

	protected int mWidth;
	protected int mHeight;
	private String mName;

	/**
	 * Constructor
	 * 
	 * Sets member-variables, size and requests focus in Window
	 * 
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 * 
	 */
	public Panel(int widthIn, int heightIn, String name) {

		System.out.println("Creating JPanel " + name);

		this.mWidth = widthIn;
		this.mHeight = heightIn;
		this.mName = name;
		
		setPreferredSize(new Dimension(mWidth, mHeight));
		setFocusable(true);
		requestFocus();

		System.out.println("JPanel "+ mName + " was created successfully.");
	}

	// Getters
	public int getmWidth() {
		return mWidth;
	}

	public int getmHeight() {
		return mHeight;
	}
}
