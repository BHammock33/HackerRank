package com.coderscampus.myapp.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRankApplication {
		
	public static void main (String [] args) {
		List<Integer> arr = new ArrayList<>();
		for(int i =1; i <= 5; i++) {
			arr.add(i);
		}
		miniMaxSum(arr);
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
}
