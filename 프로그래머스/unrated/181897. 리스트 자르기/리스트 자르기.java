import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n){
            case 1:
                for(int i =0; i<b+1; i++)
                    answer.add(num_list[i]);
                break;
            case 2:
                for(int i = a; i < num_list.length;i++)
                    answer.add(num_list[i]);
                break;
            case 3:
                for(int i = a; i < b+1; i++)
                    answer.add(num_list[i]);
                break;
            case 4:
                for(int i = a; i< b+1; i += c)
                    answer.add(num_list[i]);
                break;
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}