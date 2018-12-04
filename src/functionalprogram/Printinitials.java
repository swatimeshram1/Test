package functionalprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Printinitials {
	     
	 public static void main(String args[]) throws Exception
	 {
		 BufferedReader bufferedreader= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter string");
		 String str=bufferedreader.readLine();
		 str=" "+str;
		 int length=str.length();
		 char[] temp=new char[length];
		 
		 
		 for( int i=0;i<length;i++)
		 {
			   char c= str.charAt(i);
	           if(c==' ')
	           {
	        	   temp[i]=str.charAt(i+1);
	        	   System.out.println(temp[i]+ " ");
	        	   
	        	   }
		 }
		 
		
			for(int m =0; m< length; m++) {
				if(temp[m] == 'k') {
				        
						System.out.println();
			
			showLines("/home/admin1/eclipse-workspace/basic programs/src/functionalprogram/initials.txt" , 1 ,9);
				 
				}
			}
				for(int n =0; n< length; n++) {
					if(temp[n] == 'd') {
					        
							System.out.println();

			
				showLines("/home/admin1/eclipse-workspace/basic programs/src/functionalprogram/initials.txt" , 11,19);
					}
				}
				for(int l =0; l< length; l++) {
					if(temp[l] == 'w') {
					        
							System.out.println();

			showLines("/home/admin1/eclipse-workspace/basic programs/src/functionalprogram/initials.txt", 21 , 29);
		}
				}
		}
		
		
		
		public static void showLines(String fileName, int startLine, int endLine) 
	    {
	       String str = " ";
	       
	       String newstr = " ";
	       
	       String newstr1 = " ";
	       
	        int currentLine = 1;

	        try {
	        
	        	BufferedReader br = new BufferedReader (new FileReader(fileName));                
	            
	            
	        	while(currentLine < startLine) 
	            
	        	{
	           
	        		if (br.readLine()==null)
	                
	        		{
	                
	        			System.out.println("File small");
	                
	        		}
	        	
	                 currentLine++;
	             }        
	             
	      
	            
	        	while(currentLine <= endLine) 
	            
	        	{
	               String  line = br.readLine();
	            
	                 if (line == null) 
	                 
	                 {
	                     return;
	                 
	                 }
	                 
	                 currentLine++;
	                 
	                 str = line;
	    
	                 newstr = str.replaceAll("1", "*");
	                 
	                 newstr1 = newstr.replaceAll("0", " ");

	                 System.out.println(newstr1);
	             }
	        	
	        	
	         } 
	         
	        catch (IOException ex) 
	        
	        {
	        
	        	System.out.println("Problem reading file.\n" + ex.getMessage());
	         } 
	        
	                }                    
	            
	
	 }


