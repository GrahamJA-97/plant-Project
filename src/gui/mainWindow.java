package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JFrame;

import controller.Plant;
import controller.Plants;

/**
 * (enter class description)
 *
 * @author Jake Graham
 * @version
 */
public class mainWindow extends JFrame implements ActionListener, Plants {

	private static final long serialVersionUID = 1L;

	private HashSet<Plant> currentPlants;

	public mainWindow() {
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		// TODO Auto-generated method stub

	}
	
	private void calendar() {
		
	}

}
