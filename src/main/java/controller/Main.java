package controller;

import model.RandomGenerator;
import view.RandomGeneratorView;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		RandomGenerator model = new RandomGenerator();
		RandomGeneratorView view = new RandomGeneratorView(model);
		new Controller(model, view);
	}

}
