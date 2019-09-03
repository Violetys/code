package something1;

public class DTGH {
/*
 * 非动态规划
 * */
  public static int maxSubSum1(int[] arr) {
      int maxSum = 0;

      for (int i = 0; i < arr.length; i++)
          for (int j = i; j < arr.length; j++) {
              int thisSum = 0;
              for (int k = i; k <= j; k++)
                  thisSum += arr[k];// 求解[i,j]这段子序列的和
              if (thisSum > maxSum)
                  maxSum = thisSum;
          }
      return maxSum;
  }
/*
 * 动态规划算法
 * */
  public static int maxSubSum2(int[] arr) {
      int maxSum = 0;
      int thisSum = 0;
      for (int i = 0; i < arr.length; i++) {
          thisSum += arr[i];
          if (thisSum > maxSum)// thisSum在[0,maxSum]之间时不需要任何处理
              maxSum = thisSum;
          else if (thisSum < 0)// 说明加上当前元素使得子序列为负数了,那么抛弃这段子序列(相当于thisSum赋值为0),从下一轮for开始
              thisSum = 0;
      }
      return maxSum;
  }

  public static void main(String[] args) {
      int[] arr = {1,-2,3,4,4,-5,-6,1,8,9,5,5,-9,-9,-1};		//若数组够大则能看出时间差距

      long start = System.currentTimeMillis();
      int r = maxSubSum2(arr);
      long end = System.currentTimeMillis();
      System.out.println("maxValue=" + r + "  O(N)'s time:" + (end - start));
      
      long start2 = System.currentTimeMillis();
      int r2 = maxSubSum1(arr);
      long end2 = System.currentTimeMillis();
      System.out.println("maxValue=" + r2 + "  O(N^3)'s time:"
              + (end2 - start2));

  }
}