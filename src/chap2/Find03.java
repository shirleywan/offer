package chap2;
/**
 * 二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author Administrator
 *
 */
public class Find03 {
    public boolean Find(int target, int [][] array) {
        int i=0;int j=array[0].length-1;
        while(i<array.length && j>=0){
            if(target>array[i][j]){i++;continue;}
            if(target<array[i][j]){j--;continue;}
            if(target==array[i][j]){return true;}
        }
        return false;
    }
}
