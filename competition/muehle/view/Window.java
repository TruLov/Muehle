package competition.muehle.view;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Window class
 * 
 * Creates JFrame, fills it with the GamePanel and sets it visible
 * 
 * @author trulof
 * @author jbreih
 * @category View
 * 
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 500;

	private static Image mGamePanelBackground = Toolkit.getDefaultToolkit()
			.getImage("E:/Entwicklung/java-oxygen/eclipse/workspace/Mühle/src/competition/muehle/img/Muehle.png");

	private int mWidth;
	private int mHeight;

	/**
	 * Main-Constructor
	 * 
	 * Basic JFrame-configuration, visibility-settings and initialization of the
	 * member-variables.
	 * 
	 * @param widthIn
	 *            window-width
	 * @param heightIn
	 *            window-height
	 * @param titleIn
	 *            window-title
	 * 
	 */
	public Window(int widthIn, int heightIn, String titleIn) {

		System.out.println("Creating JFrame...");

		this.mWidth = widthIn;
		this.mHeight = heightIn;

		// standard configuration for JFrame
		setTitle(titleIn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		// pack frame with panel and sets it visible
		setContentPane(new GamePanel(mWidth, mHeight, mGamePanelBackground));
		pack();
		setVisible(true);

		System.out.println("JFrame was created successfully.");
	}

	/**
	 * Constructor
	 * 
	 * Chain to Main-Constructor
	 * 
	 * @param sizeIn
	 *            size of width and height
	 * @param titleIn
	 *            window-title
	 * 
	 */
	public Window(int sizeIn, String titleIn) {

		this(sizeIn, sizeIn, titleIn);
	}

	/**
	 * Constructor
	 * 
	 * Chain to Main-Constructor
	 * 
	 * @param sizeIn
	 *            size of width and height
	 * 
	 */
	public Window(int sizeIn) {

		this(sizeIn, sizeIn, "Mühle");
	}

	/**
	 * Constructor
	 * 
	 * Chain to Main-Constructor
	 * 
	 * @param titleIn
	 *            window-title
	 * 
	 */
	public Window(String titleIn) {

		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, titleIn);
	}

	/**
	 * Default-Constructor
	 * 
	 * Chain to Main-Constructor
	 * 
	 */
	public Window() {

		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, "Mühle");
	}

	// Getters, mainly for testing purposes
	public int getmWidth() {
		return mWidth;
	}

	public int getmHeight() {
		return mHeight;
	}

}
