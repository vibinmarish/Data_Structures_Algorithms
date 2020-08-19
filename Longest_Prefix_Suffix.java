
import java.util.*;
import java.lang.*;
import java.io.*;

class Vibin {
        public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
		    String ar=br.readLine();
		    int len=0;
		    int i=ar.length()/2;
		    while(i<ar.length())
		    {
		        if(ar.charAt(i)==ar.charAt(len)){
		            ++i;
		            ++len;
		        }
		        else{		//If its not the same we reset the len pointer to starting index and calculate i again. This will check all possibilities.
		            i=i-len+1 ;
                    	   len=0;
		        }
		    }
		    System.out.println(len);
	}
}}	