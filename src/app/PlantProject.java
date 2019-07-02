package app;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import gui.mainWindow;

/**
 * Class to start the GUI for the Plant Project app
 *
 * @author Jake Graham
 * @version
 */
public class PlantProject implements Runnable {

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new PlantProject());

	}

	@Override
	public void run() {
		new mainWindow();

	}

}
