package competition.muehle.view;

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
public class Window extends JFrame implements IWindow {

	private static final long serialVersionUID = 1L;
	
	private LogPanel logger;

	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = DEFAULT_WIDTH;

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

		//System.out.println("Creating JFrame 'Window'...");

		this.mWidth = widthIn;
		this.mHeight = heightIn;

		// standard configuration for JFrame
		setTitle(titleIn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// pack frame with panel and sets it visible
		logger = new LogPanel(600, 100);
		setContentPane(logger);
		logger.log("Logger created...");
		pack();
		setVisible(true);

		logger.log("JFrame 'Window' was created successfully...");
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

		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, "M�hle");
	}
}
