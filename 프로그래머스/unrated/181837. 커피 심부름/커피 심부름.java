class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String menu : order)
            answer += menu.contains("latte")? 5000 : 4500;
        return answer;
    }
}