class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        //모든 원소들의 곱 < 모든 원소들의 합의 제곱 => 1 / 0 
        int sum = 0;
        int multiple = 1;
        
        for (int num : num_list) {
            sum += num;
            multiple = multiple * num;
        }
        
        if (multiple < sum * sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}