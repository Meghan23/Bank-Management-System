import java.util.*;

class CScan{ 
	
	int head=0;
	int dir=0;
	Scanner scn=new Scanner(System.in);
	int start=0;
	int sum = 0;
	int input[]=new int[20];
	int m,n;
	 
	void moveLeft(int stop){  
		for(int i=(start-1);i>stop;i--){
			sum +=Math.abs(input[i]-input[i-1]);
            System.out.println("Head moved from "+input[i]+" to "+input[i-1]);
			System.out.println("Movement : "+Math.abs(input[i]-input[i-1]));
		}
	}
	 
	void moveRight(int stop){
		for(int i=start;i<stop;i++){
			sum +=Math.abs(input[i]-input[i+1]);
		    System.out.println("Head moved from "+input[i]+" to "+input[i+1]);
			System.out.println("Movement : "+Math.abs(input[i]-input[i+1]));
	    }
	}
	 
	void sort(){
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(input[i]>input[j]){
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(input[i]>head){
				start=i;
				break;
			} 
		} 
    }
	 
	void setData(){
		int temp;
		System.out.println("Enter the number of requests :");
		n=scn.nextInt();
		System.out.println("Enter the number of cylinders :");
		m=scn.nextInt();
		System.out.println("Enter The Head Position :");
		temp=scn.nextInt();
		while(temp >= m){
			System.out.println("Invalid Input!");
			temp = scn.nextInt();
		}
		head=temp;
		System.out.println("Enter The Direction of Head Movement :- 0 for Left or 1 for Right :");
		dir=scn.nextInt();
		System.out.println("Enter The requests :");
		for(int i=0;i<n;i++){
			temp=scn.nextInt();
			while(temp >= m){
				System.out.println("Illegal Request!");
				temp = scn.nextInt();
			} 
			input[i]=temp;
		}
	}
	 
	void begin(){
		setData();
		sort();
		if(dir==0){
			sum += Math.abs(head-input[start-1]);
			System.out.println("Head moved from "+head+" to "+input[start-1]);
			System.out.println("Movement : "+sum);
			moveLeft(0);
			sum += input[0];
			System.out.println("Head moved from "+input[0]+" to 0 then to "+(m-1));
			System.out.println("Movement : "+input[0]);
			int temp = start;
			start = n;
			sum += Math.abs((m-1)-input[start-1]);
			System.out.println("Head moved from "+(m-1)+" to "+input[start-1]);
			System.out.println("Movement : "+Math.abs((m-1)-input[start-1]));
			moveLeft(temp);
		}
		else
		{
			sum += Math.abs(head-input[start]);
			System.out.println("Head moved from "+head+" to "+input[start]);
			System.out.println("Movement : "+sum);
			moveRight(n-1);
			sum += Math.abs((m-1) - input[n-1]);
			System.out.println("Head moved from "+input[n-1]+" to "+(m-1)+" then to 0");
			System.out.println("Movement : "+Math.abs((m-1) - input[n-1]));
			sum += input[0];
			System.out.println("Head moved from 0 to "+input[0]);
			System.out.println("Movement : "+input[0]);
			int temp = start-1;
			start = 0;
			moveRight(temp);
		}
		System.out.println("The Total Movement is : "+sum);
	} 
}

public class Driver{
	
	public static void main(String args[]){
		CScan obj=new CScan();
		obj.begin();
	}
	
}

/*Output :
 
Enter the number of requests :
5
Enter the number of cylinders :
200
Enter The Head Position :
100
Enter The Direction of Head Movement :- 0 for Left or 1 for Right :
0
Enter The requests :
23
89
132
42
187
Head moved from 100 to 89
Movement : 11
Head moved from 89 to 42
Movement : 47
Head moved from 42 to 23
Movement : 19
Head moved from 23 to 0 then to 199
Movement : 23
Head moved from 199 to 187
Movement : 12
Head moved from 187 to 132
Movement : 55
The Total Movement is : 167
-----------------------------------------------------------------
Enter the number of requests :
7
Enter the number of cylinders :
200
Enter The Head Position :
100
Enter The Direction of Head Movement :- 0 for Left or 1 for Right :
1
Enter The requests :
198
196
92
131
77
121
192
Head moved from 100 to 121
Movement : 21
Head moved from 121 to 131
Movement : 10
Head moved from 131 to 192
Movement : 61
Head moved from 192 to 196
Movement : 4
Head moved from 196 to 198
Movement : 2
Head moved from 198 to 199 then to 0
Movement : 1
Head moved from 0 to 77
Movement : 77
Head moved from 77 to 92
Movement : 15
The Total Movement is : 191
*/