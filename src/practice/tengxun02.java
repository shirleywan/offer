package practice;

import java.util.*;

class Task{
	int id;
	int time;
	int diff;
	public int getId() {
		return id;
	}
	public void setJobid(int id) {
		this.id = id;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDiff() {
		return diff;
	}
	public void setDiff(int diff) {
		this.diff = diff;
	}
	
}
class Machine{
	int machineid;
	int time;
	int diff;
}

public class tengxun02 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<n;i++){
        	Task task=new Task();
        	task.id=i;
        	task.diff=in.nextInt();
        	task.time=in.nextInt();
        }
        for(int i=0;i<m;i++){
        	Machine machine=new Machine();
        	machine.machineid=i;
        	
        }
//        for(int i=0;i<m;i++){
//        	machTime[i]=in.nextInt();
//        	machDiff[i]=in.nextInt();
//        }
        
        
	}
}
