package view;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.RandomGenerator;

public class RandomGeneratorView extends JFrame implements Observer {

	private static final String START = "Start";
	private static final String STOP = "Stop";
	private final JTextField input = new JTextField(10);
	private final JButton button = new JButton(START);

	public RandomGeneratorView(RandomGenerator model) {
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());

		content.add(button);
		content.add(input);

		setContentPane(content);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		button.addActionListener(e -> model.setActivate(!model.isActivate()));
		button.addActionListener(e -> button.setText(changeTitle(button.getText())));
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

