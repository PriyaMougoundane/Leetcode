class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = 0;
        
        if (ruleKey.equals("type")){
             index = 0;

        }else if (ruleKey.equals("color")){
             index = 1;
        }else{
             index = 2;
        }
        for(List item : items){

           if (item.get(index).equals(ruleValue)) {
                count++;
            }

        }

        /*
      for(List item : items){
               if((ruleKey.equals("type")) && (item.get(0).equals(ruleValue))){
	               
	                count++;
	            }else if((ruleKey.equals("color")) && (item.get(1).equals(ruleValue))){
	                
	                count++;
	            
	            }else{
	                return count ++;
	            }

      }
      */
        
        return count ;

    }
}