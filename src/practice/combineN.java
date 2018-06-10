package practice;
/**
 * JAVA:递归实现输出正整数和等于n的所有不增的正整数和式
 * @author Administrator
 *
 */
public class combineN {
    int[] a=new int[20];
    int oneNum=0;
    public static void main(String[] args) {
    	combineN one=new combineN();
        one.oneNum=7;
        one.a[0]=one.oneNum;
        System.out.print(one.oneNum+"=");
        System.out.printf("%2d\n",one.oneNum);
        one.exOne(one.oneNum, 0);
    }

    public void exOne(int num,int end){//表示最后一个位置是end，要分解的数为num
        //分解
        a[end]=a[end]-1;
        int orther=num-a[end];//剩余值
        if(orther<=a[end]){
            a[end+1]=orther;//放入  
            end++;//使end与当前指向匹配
        }else{
            do{
                a[end+1]=a[end];
                end++;
                orther=orther-a[end];
            }while(orther>a[end]);
            a[end+1]=orther;//放入
            end++;
        }
        //后续没清除的值会影响计算结果
        int len=a.length;
        while((end+1)<=(len-1)&&a[end+1]!=0){
            a[end+1]=0;
            end++;//end与指向匹配
        }
        //输出数组
        int i=0;
        System.out.print(this.oneNum+"=");
        while(a[i]!=0){
            if(i==0){
                System.out.printf("%2d",a[i]);
            }else{
                System.out.printf("+%2d",a[i]);
                }
                i++;
        }
        System.out.println();
        //判断数组里的值有没有大于1的，有的话，继续分解

        int one=end;
        int temp=0;
        while(one>=0){
            temp=temp+a[one];
            if(a[one]>1){
                this.exOne(temp, one);
                one=end; 
            }
            one--;
        }
        //如果都没有，说明分解完毕，
    }

}
