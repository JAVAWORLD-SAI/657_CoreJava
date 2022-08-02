package com.examples;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListCol {

	public static void main(String[] args) {
		
		List<String> li= new LinkedList<String>();
		li.add("SAICHAND");
		li.add("RAM");
		li.add("SAM");
		li.add("RAJ");
		li.add("DIO");
		li.add("TIO");
		li.add("RIO");
		li.add(null);
		li.add(null);
		System.out.println("LIST " +li);
		
		Set<String> st= new HashSet<String>();
		st.add("DKP");
		st.add("nio");
		st.add(null);
		st.add("gio");
		st.add("eio");
		st.add(null);
		System.out.println("SET  "  + st);

	}

}
