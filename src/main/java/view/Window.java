package view;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import model.Car;
import model.Constants;


public class Window extends JFrame{
	private CarView carView;
	
    public Window(Car car) {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
		JPanel content = new JPanel();
		carView = new CarView(car);
		content.add(carView);
		content.setSize(Constants.WINDOWS_WIDTH, Constants.WINDOWS_HEIGHT);
		content.setLayout(new FlowLayout());
		setContentPane(content);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public Observer getCarView() {
		return carView;
	}

}
