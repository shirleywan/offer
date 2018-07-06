/**
 * Created by c84104080 on 2018/7/5.
 */
import java.util.*;
class Solution66 {
    /**
     * 简单方法
     */
    ArrayList<Integer> list = new ArrayList<Integer>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        int mid = 0;
        if (list.size()!=0){
            Integer[] array=(Integer[])list.toArray(new Integer[list.size()]);
            Arrays.sort(array);
            if(list.size()%2==0){
                return (array[list.size()/2-1]+array[list.size()/2])/2.0;
            }
            else{
                return (double)array[list.size()/2];
            }
        }
        return 0.0;
    }
}
class Solution662 {
    /**
     * Java的PriorityQueue 是从JDK1.5开始提供的新的数据结构接口，默认内部是自然排序，结果为小顶堆，也可以自定义排序器，比如下面反转比较，完成大顶堆。
     * 只需要在new的时候传入一个comparator即可。
     * 为了保证插入新数据和取中位数的时间效率都高效，这里使用大顶堆+小顶堆的容器，并且满足：
     * 1、两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处；
     * 2、大顶堆的所有数据都小于小顶堆，小顶堆的所有数据都大于大顶堆，这样就满足了排序要求。
     */
    
    private PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    private PriorityQueue<Integer> maxQueue = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    int count = 0;

    public void Insert(Integer num) {
        count++;
        if ((count & 1) == 0) {
            if (!maxQueue.isEmpty() && num < maxQueue.peek()) {
                maxQueue.offer(num);
                num = maxQueue.poll();
            }
            minQueue.offer(num);
        } else {
            if (!minQueue.isEmpty() && num > minQueue.peek()) {
                minQueue.offer(num);
                num = minQueue.poll();
            }
            maxQueue.offer(num);
        }
    }

    public Double GetMedian() {
        if ((count & 1) == 0)
            return ((double) (maxQueue.peek() + minQueue.peek())) / 2.0;
        else
            return (double) maxQueue.peek();
    }
}
public class GetMedian66 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=0;i<num;i++){
            new Solution662().Insert(in.nextInt());
            System.out.println(new Solution662().GetMedian());
        }

    }
}
