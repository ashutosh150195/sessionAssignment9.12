package com.java.assignmentnine.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class StoreValues {

	public static BufferedReader br ;
	public static String input ;
	public static ArrayList<Object> store ;
	public static HashSet<Object> values ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		System.out.println("Elements in ArrayList :");
		Iterator<Object> i = store.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		removeDuplicateElement() ;
		System.out.println("Elements in HashSet :");
		i = values.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	private static void removeDuplicateElement() {
		// TODO Auto-generated method stub
		values = new HashSet<>();
		Iterator<Object> i = store.iterator();
		while (i.hasNext()) {
			values.add(i.next());
		}
	}

	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		store = new ArrayList<>();
		
		for (int i = 0; i < Long.BYTES; i++) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			store.add(input);
		}
		
	}

}
