class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        int length = phone_number.length();
        return sb.replace(0,length-4,"*".repeat(length-4)).toString();
    }
}