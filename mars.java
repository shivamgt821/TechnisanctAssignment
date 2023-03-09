package com.jsp.advanceDSA;


	import java.util.Scanner;

	public class mars{

	    public static int marsExploration(String s) {
	    
	    int count=0;
	    for(int i=0; i<s.length();i=i+3)
	    {
	       if(s.charAt(i)!='S') 
	       {
	            count++;
	       }
	       if(s.charAt(i+1)!='O')
	       {
	           count++;
	       } 
	       if(s.charAt(i+2)!='S')
	       {
	           count++; 
	       } 
	    }
	    return count;

	}
	    public static void main(String[] args) {
	    
	        Scanner scn = new Scanner(System.in);
	        String s = scn.next();
	      System.out.println("Enter SOS : ");
	        System.out.println(marsExploration(s));
	        
	    }
	    
	
}
