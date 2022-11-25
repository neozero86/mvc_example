package controller;

import java.util.concurrent.TimeUnit;

import model.RandomGenerator;
import view.RandomGeneratorView;

public class Controller {

	private final RandomGenerator model;
	private final RandomGeneratorView view;

	public Controller(RandomGenerator model, RandomGeneratorView view) throws InterruptedException {
		this.model = model;
		this.view = view;
		view.setVisible(true);
		model.addObserver(view);

		while(true) {
			model.update();
			TimeUnit.MILLISECONDS.sleep(model.getSleepyTime());
		}
	}

}
