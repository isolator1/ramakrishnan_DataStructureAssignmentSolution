package com.gl.question1;

import java.util.*;

class MyComparator implements Comparator

{

	public int compare(Object obj1, Object obj2)

	{

		Integer i1 = (Integer) obj1;

		Integer i2 = (Integer) obj2;

		return i2.compareTo(i1);

	}

}

public class ConsSeq

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Floors of a Building :");

		int n = sc.nextInt();

		int max = n;

		Queue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());

		int floorSize[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("Enter floor size on a given day : " + (1 + i) );

			floorSize[i] = sc.nextInt();

			queue.add(floorSize[i]);

			while (!queue.isEmpty() && queue.peek() == max) {
	
				System.out.println("Construction Sequence for given day " + (1 + i) + " = " + (queue.poll()));
				

				max--;

			}
		}
	}
}
