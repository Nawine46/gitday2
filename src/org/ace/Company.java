package org.ace;


public class Company {
	
	public static void search() {
		
		String s="45678";
		
		if (s.startsWith("45678")) {
			
			System.out.println("employee is present");
			
		}
		else {
			try {
				throw new EmployeeNotFoundException();
			} catch (EmployeeNotFoundException e) {
			
				e.printStackTrace();
				System.out.println("database is open");
			}
			finally {
				System.out.println("databse is close");
			}
		}
	}
	public static void main(String[] args) {
		
		search();
		
	}
}
