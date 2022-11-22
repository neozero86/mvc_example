package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Chronometer;

@SuppressWarnings("serial")
public class ChronometerView extends JFrame{

	private static final String START = "Start";
	private static final String STOP = "Stop";
	private final JTextField input = new JTextField(10);
	private final JButton button = new JButton(START);
	Chronometer chrono;
	
	public ChronometerView(Chronometer chrono) {
		this.chrono = chrono;
		
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());

		content.add(button);
		content.add(input);

		setContentPane(content);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		button.addActionListener(e -> chrono.setActivate(!chrono.isActivate()));
		button.addActionListener(e -> button.setText(changeTitle(button.getText())));
		chrono.addPropertyChangeListener( new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(chrono.getAddingTimePropertyName())) {
					input.setText(chrono.getTime());
				}
			}
		});
	}

	private String changeTitle(String title) {
		if (title.equals(START)) {
			return STOP;
		}
		return START;
	}

}
