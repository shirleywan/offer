package practice;

public class sortAge {
	public static void sortAge(int[] age){
		int oldestAge=99;
		int[] timeAge=new int[oldestAge+1];
		for(int i=0;i<age.length;i++){
			int num=age[i];
			if(num<0){throw new IllegalArgumentException("Invalid args: 前序/中序数组有问题");}
			timeAge[num]++;
		}
		int index=0;
		for(int i=0;i<=oldestAge;i++){//从0-99，依次找到有值的年龄值
			for(int j=0;j<timeAge[i];j++){//timeAge[i]=0的不会进入循环
				age[index]=i;//重新排序age数组，i有值的会放在age数组中
				index++;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] age={23,24,23,25,30};
		sortAge(age);
		for(int a:age){
			System.out.println(a+" ");
		}
	}
}
