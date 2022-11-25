package view;

import java.awt.FlowLayout;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.RandomGenerator;

public class RandomGeneratorView extends JFrame implements Observer {

	private static final String START = "Start";
	private static final String STOP = "Stop";
	private static final String RESET = "Reset";
	private static final String FASTER = "Faster";
	private final JTextField input = new JTextField(10);
	private final JButton buttonStart = new JButton(START);
	private final JButton buttonReset = new JButton(RESET);
	private final JButton buttonFaster = new JButton(FASTER);


	public RandomGeneratorView(RandomGenerator model) {
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());

		content.add(buttonStart);
		content.add(buttonReset);
		content.add(buttonFaster);

		content.add(input);

		setContentPane(content);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		buttonStart.addActionListener(e -> model.setActivate(!model.isActivate()));
		buttonStart.addActionListener(e -> buttonStart.setText(changeTitle(buttonStart.getText())));
		buttonReset.addActionListener(e -> model.resetCounter());
		buttonFaster.addActionListener(e -> model.incrementVelocity());

	}

	private String changeTitle(String title) {
		if (title.equals(START)) {
			return STOP;
		}
		return START;
	}

	@Override
	public void update(Observable o, Object text) {
		input.setText(((RandomGenerator) o).getTime());
	}

}

