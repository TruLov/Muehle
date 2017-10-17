package competition.muehle.view;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * LogPanel class
 * 
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class LogPanel extends Panel {

	private static final long serialVersionUID = 1L;

	static String mName = "LogPanel";
	JTextArea mLogger;
	JScrollPane mScroller;
	JScrollBar bar;

	/**
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 */
	public LogPanel(int widthIn, int heightIn) {
		super(widthIn, heightIn, mName);
		mLogger = new JTextArea(5, 47);
		mLogger.setEditable(false);

		mScroller = new JScrollPane(mLogger);

		add(mScroller);
	}

	/**
	 * 
	 * @param text
	 *            text to log
	 */
	public void log(String text) {
		mLogger.insert(text + "\n", 0);
		bar = mScroller.getVerticalScrollBar();
		bar.setValue(bar.getMinimum());
	}
}