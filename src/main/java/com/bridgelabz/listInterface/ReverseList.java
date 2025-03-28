package com.bridgelabz.listInterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
   public static void main(String[] args) {


      ArrayList<Integer> num1 =new ArrayList<Integer> ();
      num1.add(1);
      num1.add(2);
      num1.add(3);
      num1.add(4);
      num1.add(5);
      System.out.println(num1);
      for(int i=0;i<num1.size()/2;i++){
         Integer t;
         t=num1.get(i);
         num1.set(i, num1.get(num1.size()-i-1));
         num1.set(num1.size()-i-1,t );

      }
      System.out.println(num1);
   }
}


