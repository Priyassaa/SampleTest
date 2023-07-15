package org.bve;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void tc1() {
		Result rc = JUnitCore.runClasses(B.class ,SampleProject.class,A.class);
		System.out.println("Total test case run count : " + rc.getRunCount()) ;
		System.out.println("TOtal test case run time : " + rc.getRunTime());
		System.out.println("TOtal test case failed count : " + rc.getFailureCount());
		System.out.println("TOtal test case Ignore count : " + rc.getIgnoreCount()) ;
		
		List<Failure> f = rc.getFailures();
		
		for (Failure fails : f) {
			System.out.println(fails);
			
		}
	}
	

}
