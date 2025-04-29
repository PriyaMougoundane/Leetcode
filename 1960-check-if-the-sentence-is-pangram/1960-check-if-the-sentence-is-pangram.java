class Solution {
    public boolean checkIfPangram(String sentence) {

        int[] freq = new int[26];

        int len = sentence.length();

        for(int i =0; i<len ; i++){

        
           freq[sentence.charAt(i) - 'a']++;
        }

        for(int i =0;i < freq.length;i++){
            if(freq[i] == 0){
                return false;
                
            }

        }



          return true;

        
    }
}