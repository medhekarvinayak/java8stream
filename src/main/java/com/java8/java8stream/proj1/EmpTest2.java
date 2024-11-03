package com.java8.java8stream.proj1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmpTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();
		/*
		 * List<Employee> sortedsal =
		 * allEmployees.stream().sorted(Collections.reverseOrder(Comparator.comparing(
		 * emp->emp.getSalary()))).collect(Collectors.toList());
		 * System.out.println(sortedsal);
		 * 
		 * List<String> depts =
		 * allEmployees.stream().map(Employee::getDept).distinct().collect(Collectors.
		 * toList()); System.out.println(depts);
		 */
	
	Map<String, Double> namesalmap = allEmployees.stream().collect( Collectors.toMap(Employee::getName, Employee::getSalary) );
	
	System.out.println(namesalmap);
	Map<String, List<Employee>> deptgrp = allEmployees.stream().collect(Collectors.groupingBy(Employee::getDept));
	System.out.println(deptgrp);
	
	Map<Double, Long> countempbydept = allEmployees.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
	System.out.println(countempbydept);
	
	List<Entry<Double, List<String>>> descordersal = allEmployees.stream().collect(Collectors
			.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())))
	.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList());
	System.out.println(descordersal);
	Map<String, Double> avgdeptsal = allEmployees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
	
	
	System.out.println(avgdeptsal);
	
	
	
	}

}
