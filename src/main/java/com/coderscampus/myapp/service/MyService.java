package com.coderscampus.myapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.coderscampus.myapp.domain.LinkedList;
import com.coderscampus.myapp.domain.Node;

public class MyService {

	
	
	//two pointers in parallel
	public Node nthLastNode(LinkedList list, int n) {
		Node current = null;
		Node tailSeeker = list.head;
		int count = 0;
		while(tailSeeker != null) {
			tailSeeker = tailSeeker.getNextNode();
			if( count >= n) {
				if(current == null) {
					current = list.head;
				}
				current = current.getNextNode();
			}
			count++;
		}
		return current;
		
	}
	
	//slow/fast pointers
	public Node findMiddle(LinkedList list) {
		Node fast = list.head;
		Node slow = list.head;
		while(fast != null){
			fast = fast.getNextNode();
			if(fast != null) {
				fast = fast.getNextNode();
				slow = slow.getNextNode();
			}
		}
		System.out.println(slow.data);
		return slow;
	}
	
	//node swapping 
		public void swapNodes(LinkedList list, String data1,	String data2) {
			System.out.println("Swapping " + data1 + " with " + data2);
			
			Node node1Prev = null;
			Node node2Prev = null;
			Node node1 = list.head;
			Node node2 = list.head;
			
			if(data1 == data2) {
				System.out.println("Elements are the same no need for swapping");
				return;
			}
			
			while(node1 != null) {
				if(node1.data == data1) {
					break;
				}
				node1Prev = node1;
				node1 = node1.getNextNode();
			}
			while(node2 != null) {
				if(node2.data == data2) {
					break;
				}
				node2Prev = node2;
				node2 = node2.getNextNode();
			}
			if(node1 == null || node2 == null) {
				System.out.println("swap not possible one or more null elements");
				return;
			}
			if(node1Prev == null) {
				list.head = node2;
			} else {
				node1Prev.setNextNode(node2);
			}
			if(node2Prev == null) {
				list.head = (node1);
			} else {
				node2Prev.setNextNode(node1);
			}
			Node temp = node1.getNextNode();
			node1.setNextNode(node2.getNextNode());
			node2.setNextNode(temp);
				
			}
		
		//diagonal Difference
//		public int diagonalDifference(List<List<Integer>> arr) {
//			int sum1 = 0;
//			int sum2= 0;
//			
//			int x = arr.size();
//			
//			for(int i=0; i<x; i++) {
//				sum1 += arr.get(i).get(i);
//				sum2 += arr.get(i).get(x-1-i);
//			}
//			return Math.abs(sum1 - sum2);
//		}
		
		//flippingBits 1.26.23
		public long flippingBits(long n) {
			return (((long)Math.pow(2, 32))-1 -n);
		}
		//lonely integer 1.24.23
		public Integer lonelyInteger(List<Integer> a) {
			for(Integer i:a) {
				if(Collections.frequency(a, i) == 1) {
					System.out.println(i);
					return i;
				}
			}
			return -1;
		}
		//sparse arrays 1.20.23
		public  List<Integer> matchingStrings(List<String> strings, List<String> queries){
			List<Integer> result = new ArrayList<>();
			queries.forEach(e->{int count = (int) strings.stream().filter(s->s.equals(e)).count();
			result.add(count);
			});
			System.out.println(result);
			return result;
		}
		//timeConversion 1.20.23
		public String timeConversion(String s) {
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
		
		//min max problem 1.20.23
		public  void minMaxSum(List<Integer> arr) {
			long min = Collections.min(arr);
			long max = Collections.max(arr);
			long sum = 0;
			for(int i =0; i< arr.size(); i++) {
				sum += arr.get(i);
			}
			System.out.println((sum - max )+ " " + (sum-min));
		}
		public  List<List<Integer>> addInputsDiagonalDifference() {
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
			return inputMatrix;
		}
		

	
}
