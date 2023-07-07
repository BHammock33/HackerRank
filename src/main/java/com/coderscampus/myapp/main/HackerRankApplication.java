package com.coderscampus.myapp.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.coderscampus.myapp.domain.LinkedList;
import com.coderscampus.myapp.service.MyService;

public class HackerRankApplication {

	public static void main(String[] args) {
		MyService myService = new MyService();

		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			arr.add(i);
		}
		myService.minMaxSum(arr);

		List<String> strings = new ArrayList<>(Arrays.asList("4", "aba", "baba", "aba", "xzxb"));
		List<String> queries = new ArrayList<>(Arrays.asList("3", "aba", "xzxb", "ab"));

		myService.matchingStrings(strings, queries);

		String sampleTime = "07:05:45PM";
		myService.timeConversion(sampleTime);

//		List<List<Integer>> inputMatrix = myService.addInputsDiagonalDifference();
//		myService.diagonalDifference(inputMatrix);

		List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2));
		myService.lonelyInteger(a);
		
		LinkedList list = new LinkedList();
		
		String data1 = "data1";
		String data2 = "data6";
		int x = 1;
		String data = "data";
		while(x < 10) {
			list.addToTail(data+x);
			x++;
		}
		
		myService.swapNodes(list, data1, data2);
		
		LinkedList middleList = new LinkedList();
		int i = 0;
		String dataAdd = "data";
		while(i < 10) {
			middleList.addToHead(dataAdd + " " + i);
			i++;
		}
		myService.findMiddle(middleList);

	}

}
