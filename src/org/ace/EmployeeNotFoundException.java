package org.ace;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		
		String msg="Employee Not Found in Unit1";
		return msg;
	}

}
