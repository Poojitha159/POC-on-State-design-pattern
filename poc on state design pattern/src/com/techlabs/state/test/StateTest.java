package com.techlabs.state.test;

import com.techlabs.state.model.StartState;
import com.techlabs.state.model.State;
import com.techlabs.state.model.StateContext;
import com.techlabs.state.model.StopState;

public class StateTest {
	public static void main(String args[]) {
		StateContext con=new StateContext();
		//State start=new StartState();
		con.setState(new StartState());
		con.doAction();
		
		con.setState(new StopState());
con.doAction();
		
	
	}

}
