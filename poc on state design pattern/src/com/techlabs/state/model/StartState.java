package com.techlabs.state.model;

public class StartState implements State{

	@Override
	public void doAction() {


		System.out.println(" TV turned ON");
	}

}
