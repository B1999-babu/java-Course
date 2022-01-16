package Client;

import java.util.ArrayList;
import java.util.List;

public class Application2 {
	public static void main(String args[]) {
		
		Object myObject=new Object();
		String var="Hello";
		myObject=var;
		//System.out.println(myObject);
		
		
		Employee emp=new Employee();
		Accountent acc=new Accountent();
		emp=acc;
		
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee());
		ArrayList<Accountent> account=new ArrayList<Accountent>();
		account.add(new Accountent());
		//employee=account;
		
		
		ArrayList<?> employee1=new ArrayList<>();
		ArrayList<String> account1=new ArrayList<String>();
		employee1=account1;
		
		
		//Upper bound
		ArrayList<? extends Employee> employee2=new ArrayList<>();
		ArrayList<Accountent> account2=new ArrayList<Accountent>();
		employee2=account2;
	
		//Lower bound
		ArrayList<? super Employee> employee3=new ArrayList<>();
		ArrayList<Object> account3=new ArrayList<Object>();
		employee3=account3;
		
		makework(employee);
	}
	public static void makework(List<? extends Employee>employees ) {
		for(Employee emp:employees) {
			emp.work();
		}
	}

}
