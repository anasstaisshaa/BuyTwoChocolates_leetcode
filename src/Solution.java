import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int answer = money - (prices[0]+prices[1]);

        return (answer >= 0) ? answer : money;
    }
}