package com.tyss.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("hgdd");
		List<String> list = new ArrayList<String>();

		boolean b = list.add(s1);
		boolean b1 = list.add(s2);

		int a = list.size();

		String str = list.get(1);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}