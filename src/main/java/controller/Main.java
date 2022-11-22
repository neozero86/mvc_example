package controller;

import model.Chronometer;
import view.ChronometerView;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Chronometer model = new Chronometer();
		ChronometerView view = new ChronometerView(model);
		Controller controller = new Controller(model, view);
		controller.run();
	}

}
