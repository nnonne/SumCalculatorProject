public class SumCalculator {
    public int sum(int n){
        int answer = 0;
        if (n == 0) throw new IllegalArgumentException("n cannot be zero");
        for (int i = 0; i < n+1; i++) {
            answer+=i;
        }
        return answer;
    }
}
