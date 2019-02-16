import java.util.*;

class Data implements Cloneable
{
    private int allocation[][];
    private int max[][];
    int need[][];
    private int total[];
    int available[];
    private int request[];
    Boolean finish[];
    
    public Object clone()throws CloneNotSupportedException{      	
    	return super.clone();      
    }
    
    public void setData(int n,int m,Scanner sc) {   
		
    	int sum=0;
    	finish = new Boolean[n];
    	System.out.println("Enter allocation matrix: ");
		allocation = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
				allocation[i][j] = sc.nextInt(); 
		}
		System.out.println("Enter Max matrix: ");
		max = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)				
				max[i][j] = sc.nextInt();
		}            
		
		total = new int[m];
		System.out.println("Enter Total Resources: ");
		for(int i=0; i<m; i++)
			total[i] = sc.nextInt();		
		
		need = new int[n][m];
		System.out.println("The Need Matrix is :");
		for(int i=0; i<n; i++)							// Calculating need matrix using formula max-allocation
		{
			for(int j=0; j<m; j++)
			{
				need[i][j] = max[i][j] - allocation[i][j];
				System.out.print("  "+need[i][j]);
			} 
			System.out.println("");
		}					

		available = new int[m]; 		
		System.out.println("The Available Matrix is :");   // Calculating available resources 
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
				sum += allocation[j][i];
			available[i] = total[i] - sum;
			System.out.print(" " +available[i]);
			sum = 0;
		}
		System.out.println("");
    }
    
    public void rrAlgo(int n,int m,Scanner sc) {
		
    	int x,j;
    	System.out.println("Enter the index of requesting process: ");
		x = sc.nextInt();
		request = new int[m];
		System.out.println("Request Resources: ");
		for(int i=0; i<m; i++)			   
			request[i] = sc.nextInt(); 
		for(j=0; j<m; j++)
		{ 
			if((need[x][j] < request[j]) || (request[j] > available[j])) {  //Checking whether request is valid
				System.out.println("Request is invalid.");
				break;
			}
		}
		if(j==m)
		{		               
			System.out.println("Request is valid.");
			for(int i=0; i<m; i++)					// All conditions satisfied so resources are allocated
			{
				need[x][i]-=request[i];
				allocation[x][i]+=request[i];
				available[i] -= request[i];
			}			
			System.out.println("The new Allocation matrix is: ");
			for(int i=0; i<n; i++)
			{
				for(int k=0; k<m; k++)
					System.out.print("  "+allocation[i][k]);
				System.out.println("");
			}			
			System.out.println("The new Available matrix is: ");
			for(int i=0; i<m; i++)
				System.out.println(" " +available[i]);
			System.out.println("The new Need matrix is: ");
			for(int i=0; i<n; i++)
			{
				for(int k=0; k<m; k++)
					System.out.print("  "+need[i][k]);
				System.out.println("");
			}
			System.out.println("Running Safety Algorithm: ");
			this.safetyAlgo(n, m);					//Running Safety Algorithm to find Safe sequence(if any)
		}
    }
		   
    public Boolean safetyAlgo(int n,int m) {
    	
    	int work [] = new int[m];
    	for(int j=0;j<m; j++) {
    		int temp = available[j];
    		work[j] = temp;
    	}
    	Boolean exists;
		int count = n;
		int i,p;
		for(int j=0;j<n; j++)
			finish[j]=false;
		while(count!=0)
		{
			exists=false;
			for(p=0;p<n; p++)
			{	
				if(finish[p]==false){			//Looking for process which hasn't been executed
					for(i=0; i<m; i++)
					{
						if(need[p][i] > work[i])	//Checking whether sufficient resources are available
							break;
					}
					if(i==m)
					{
						finish[p] = true;
						System.out.println("Executed:P" +p); 
						for(int j=0; j<m; j++)
							work[j] += allocation[p][j];
						exists = true;
						count--;
					}
				}
			}		        
			if(exists==false) {					//Not a single executable process available so system is in unsafe state
				System.out.println("System is in unsafe state.");
				return false;
			}				
		}
		System.out.println("System is in safe state.");
		return true;
    }
}

public class Bankers {
	
	public static void main(String[] args) {		 
		try {
			Data obj1 = new Data();
			int n, m;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of Processes: ");
			n = sc.nextInt();
			System.out.println("Enter number of Resource types: ");
			m = sc.nextInt();
			obj1.setData(n, m, sc);
			Data obj2=(Data)obj1.clone();
			Boolean is_safe = obj2.safetyAlgo(n,m);
			if(is_safe)	{
				obj2.rrAlgo(n,m,sc);			//Resource Request is considered only if system is in safe state
			}			
		}catch(CloneNotSupportedException c){}
	}
}

/*Output :
Enter number of Processes: 
5
3Enter number of Resource types: 

Enter allocation matrix: 
0
1
0
2
0
0
3
0
2
2
1
1
0
0
2
Enter Max matrix: 
7
5
3
3
2
2
9
0
2
2
2
2
4
3
3
Enter Total Resources: 
10
5
7
The Need Matrix is :
  7  4  3
  1  2  2
  6  0  0
  0  1  1
  4  3  1
The Available Matrix is :
 3 3 2
Executed:P1
Executed:P3
Executed:P4
Executed:P0
Executed:P2
System is in safe state.
Enter the index of requesting process: 
1
Request Resources: 
1
0
2
Request is valid.
The new Allocation matrix is: 
  0  1  0
  3  0  2
  3  0  2
  2  1  1
  0  0  2
The new Available matrix is: 
 2
 3
 0
The new Need matrix is: 
  7  4  3
  0  2  0
  6  0  0
  0  1  1
  4  3  1
Running Safety Algorithm: 
Executed:P1
Executed:P3
Executed:P4
Executed:P0
Executed:P2
System is in safe state.
*/