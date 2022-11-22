package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Chronometer {

	private static final String ADDING_TIME_PROPERTY_NAME = "addingTime";
	private boolean activate = false;
	private int time = 0;
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	public void update() {
		if (activate) {
			time ++;	
		}
        support.firePropertyChange(ADDING_TIME_PROPERTY_NAME, 1, getTime());
	}
	
	public String getAddingTimePropertyName() {
		return ADDING_TIME_PROPERTY_NAME;
	}
	
	public String getTime() {
		return Integer.toString(time);
	}
	
	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
		support.addPropertyChangeListener(propertyChangeListener);
	}


}