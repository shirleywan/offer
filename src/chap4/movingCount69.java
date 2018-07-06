import java.util.*;

class Solution69 {
    public int movingCount(int threshold, int rows, int cols)
    {
        if(rows <=0 || cols <= 0){return 0;}
        int num = 0;
        int count = 0;
        for(int i = 0 ;i < rows ; i++){
            for(int j = 0; j < cols ; j++){
                num =0 ;
                while(i > 10 ){num = num + i % 10; i /=10;}
                num = num + i ;
                while(j >10 ){num = num + j % 10; j /=10;}
                num = num + j ;
                if(num <= threshold) {count ++;}
            }
        }

        return count;
    }
}

class Solution {
    public int movingCount(int threshold, int rows, int cols){
        boolean[] flag = new boolean[rows*cols];
        return movingCount(threshold,rows,cols,0,0,flag);
    }

    public int movingCount(int threshold, int rows, int cols, int i, int j, boolean[] flag) {
        int index = i * cols + j;
        if (i<0 || i>=rows || j<0 || j>=cols || flag[index] || (sum(i)+sum(j))>threshold)
            return 0;
        flag[index] = true;
        return 1+movingCount(threshold,rows,cols,i+1,j,flag)
                +movingCount(threshold,rows,cols,i,j+1,flag);
    }

    public int sum(int num){
        if(num<=0)
            return 0;
        int sum = 0;
        while (num!=0){
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
}

public class movingCount69 {
    public static void main(String[] args){
        int threshold = 19;
        System.out.println(new Solution69().movingCount(19,35,37));
        System.out.println(new Solution().movingCount(19,35,37));
    }
}
