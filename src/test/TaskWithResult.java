package test;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String>{
	
	public int id;
	
	public  TaskWithResult(int id) {
		this.id=id;
	}

	@Override
	public String call() throws Exception {
		return "result of "+id;
	}

}
