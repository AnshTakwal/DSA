class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0 ; i < k; i++){
            sum += cardPoints[i];
        }
        int left = k - 1;
        int right = cardPoints.length - 1;
        int newSum = sum;
        for(int j = 0; j < k ; j++){
            newSum = newSum - cardPoints[left] + cardPoints[right];
            left--;
            right--;
            sum = Math.max(newSum,sum);
        }
        return sum;
    }
}