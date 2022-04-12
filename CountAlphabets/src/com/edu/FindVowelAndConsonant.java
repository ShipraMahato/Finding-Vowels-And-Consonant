package com.edu;

public class FindVowelAndConsonant {

	public static void main(String[] args) {
		 String str = "edubridge india";
	       
	        int vcount = 0;
	        int ccount = 0;
	 
	        for (int i = 0; i < str.length(); i++) {
	            
	            if (str.charAt(i) == 'a' 
	            	|| str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	                  
	                vcount++;
	                
	     	       	 }
	            else if(str.charAt(i)!=' '){
	            	ccount++;
	            	
	            }
	           
	        }
	        System.out.println("total no of vowels : " + vcount);	
            System.out.println("total no of Consonants : " + ccount);
	}

}
