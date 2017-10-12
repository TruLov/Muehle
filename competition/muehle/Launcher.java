package competition.muehle;

import competition.muehle.view.Window;

/**
 * Launcher class
 * 
 * Main class with main-method, which creates the game-window
 * 
 * @author trulof
 * @author jbreih
 * @category Main
 *
 */
public class Launcher {

	/**
	 * Constructor
	 * 
	 * Creates the JFrame-window
	 * 
	 */
	public Launcher() {
		System.out.println("Creating Launcher...");
		new Window();
		System.out.println("Game has been launched successfully");
	}

	/**
	 * Main-method
	 * 
	 * Creates the Game-launcher
	 * 
	 * @param args
	 *            default-parameter
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Launching game...");
		new Launcher();
	}

}
