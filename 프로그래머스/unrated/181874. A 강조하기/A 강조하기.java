class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strs = myString.split("");
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].equals("a") || strs[i].equals("A")) {
                answer += strs[i].toUpperCase();
            } else {
                answer += strs[i].toLowerCase();
            }
        }
        
        return answer;
    }
}