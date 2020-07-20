class  {
    static String pre(String s[],int n)
    {
        			    String prefix="";		//Empty string to add common prefix
			    int index=0;
			       for(char c:s[0].toCharArray())		//Looping through every character of the first word.
			       {
			           for(int i=1;i<n;i++)				//Loop to for every word in the string array
			           {
			               if(index>=s[i].length() || c!=s[i].charAt(index))		//Checking if the index is not going past the length of each words
			               											//We are checking each words with the same "index" to see if all words with the index  is haveing same character.
			               return prefix;
			           }
			           prefix=prefix+c;
			           index++;
			       }
			return prefix;
     }
    }