import java.util.*;
public class IP
{
	public static void main(String arg[])
	{

		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter Complete IP Address");
		String a = sc.next();

		x = Integer.parseInt(a.substring(0,a.indexOf('.')));
		if(x>0 && x<128)
			System.out.println("Class A");
		else if(x>=128 && x<192)
			System.out.println("Class B");
		else if(x>=192 && x<224)
			System.out.println("Class C");
		else if(x>=224 && x<240)
			System.out.println("Class D");
		else if(x>=240 && x<256)
			System.out.println("Class E");
		else
			System.out.println("IP Address not valid\n");

		int max =8, min;
		int m[][]={	{0, 4, 0, 0, 0, 0, 0, 8}, 
					{4, 0, 8, 0, 0, 0, 0, 9}, 
					{0, 8, 0, 7, 0, 4, 0, 0}, 
					{0, 0, 7, 0, 9, 3, 0, 0}, 
					{0, 0, 0, 9, 0, 6, 0, 0}, 
					{0, 0, 4, 3, 6, 0, 2, 0}, 
					{0, 0, 0, 0, 0, 2, 0, 1}, 
					{8, 9, 0, 0, 0, 0, 1, 0}}; 

		System.out.println("Adjacency Matrix for graph is\n {0, 4, 0, 0, 0, 0, 0, 8},\n {4, 0, 8, 0, 0, 0, 0, 9},\n {0, 8, 0, 7, 0, 4, 0, 0},\n {0, 0, 7, 0, 9, 3, 0, 0},\n {0, 0, 0, 9, 0, 6, 0, 0},\n {0, 0, 4, 3, 6, 0, 2, 0},\n {0, 0, 0, 0, 0, 2, 0, 1},\n {8, 9, 0, 0, 0, 0, 1, 0}\n");

		int d[] =	{0, 0, 0, 0, 0, 0, 0, 0};
		int v[] = 	{0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("Enter node to start from");
		int n = sc.nextInt();
		
		for(int i=0; i<max; i++)
			for(int j=0; j<max; j++)
				if(m[i][j]==0)
					m[i][j]=Integer.MAX_VALUE;

		for(int i=0; i<max; i++)
			d[i]= m[n][i];
		d[n]=0;
		v[n]=1;
		for(int count =1; count<max; count++){

			min = Integer.MAX_VALUE;
			for(int i=1; i<max ; i++)
				if(v[i]==0 && d[i]<min){
					min = d[i];
					n=i;
				}
			
			v[n]=1;

			for(int i=0; i<max; i++)
				if(v[i]==0 && m[n][i]!=Integer.MAX_VALUE && (m[n][i]+d[n])< d[i])
					d[i] = d[n]+m[n][i];
		}
		System.out.println("Distance of nodes from source node is");
		for(int i=0; i<max; i++)
			System.out.println(""+i+"-("+d[i]+")");
	}
}
