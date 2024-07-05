package com.techlabs.state.model;

public class StopState implements State{

	@Override
	public void doAction() {


		System.out.println(" TV turned OFF");
	}

}
