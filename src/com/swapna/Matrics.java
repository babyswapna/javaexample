package com.swapna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Matrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int rows=3;
          int coln=3;
          
          int[]ab = {1,2,3};
          int[][]a = {{1,2,3},{6,7,8}};
         // System.out.println(a[1][1]);
          
          List<Integer> lst = new ArrayList<>();
          
          lst.add(1);
          for(int i=0;i<=10;i++) {
        	  lst.add(i);
          }
          System.out.println(lst);
          
          
          Set<Integer> lst1 = new TreeSet<>();
          lst1.add(2);
          lst1.add(3);
          lst1.add(1);
//          for(int i=0;i<=10;i++) {
//        	  lst1.add(i);
//          }
          System.out.println(lst1);
          
          
          
          Map<Integer,String> mapp = new HashMap<>();
          mapp.put(3,"sada");
          mapp.put(2,"sada");
          mapp.put(2,"23444");
          System.out.println(mapp.keySet());
          System.out.println(mapp.values());
          
          
          
          
          Map<Integer,String> mapp1 = new TreeMap<>();
          mapp1.put(3,"sada");
          mapp1.put(2,"sada");
          mapp1.put(2,"23444");
          System.out.println(mapp1);
         
          
	}


}
