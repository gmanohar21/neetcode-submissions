class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> n = new HashMap<>();
        char arr[]=s.toCharArray();
        char arr1[]=t.toCharArray();
        if (s.length() != t.length()) {
         return false;
        }

        for(int i=0;i<arr.length;i++){
              m.put(arr[i],m.getOrDefault(arr[i],0)+1);
              n.put(arr1[i],n.getOrDefault(arr1[i],0)+1);
        }
        for(Character key:m.keySet()){
           if (!m.get(key).equals(n.get(key))){
                return false;
            }
        }
     
        return true;
    }
}
