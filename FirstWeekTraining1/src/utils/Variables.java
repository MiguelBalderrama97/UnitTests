package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import models.Employee;

public class Variables {
	public static List<Employee> employeesArrayList = getListEmployees();
	public static Map<String, Employee> employeesHashMap = getHashMapEmployees();
	public static Stack stack = getStackElements();
	public static Set<Employee> employeesTree = getTreeEmployees();
	
	private static List<Employee> getListEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Mike"));
		employees.add(new Employee(2, "Carlos"));
		employees.add(new Employee(3, "Juan"));
		employees.add(new Employee(4, "Luis"));
		employees.add(new Employee(5, "Leo"));
		employees.add(new Employee(6, "David"));
		return employees;
	}

	private static Set<Employee> getTreeEmployees() {
		Set<Employee> employees = new TreeSet<>();
		employees.add(new Employee(1, "Mike"));
		employees.add(new Employee(2, "Carlos"));
		employees.add(new Employee(3, "Juan"));
		employees.add(new Employee(4, "Luis"));
		employees.add(new Employee(5, "Leo"));
		employees.add(new Employee(6, "David"));
		return employees;
	}

	private static Map<String, Employee> getHashMapEmployees() {
		Map<String, Employee> employees = new HashMap<>();
		employees.put("Uno", new Employee(1, "Mike"));
		employees.put("Dos", new Employee(2, "Carlos"));
		employees.put("Tres", new Employee(3, "Juan"));
		employees.put("Cuatro", new Employee(4, "Luis"));
		employees.put("Cinco", new Employee(5, "Leo"));
		employees.put("Seis", new Employee(6, "David"));
		return employees;
	}
	
	private static Stack getStackElements() {
		Stack stack = new Stack();
		stack.push("Hello");
		stack.push(new Employee(8, "Jose"));
		stack.push(6);
		return stack;
	}
}
