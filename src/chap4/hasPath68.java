import java.util.ArrayList;

/**
 * Created by c84104080 on 2018/7/6.
 */
import java.util.*;

/**
 * 简单的动态规划，想法很简单，但是实现起来有点难。。自己写的太差了
 */
class Solution682 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visit = new boolean[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPath(matrix, rows, cols, i, j, str, 0, visit)) //通过遍历全部数组找到第一个字符
                    return true;
            }
        }
        return false;
    }

    public boolean hasPath(char[] matrix, int rows, int cols, int row, int col, char[] str, int curr, boolean[] visit) {
        int index = row * cols + col;
        if (row < 0 || col < 0 || row >= rows || col >= cols || visit[index] || matrix[index] != str[curr])
            return false;

        visit[index] = true;
        if (curr == str.length - 1) //是不是str的最后一位
            return true;
        curr++;

        if (hasPath(matrix, rows, cols, row + 1, col, str, curr, visit) ||
                hasPath(matrix, rows, cols, row - 1, col, str, curr, visit) ||
                hasPath(matrix, rows, cols, row, col + 1, str, curr, visit) ||
                hasPath(matrix, rows, cols, row, col - 1, str, curr, visit))//四个值里有1个符合条件，
                    //如全都不符合，返回false，调回hasPath，计算下一个点
            return true;

        visit[index] = false;
        return false;

    }
}
public class hasPath68 {
    public static void main(String[] args){
        char[] nums = {'a','b','c','e', 's','f','c','s', 'a','b','e','e'};
        char[] str = {'a','b','c','b'};
        System.out.println(new Solution682().hasPath(nums,3,4,str));
    }
}
