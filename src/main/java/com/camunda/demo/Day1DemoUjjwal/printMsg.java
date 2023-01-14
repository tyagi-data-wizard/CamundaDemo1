package com.camunda.demo.Day1DemoUjjwal;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class printMsg implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(" -------------------- hey -------------------------\n");
		
		Random rnd = new Random();
		boolean boo ;
		//= rnd.nextBoolean();
		System.out.println("testing");
		
		
		execution.setVariable("boo",rnd.nextBoolean());
		
	}

}
