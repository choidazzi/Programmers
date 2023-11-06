class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 x에 있다";
        int place = 0;
        for (int i = 0; i < seoul.length; i++ ){
            if (seoul[i].equals("Kim")) {
                place = i;
            }
        }
        return answer.replace("x", place + "");
    }
}