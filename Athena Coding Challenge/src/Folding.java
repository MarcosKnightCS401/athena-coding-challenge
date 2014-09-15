
public class Folding {	
	public static void main(String[] args) {
		int [] ss = {4,2,3};
		int time = 0;
		int length = ss.length;
		int index = 0;
		int ht = ss[index];
		int newTime, newIndex, newHt;
		int period;
		System.out.println("time =" + time);
		System.out.println("length =" + length);
		System.out.println("index =" + index);
		System.out.println("ht =" + ht);
		System.out.println();
		
		//throw
		period = ss[index];
		newTime = time + ht;
		newIndex = newTime % length;
		newHt = ss[newIndex];
		
		period = period + ss[newIndex];
		time = newTime;
		index = newIndex;
		ht = newHt;
		System.out.println("time =" + time);
		System.out.println("length =" + length);
		System.out.println("index =" + index);
		System.out.println("ht =" + ht);
		
		//throw
		period = ss[index];
		newTime = time + ht;
		newIndex = newTime % length;
		newHt = ss[newIndex];
		
		period = ss[newIndex];
		time = newTime;
		index = newIndex;
		ht = newHt;
		System.out.println("time =" + time);
		System.out.println("length =" + length);
		System.out.println("index =" + index);
		System.out.println("ht =" + ht);

		
	}

}
