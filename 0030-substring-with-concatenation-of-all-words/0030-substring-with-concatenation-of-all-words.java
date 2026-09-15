class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        int wcount = words.length;
        int wlength = words[0].length();

        int totallength = wcount*wlength;
        Map<String, Integer> wordFreq = new HashMap<>();
        for(String x: words){
            wordFreq.put(x, wordFreq.getOrDefault(x, 0) + 1);
        }
        List<Integer> ansList = new ArrayList<>();
        for(int i=0; i<wlength; i++){
            
            int match = 0;
            Map<String, Integer> seen = new HashMap<>();
            for(int left=i, right=i; right <= n-wlength; right += wlength){

                String next = s.substring(right, right+wlength);

                if(!wordFreq.containsKey(next)){
                    match = 0;
                    seen.clear();
                    left = right + wlength; 
                }else{

                    seen.put(next, seen.getOrDefault(next, 0) + 1);
                while(seen.get(next) > wordFreq.get(next)){

                        String leftString = s.substring(left, left+wlength);
                        seen.put(leftString, seen.get(leftString)-1);

                        match--;
                        left += wlength;
                    }
                    match++;
                }
                if(match == wcount){
                    ansList.add(left);
                }
            }
        }
        return ansList;
    }
}

