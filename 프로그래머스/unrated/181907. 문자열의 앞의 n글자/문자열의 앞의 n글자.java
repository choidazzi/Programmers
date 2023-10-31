class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strs = my_string.split("");
        
        for (int i = 0; i < n; i++) {
            answer += strs[i];
        }
        
        return answer;
    }
}