/**
 * Created by c84104080 on 2018/7/6.
 */

import java.util.*;
class tmp{
    public tmp() {
    }

    public tmp(Integer num,Integer pos) {
        this.pos = pos;
        this.num = num;
    }

    public Integer pos;
    public Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

}

class Solution67 {
    public ArrayList<Integer> maxInWindows1(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(num.length==0 || size<=0 || size>num.length){return list;}
        int max=num[0];
        int i,j;
        for (i=0;i<size;i++){ //第一个滑窗
            if(num[i]>max){max = num[i];}
        }
        list.add(max);
        for(j=0;j<i && j<num.length-size && i<num.length ; i++ , j++){
            if(num[i] > max) {max = num[i];list.add(max);}
            else{
                if(num[j] == max) {
                    max = num[j+1];
                    for (int p=j+1;p<=i;p++){ //第一个滑窗
                        if(num[p]>max){max = num[p];}
                    }
                }
                list.add(max);
            }
        }
        return list;
    }

    /**
     *第二种：使用java的优先队列（也就是堆），我们可以使用最大堆（PriorityQueue默认是最小堆，构建最大堆只需要在构建时传入一个comparator即可），
     * 在滑动窗口滑动时，将当前元素加入最大堆（PriorityQueue）中，堆顶的元素即是最大值，
     * 同时还要判断当前元素是否存在于当前窗口中，不存在的话弹出，最后就把该元素添加入Arraylist
     */


    public ArrayList<Integer> maxInWindows2(int [] num, int size) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (num==null)
            return arr;
        if (num.length<size||size<=0)
            return arr;
        PriorityQueue<tmp> q = new PriorityQueue<>(100, new Comparator<tmp>() {
            @Override
            public int compare(tmp o1, tmp o2) {
                return o2.num-o1.num;
            }
        });
        for (int i=0;i<size-1;i++)
            q.offer(new tmp(num[i],i));
        for (int i=size-1;i<num.length;i++){
            q.offer(new tmp(num[i],i));
            tmp p = q.peek();
            while (p.getPos()<i-(size-1)){
                q.poll();
                p = q.peek();
            }
            arr.add(p.getNum());
        }

        return arr;

    }

    /**
     * 第三种方法： -- 很巧！
     * 我们可以使用双向队列（Linklist），队列中只存放当前元素的下标，设新来的元素为k，如果前面的元素比k小，直接把前面的删除（因为不可能成为后面窗口的最大值），
     * 如果前面的元素比k大，判断是否还在窗口范围内，不在则移除
     * 1.先判断当前队列是否为空，如果不空而且当前元素比队列中尾端的元素大，将队列元素的尾端弹出；
     * 2.判断队列头元素（存的是下标）是否还在滑动窗口范围中，不在则把头元素移除；
     */

    public ArrayList<Integer> maxInWindows3(int [] num, int size) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if (num==null)
            return arr;
        if (num.length<size||size<=0)
            return arr;
        Deque<Integer> queue = new LinkedList<>(); //双向链表
        for (int i=0;i<num.length;i++){
            while (!queue.isEmpty()&&num[i]>=num[queue.getLast()])//当前值大于最小值
                queue.pollLast();
            while (!queue.isEmpty()&&queue.getFirst()<i-(size-1)) //队头元素是不是在滑窗范围内
                queue.pollFirst();
            queue.offerLast(i);
            if (i+1>=size)
                arr.add(num[queue.getFirst()]); //getFirst是最大值
        }
        return arr;

    }


}
public class maxInWindows67 {
    public static void main(String[] args){
        int[] nums={2,3,4,2,6,2,5,1};
        int win = 3;
        System.out.println(new Solution67().maxInWindows1(nums,win));
        System.out.println(new Solution67().maxInWindows2(nums,win));
        System.out.println(new Solution67().maxInWindows3(nums,win));
    }
}
