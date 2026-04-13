class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> list=new HashSet<>();
       for(int x:nums)
       {
        if(list.contains(x))
        return true;
        else
        list.add(x);
       } 
       return false;
    }
}