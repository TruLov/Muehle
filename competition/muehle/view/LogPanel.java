package competition.muehle.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

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
	JTextPane mTextPane;
	JScrollPane mScrollPane;
	JScrollBar bar;

	/**
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 */
	public LogPanel(int widthIn, int heightIn) {

		super(widthIn, heightIn, mName);

		mTextPane = new JTextPane();
		mTextPane.setEditable(false);
		mScrollPane = new JScrollPane(mTextPane);
		
		mTextPane.setPreferredSize(new Dimension(mWidth-10, mHeight));

		add(mScrollPane, BorderLayout.CENTER);
	}

	/**
	 * 
	 * @param text
	 *            text to log
	 */
	public void log(String text) {
		mTextPane.setText(text + "\n");
		
//		mTextPane.insert(text + "\n", 0);
//		bar = mScroller.getVerticalScrollBar();
//		bar.setValue(bar.getMinimum());
	}
}
