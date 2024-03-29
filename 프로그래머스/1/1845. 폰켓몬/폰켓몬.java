import java.util.*;
class Solution {    
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() >= len/2) {
            answer = len/2;
        } else {
            answer = set.size();
        }
        return answer;
    }
}