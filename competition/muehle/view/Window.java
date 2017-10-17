package competition.muehle.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

	private static final int WINDOW_WIDTH = 600;
	private static final int WINDOW_HEIGHT = 500;
	private static final int GAMEPANEL_HEIGHT = 400;
	private static final int LOGPANEL_HEIGHT = 100;

	private static Image mGamePanelBackground = Toolkit
			.getDefaultToolkit()
			.getImage(
					"/home/trulov/Downloads/Muehle-tom/competition/muehle/img/Muehle.png");

	private GamePanel mGamePanel;
	private LogPanel mLogPanel;

	/**
	 * Constructor
	 * 
	 * Basic JFrame-configuration, visibility-settings and initialization of the
	 * member-variables.
	 * 
	 * @param titleIn
	 *            window-title
	 * 
	 */
	public Window() {

		System.out.println("Creating JFrame...");

		this.mGamePanel = new GamePanel(WINDOW_WIDTH, GAMEPANEL_HEIGHT,
				mGamePanelBackground);
		this.mLogPanel = new LogPanel(WINDOW_WIDTH, LOGPANEL_HEIGHT);

		// standard configuration for JFrame
		setTitle("Mühle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		setResizable(false);

		// pack frame with panel and sets it visible
		setLayout(new BorderLayout());
		add(mGamePanel, BorderLayout.CENTER);
		add(mLogPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);

		System.out.println("JFrame was created successfully.");
	}

	/**
	 * @return the mGamePanel
	 */
	public GamePanel getmGamePanel() {
		return mGamePanel;
	}

	/**
	 * @return the mLogPanel
	 */
	public LogPanel getmLogPanel() {
		return mLogPanel;
	}
}
