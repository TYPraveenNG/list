package com.tyss.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class NestedList {
	public static void main(String[] args) {
		List<Integer> list = new Vector<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		List<Integer> list2 = new Vector<Integer>();
		list2.add(4);
		list2.add(9);
		list2.add(6);
		List<Integer> list3 = new Vector<Integer>();
		list3.add(7);
		list3.add(8);
		list3.add(9);

		List<List<Integer>> list1 = new Vector<List<Integer>>();

		list1.add(list);
		list1.add(list2);
		list1.add(list3);

		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("list1" + list1);


		int sum=0;
		for (int i = 0; i <= list1.size() - 1; i++) {
			System.out.println(list1.get(i).get(i));
			sum=sum+list1.get(i).get(i);
			
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int k=0,j=list1.size()-1 ; j >=0; j--,k++) {
			if(k<=list1.size()-1) {
			System.out.println(list1.get(k).get(j));
			sum1=sum1+list1.get(k).get(j);
			
			}
			
		}
		System.out.println(sum1);
		int diff=(sum-sum1);
		System.out.println(diff);
	}

}
