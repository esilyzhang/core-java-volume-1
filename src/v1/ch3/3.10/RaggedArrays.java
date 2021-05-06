public class RaggedArrays {
  public static void main(String[] args) {
    // 参差不齐的数组
    final int NMAX = 10;
    // 定义数组
    int[][] odds = new int[NMAX + 1][];
    for (int n = 0; n < odds.length; n++)
      odds[n] = new int[n + 1];
    // 赋值
    for (int n = 0; n < odds.length; n++)
      for (int k = 0; k < odds[n].length; k++) {
        int lotteryOdds = 1;
        for (int i = 1; i < k; i++)
          lotteryOdds = lotteryOdds * (n - i + 1) / i;
        odds[n][k] = lotteryOdds;
      }
    // 打印三角数组
    for (int[] row : odds) {
      for (int odd : row)
        System.out.printf("%4d", odd);
      System.out.println();
    }
  }
}
