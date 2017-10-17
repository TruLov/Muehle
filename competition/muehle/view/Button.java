package competition.muehle.view;

import java.awt.Color;

import javax.swing.JButton;

/**
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class Button extends JButton {

	private static final long serialVersionUID = 1L;

	private int mSize;
	private Color mColor;

	public Button(int sizeIn, Color colorIn) {

		this.mSize = sizeIn;
		this.mColor = colorIn;

		setContentAreaFilled(false);
		setBorderPainted(false);
		setColor(mColor);
	}

	public void setPos(int xIn, int yIn) {

		this.setBounds(xIn, yIn, mSize, mSize);
	}

	public void setColor(Color colorIn) {

		if (colorIn == null) {
			setContentAreaFilled(false);
		} else {
			this.mColor = colorIn;
			setBackground(mColor);
			setOpaque(true);
		}

	}
}
