
public class Solution{
		
    public String SolutionExecute(String input){
        String output = new String(input);
        
        if(output.length() > 1){
        	while(verifyRepeat(output, "AA") ||
        		  verifyRepeat(output, "BB") ||
        		  verifyRepeat(output, "CC")) {
        		output = removeAllRepeats(output, "AA");
        		output = removeAllRepeats(output, "BB");
        		output = removeAllRepeats(output, "CC");          		
        	}
    	}

        return output;
    }
    
    /**
     * @param word
     * @param characters
     * @return boolean if there is this characters in the word
     */        
    public boolean verifyRepeat(String word, String characters) {
    	boolean result = false;
    	
    	int indexValue = word.indexOf(characters);
    	if(indexValue >= 0) {
    		result = true;
    	}
    	
    	return result;
    }    
    
    /**
     * @param word
     * @param characters
     * @return string without repeated characters
     */        
    public String removeRepeat(String word, String characters){
    	String result = "";
    	
    	int indexValue = word.indexOf(characters);
    	String before = word.substring(0, indexValue);    	
    	String after = word.substring(indexValue+2, word.length());
    	
    	result = before+after;
    	
    	return result;
    }
    
    /**
     * @param word
     * @param characters
     * @return string without all repeated characters
     */            
    public String removeAllRepeats(String word, String characters){
    	String output = word;
    	
      	while(verifyRepeat(output, characters)) {
           output  = removeRepeat(output, characters);
    	}
    	
    	return output;
    }    

    public static void main(String[] args) throws Exception
    {
        Solution answer = new Solution();
        String transformedData = answer.SolutionExecute("ABCBBCBA");    	
    	System.out.println(transformedData);

    }

}