class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> freq = new HashMap<Character,Integer>();
        
        int l=0,r=0;
        int ans=0;
        
        while(r<n)
        {
            if(freq.containsKey(s.charAt(r)))             // here we check if "freq" contain character at index 'r' of string 's'
            {
                l=Math.max(freq.get(s.charAt(r))+1,l);    // if yes then we move left position to the next index of current 'r' (i.e, index at which the character just repeated)
            }                                                 
            freq.put(s.charAt(r),r);                    //in else case (that mean the character is not present previously, then we put that charcter at index 'r'
            ans=Math.max(ans,r-l+1);                          // ans will contain the longest length of the string we get so far 
            r++;
        }
        return ans;
    }
}
