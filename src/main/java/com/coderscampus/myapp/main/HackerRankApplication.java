package com.coderscampus.myapp.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HackerRankApplication {
		
	public static void main (String [] args) {
		List<Integer> arr = new ArrayList<>();
		for(int i =1; i <= 5; i++) {
			arr.add(i);
		}
		miniMaxSum(arr);
		String sampleTime = "07:05:45PM";
		timeConversion(sampleTime);
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
	
}
