
import java.util.*;
import java.lang.*;
import java.io.*;

class  Vibin {
                public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
		    String ar=br.readLine();   
		    permute(ar,"");
	}
}
    public static void permute(String s, String ans){
    
        if(s.length()==0){
            System.out.print(ans+" ");
        }
        
        for(int i=0;i<s.length();i++){
        
            char ch=s.charAt(i);
            
            String rest=s.substring(0,i)+s.substring(i+1);	//Create rest of the string after excluding the ith character     
                   
            permute(rest,ans+ch);			// Recursively call the method with the rest and ans+ith character
            
        }
    }
}		    
