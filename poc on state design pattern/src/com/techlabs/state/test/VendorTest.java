package com.techlabs.state.test;

import com.techlabs.state.model.OutOfStockState;
import com.techlabs.state.model.PaymentPendingState;
import com.techlabs.state.model.ProductSelectedState;
import com.techlabs.state.model.ReadyState;
import com.techlabs.state.model.VendingMachineContext;

public class VendorTest {

	public static void main(String[] args) {
		VendingMachineContext vendingMachine = new VendingMachineContext();
		
		
		

        // Set initial state
        vendingMachine.setState(new ReadyState());
		vendingMachine.handleRequest();
        // Request state change
       

        // Change state
        vendingMachine.setState(new ProductSelectedState());
        vendingMachine.handleRequest();
        // Request state change
   

        // Change state
        vendingMachine.setState(new PaymentPendingState());
        vendingMachine.handleRequest();
        // Request state change
      

        // Change state
        vendingMachine.setState(new OutOfStockState());
        vendingMachine.handleRequest();
        // Request state change
        
	}

}
