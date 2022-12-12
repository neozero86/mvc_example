package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import model.Constants.*;

import javax.swing.*;

import model.Chronometer;
import model.Constants;

public class ChronometerView extends JFrame implements Observer {

	private static final String START = "Start";
	private static final String STOP = "Stop";
	private static final String RESET = "Reset";
	private static final String FASTER = "Faster";
	private static final String SLOWER = "Slower";
	
	private JButton powerButton = new JButton(START);
	private JButton resetButton = new JButton(RESET);
	private JButton speedUpButton = new JButton(FASTER);
	private JButton speedDownButton = new JButton(SLOWER);


	private JTextField counterField = new JTextField(10);
	private JTextField currentDelay = new JTextField(10);

	private Chronometer model;
	
	public ChronometerView(Chronometer model) {
		this.model = model;
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(powerButton);
		content.add(resetButton);
		content.add(speedDownButton);
		content.add(counterField);
		content.add(speedUpButton);
		content.add(currentDelay);

		setContentPane(content);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		powerButton.addActionListener(e -> {
			model.setActive(!model.isActive());
			updatePowerButtonLabel();
		});
		
		resetButton.addActionListener(e -> {
			model.resetCounter();
		});
		
		speedUpButton.addActionListener(e -> {
			model.speedUp();
		});
		
		speedDownButton.addActionListener(e -> {
			model.speedDown();
		});
		
	}
	
	private void updatePowerButtonLabel() {
		if (model.isActive()) {
			powerButton.setText(STOP);
		} else {
			powerButton.setText(START);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		Chronometer chrono = (Chronometer) o;
		
		if(chrono.isMaxLimitReached()) {
			speedUpButton.setEnabled(false);
		} else {
			speedUpButton.setEnabled(true);
		}
		
		if(chrono.isMinLimitReached()) {
			speedDownButton.setEnabled(false);
		} else {
			speedDownButton.setEnabled(true);
		}
		counterField.setText(String.valueOf(chrono.getCounter()));
		currentDelay.setText(String.valueOf(chrono.getSpeed()+"x"));
	}

}
