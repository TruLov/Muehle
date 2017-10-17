package competition.muehle.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 * GamePanel class
 * 
 * Creates the Game-panel with its size and background and sets it visible
 * 
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class GamePanel extends Panel {

	private static final long serialVersionUID = 1L;

	private final int NUM_OF_BUTTONS = 24;
	private final int BUTTON_SIZE = 40;
	private final int[][] BUTTON_FIELD = { { 110, 10 }, { 280, 10 }, { 450, 10 }, { 165, 65 }, { 280, 65 }, { 395, 65 },
			{ 220, 120 }, { 280, 120 }, { 340, 120 }, { 110, 180 }, { 165, 180 }, { 220, 180 }, { 340, 180 },
			{ 395, 180 }, { 450, 180 }, { 220, 240 }, { 280, 240 }, { 340, 240 }, { 165, 295 }, { 280, 295 },
			{ 395, 295 }, { 110, 350 }, { 280, 350 }, { 450, 350 } };

	private List<Button> mButtonList = new ArrayList<Button>();

	/**
	 * 
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 */
	public GamePanel(int widthIn, int heightIn, Image backgroundIn) {

		super(widthIn, heightIn, backgroundIn, "GamePanel");

		setLayout(null);

		initButtons();

		setPreferredSize(new Dimension(mWidth, mHeight));
		setFocusable(true);
		requestFocus();
	}

	/**
	 * initializing button-list
	 */
	private void initButtons() {

		System.out.println("Init buttons...");

		for (int i = 0; i < NUM_OF_BUTTONS; i++) {

			// create
			mButtonList.add(new Button(BUTTON_SIZE, Color.BLACK));

			// layout
			mButtonList.get(i).setPos(BUTTON_FIELD[i][0], BUTTON_FIELD[i][1]);

			// add to panel
			this.add(mButtonList.get(i));
		}
	}
}
