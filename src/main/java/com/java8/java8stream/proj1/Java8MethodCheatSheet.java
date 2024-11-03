package com.java8.java8stream.proj1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {

	public static void main(String[] args) {
		List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();
		// allEmployees.stream().forEach(emp -> System.out.println(emp));

		/*
		 * allEmployees.stream().filter(emp ->
		 * emp.getDept().equals("Development")).forEach(System.out::println);
		 */

		/*
		 * Map<Integer, String> empMap=allEmployees.stream() .collect(
		 * Collectors.toMap(Employee::getId, Employee::getName) );
		 * System.out.println(empMap);
		 */

		/*
		 * List<String> empdepts =
		 * allEmployees.stream().map(Employee::getDept).distinct().collect(Collectors.
		 * toList()); System.out.println(empdepts);
		 */

		/*
		 * List<String> empprojects = allEmployees.stream().flatMap(emp ->
		 * emp.getProjects().stream()) .map(proj ->
		 * proj.getName()).distinct().collect(Collectors.toList());
		 * System.out.println(empprojects);
		 */

		/*
		 * List<Employee> ascEmpsalsorted =
		 * allEmployees.stream().sorted(Comparator.comparing(Employee::getSalary))
		 * .peek(System.out::println).collect(Collectors.toList()); List<Employee>
		 * dascEmpsalsorted = allEmployees.stream()
		 * .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).
		 * peek(System.out::println) .collect(Collectors.toList());
		 */

		/*
		 * Employee
		 * minsalemp=allEmployees.stream().min(Comparator.comparingDouble(Employee::
		 * getSalary)).get(); System.out.println(minsalemp); Employee
		 * maxsalemp=allEmployees.stream().max(Comparator.comparingDouble(Employee::
		 * getSalary)).get(); System.out.println(maxsalemp);
		 */

		// grouping by

		/*
		 * Map<String, List<Employee>> empgendergroup =
		 * allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender));
		 * System.out.println(empgendergroup.size()); Map<String, List<String>>
		 * empgendergroup1 =
		 * allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.mapping(Employee::getName, Collectors.toList())));
		 * System.out.println(empgendergroup1); Map<String, Long> empgendercounting =
		 * allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.mapping(Employee::getName, Collectors.counting())));
		 * System.out.println(empgendercounting);
		 */

		// find first

		/*
		 * Employee firstEmployee =allEmployees.stream().findFirst().get();
		 * System.out.println(firstEmployee); Optional<Employee> anyEmployee
		 * =allEmployees.stream().findAny(); anyEmployee.ifPresent(System.out::println);
		 */

		// any match
		/*
		 * boolean anymatch = allEmployees.stream().anyMatch(emp ->
		 * emp.getDept().equals("Development")); System.out.println(anymatch);
		 * 
		 * // all match boolean allmatch = allEmployees.stream().anyMatch(emp ->
		 * emp.getSalary() > 1000); System.out.println(allmatch);
		 */

		// top 2 highest paid employees
		// allEmployees.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(Employee::getSalary))).limit(2).forEach(System.out::println);

		/*
		 * Employee
		 * seconhighsalemp=allEmployees.stream().sorted(Collections.reverseOrder(
		 * Comparator.comparingDouble(Employee::getSalary))).limit(2).collect(Collectors
		 * .toList()).get(1); System.out.println(seconhighsalemp);
		 */

		/*
		 * Random rn = new Random(); System.out.println(rn.nextDouble(100));
		 */

		/*
		 * Map<String, Double> empMap = allEmployees.stream()
		 * .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		 * Entry<String, Double> entry =
		 * empMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.
		 * comparingByValue())).collect(Collectors.toList()).get(0);
		 * System.out.println(entry);
		 * 
		 * Map<Double, List<String>> mapEMPgrp = empMap.entrySet().stream().collect(
		 * Collectors.groupingBy(Map.Entry::getValue,
		 * Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		 * List<Entry<Double, List<String>>> newlist = mapEMPgrp.entrySet().stream()
		 * .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(
		 * Collectors.toList()); System.out.println(newlist.get(1));
		 */

		
		/*
		 * List<Integer> numbers = Arrays.asList(1,2,4,2,3,4,2,1,5,6,5,7,5,6,9,4,2,1);
		 * Map<Integer, Integer> eachnumOccur =
		 * numbers.stream().collect(Collectors.toMap(number -> number,number ->
		 * Collections.frequency(numbers, number),
		 * (exitsingvalue,newvalue)->exitsingvalue)); System.out.println(eachnumOccur);
		 * 
		 * Map<Integer, List<Integer>> collectusinggroup =
		 * numbers.stream().collect(Collectors.groupingBy(number -> number));
		 * System.out.println(collectusinggroup); Map<Integer, Long> collectcounting =
		 * numbers.stream().collect(Collectors.groupingBy(number ->
		 * number,Collectors.mapping(number->number, Collectors.counting())));
		 * System.out.println(collectcounting);
		 */
		 

		/*
		 * List<Integer> intstream = IntStream.range(1,
		 * 11).boxed().collect(Collectors.toList());
		 * System.out.println("intstream "+intstream); Collections.rotate(intstream, 2);
		 * System.out.println("intstream after fromright "+intstream);
		 */
//		Collections.rotate(intstream, -2);
//		System.out.println("intstream after fromleft "+intstream);
//		Collections.rotate(intstream, -11);
//		System.out.println("intstream after fromleft "+intstream);
//		Stream.ofNullable(null);

//		List<Integer> collectiterate = Stream.iterate(1, n->n+2).limit(10).collect(Collectors.toList());
//		System.out.println(collectiterate);

		/*
		 * Long avgsal = allEmployees.stream().mapToDouble(Employee::getSalary).boxed()
		 * .collect(Collectors.collectingAndThen(Collectors.averagingDouble(sal -> sal),
		 * avg -> Math.round(avg))); System.out.println(avgsal); Long avgsal2 =
		 * allEmployees.stream().map(Employee::getSalary)
		 * .collect(Collectors.collectingAndThen(Collectors.averagingDouble(sal
		 * ->sal),avg->Math.round(avg) )); System.out.println(avgsal2);
		 */
//
//		List<Integer> nums = List.of(1, 3, 4, 6, 5, 9, 8, 2, 7);
//		List<Integer> numstake = nums.stream().takeWhile(num -> num < 5).collect(Collectors.toList());
//		System.out.println(numstake);
//		List<Integer> numsdrop = nums.stream().dropWhile(num -> num < 5).collect(Collectors.toList());
//		System.out.println(numsdrop);

		/*
		 * Map<String, Integer> minmax = Stream.iterate(1, num -> num + 1).limit(10)
		 * .collect(Collectors.teeing(Collectors.maxBy(Integer::compareTo),
		 * Collectors.minBy(Integer::compareTo), (v1, v2) -> Map.of("max", v1.get(),
		 * "min", v2.get()))); System.out.println(minmax);
		 */

//		
//		Stream<Integer> stream1 = Stream.of(1,2);
//		Stream<Integer> stream2 = Stream.of(3,4);
//		Stream<Integer> concatstream = Stream.concat(stream1, stream2);
//		//int sum=concatstream.mapToInt(num -> num.intValue()).sum();
//		int sum=concatstream.mapToInt(Integer::intValue).sum();
//		System.out.println(sum);

//		Map<Boolean, List<Integer>> partition = IntStream.range(1, 10).boxed().collect(Collectors.partitioningBy(n->n%2==0));
//	
//	System.out.println(partition);
//Map<Boolean, List<Integer>> partition2 = IntStream.range(1, 10).boxed().collect(Collectors.partitioningBy(n->n>5));
//	
//	System.out.println(partition2);

	}

}
