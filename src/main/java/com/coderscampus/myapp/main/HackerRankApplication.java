package com.coderscampus.myapp.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankApplication {
		
	public static void main (String [] args) {
		addInputsMiniMax();
		addInputsTimeConversion();
		addInputsMatchingStrings();
		List<Integer> a = new ArrayList<>(Arrays.asList(1,1,2));
		lonelyInteger(a);
		addInputsDiagonalDifference();
		
		
	}
	private static void addInputsMatchingStrings() {
		List<String> strings = new ArrayList<>(Arrays.asList("4", "aba", "baba", "aba", "xzxb"));
		List<String> queries = new ArrayList<>(Arrays.asList("3", "aba", "xzxb", "ab"));
		matchingStrings(strings, queries);
	}
	private static void addInputsTimeConversion() {
		String sampleTime = "07:05:45PM";
		timeConversion(sampleTime);
	}
	private static void addInputsMiniMax() {
		List<Integer> arr = new ArrayList<>();
		for(int i =1; i <= 5; i++) {
			arr.add(i);
		}
		miniMaxSum(arr);
	}
	private static void addInputsDiagonalDifference() {
		List<Integer> row1 = new ArrayList<>(Arrays.asList(3));
		List<Integer> row2 = new ArrayList<>(Arrays.asList(11,2,4));
		List<Integer> row3 = new ArrayList<>(Arrays.asList(4,5,6));
		List<Integer> row4 = new ArrayList<>(Arrays.asList(10, 8, -12));
		List<List<Integer>> inputMatrix = new ArrayList<>();
		inputMatrix.add(row1);
		inputMatrix.add(row2);
		inputMatrix.add(row3);
		inputMatrix.add(row4);
		System.out.println(inputMatrix.size());
		System.out.println(diagonalDifference(inputMatrix));
	}
	
	
	//min max problem 1.20.23
	public static void miniMaxSum(List<Integer> arr) {
		long min = Collections.min(arr);
		long max = Collections.max(arr);
		long sum = 0;
		for(int i =0; i< arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println((sum - max )+ " " + (sum-min));
	}
	
	//timeConversion 1.20.23
	public static String timeConversion(String s) {
		Integer hour = Integer.parseInt(s.substring(0, 2));
		String time = s.substring(8);
		Boolean night = time.equalsIgnoreCase("pm");
		if(night) {
			if(hour != 12) {
				hour += 12;
				System.out.println(hour + s.substring(2,8));
				return "" + hour + s.substring(2,8);
			}
		}else {
			if(hour == 12) {
				System.out.println("00" + s.substring(2,8));
				return "00" + s.substring(2,8);
			}
		}
		System.out.println(s.substring(0,8));
		return s.substring(0,8);
	}
	
	//sparse arrays 1.20.23
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
		List<Integer> result = new ArrayList<>();
		queries.forEach(e->{int count = (int) strings.stream().filter(s->s.equals(e)).count();
		result.add(count);
		});
		System.out.println(result);
		return result;
	}
	
	//lonely integer 1.24.23
	public static Integer lonelyInteger(List<Integer> a) {
		for(Integer i:a) {
			if(Collections.frequency(a, i) == 1) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
	
	//flippingBits 1.26.23
	public static long flippingBits(long n) {
		return (((long)Math.pow(2, 32))-1 -n);
	}
	
	//diagonal Difference
	public static int diagonalDifference(List<List<Integer>> arr) {
		int sum1 = 0;
		int sum2= 0;
		
		int x = arr.size();
		
		for(int i=0; i<x; i++) {
			sum1 += arr.get(i).get(i);
			sum2 += arr.get(i).get(x-1-i);
		}
		return Math.abs(sum1 - sum2);
	}
	
}
