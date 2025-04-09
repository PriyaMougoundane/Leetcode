class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        
        int m = s.length();
        int n = p.length();

        int[] sfreq = new int[26];
        int[] pfreq = new int[26];

        if(n>m){
            return new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            pfreq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            sfreq[s.charAt(i)-'a']++;
        }
        List<Integer> res = new ArrayList();
        for(int i=n;i<m;i++){
            if(Arrays.equals(sfreq,pfreq)){
                res.add(i-n);

            }
            sfreq[s.charAt(i)-'a']++;
            sfreq[s.charAt(i-n)-'a']--;

        }

        if(Arrays.equals(sfreq,pfreq)){
            res.add(m-n);
        }
       return res;

        
    }
}