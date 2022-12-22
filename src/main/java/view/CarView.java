package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.*;

public class CarView extends JPanel implements Observer{

	private Car car;
	
    public CarView(Car car) {
    	this.car = car;
        setBackground(Color.red);//New.   
        paintCar();
	}

	@Override
	public void update(Observable o, Object arg) {
		paintCar();
	}
	
	private void paintCar() {
		setBounds(car.getX(), car.getY(), car.getWidth(), car.getHeight());

	}
}
