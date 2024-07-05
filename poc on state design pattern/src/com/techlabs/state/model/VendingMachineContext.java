package com.techlabs.state.model;

public class VendingMachineContext implements VendingMachineState{

	private VendingMachineState state;
	
	

   
	public void setState(VendingMachineState state) {
        this.state = state;
    }

  //  public void request() {
    //    state.handleRequest();
//}

	@Override
	public void handleRequest() {
		state.handleRequest();
	}
}