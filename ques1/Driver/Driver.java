package ques1.Driver;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

import ques1.Service.Service;

class Driver {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=1; i<=noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i));
		floors[i-1] = sc.nextInt(); 
		}  
		System.out.println();
		
		Service service = new Service();
		service.printConstructionTable(floors, noOfFloor);
	}
}