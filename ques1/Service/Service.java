package ques1.Service;

import java.util.PriorityQueue;

public class Service {

	public void printConstructionTable(int floor[],int noOfFloors) {
		
	System.out.println("The order of construction is as follows");
	
	
	PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

	int[] temp = new int[noOfFloors];

	int max = noOfFloors;

	System.out.println();
	for (int i = 1; i <= noOfFloors; i++) {

		System.out.println("Day: "+(i));
		
		
		temp[i-1] = floor[i-1];

		queue.add(temp[i-1]);


		while (!queue.isEmpty() && queue.peek() == max) {

			System.out.print(queue.poll() + " ");

			max--;

		}

		System.out.println();

	}

  }

}

