import java.util.*;

public class Division
{    
    public static void display(int arr[])//print array
    {
   	 for(int i=0;i<arr.length;i++)
   		 System.out.print(arr[i]);    
    }

    public  static int[] ls(int[] arr) // left shift data
    {    
   	 for(int i=0;i<arr.length-1; i++)
   		 arr[i]=arr[i+1];
   	 return arr;
    }

    public static int[] binary(int decimal) //decimal to binary
    {    
   	 int[] arr=new int[16];
   	 int i=0,temp,counter=0;
   	 while(decimal>0)
   	 {
   	   temp=decimal %2;
   	   decimal=decimal/2;
   	   arr[counter++]=temp;
   	 }
   	 int[] reverse=new int[16];
   	 int var=arr.length-1;
   	 for(int n:arr)
   	   reverse[var--]=n;
   	 return reverse;
    }
    
    public static double b2d(int arr[]) //binary to decimal
    {    
   	 int i=0;
   	 double sum=0;
   	 for(int counter=arr.length-1;counter>=0;counter--)
   		 sum=sum+Math.pow(2,i++)*arr[counter];
   	 return sum;
    }
    
    public static int[] twoComplement(int arr[]) //get 2's complement
    {    
   	 int buf[]=new int[arr.length];
   	 for(int z=0;z<arr.length;z++)
   		 buf[z]=arr[z];   		 
   	 int addtoit[]=new int[arr.length];
   	 int twocomp[]=new int[arr.length];
   	 addtoit[addtoit.length-1]=1;
   	 for(int counter=addtoit.length-2;counter>=0;counter--)
   		 addtoit[counter]=0;
   	 for(int i=0;i<buf.length;i++)
   	      if(buf[i]==0)
   	  	 buf[i]=1;
   	  	 else
   	  	 buf[i]=0;
   	 twocomp=add(buf,addtoit);
   	 return twocomp;
    }
    
    public static double[] nonrest(int[] Quo,int[] Mul)
    {    
   	 int count=Quo.length, qzero=0;
      	 int[] Acc=new int[Quo.length];
   	 int tempo[]=new int[Acc.length];
   	 double finalarr[]=new double[2];
	 while(count>0)
   	 {    
   		 qzero=Quo[0];    
   		 Acc=ls(Acc);
   		 Quo=ls(Quo);
   		 Acc[Acc.length-1]=qzero;
   		 if(Acc[0]==1)
   			 Acc=add(Acc,Mul);
   		 else
   			 Acc=add(Acc,twoComplement(Mul));
   		 if(Acc[0]==1)
   			 Quo[Quo.length-1]=0;
   		 else
   			 Quo[Quo.length-1]=1;
   		 System.out.print("\nA = ");
   		 display(Acc);
   		 System.out.print("\tQ = ");
   		 display(Quo);
   		 System.out.printf("\tCount = "+(--count));
   	 }
   	 if(Acc[0]==1)
   		 Acc=add(Acc,Mul);
   	 finalarr[0]=b2d(Quo);
   	 finalarr[1]=b2d(Acc);
   	 return finalarr;
    }
    
    public static double[] rest(int[] Quo,int[] Mul)
    {    
   	 int count=Quo.length, qzero=0;
      	 int[] Acc=new int[Quo.length];
   	 int tempo[]=new int[Acc.length];
   	 double finalarr[]=new double[2];
   	 while(count>0)
   	 {    
   		 qzero=Quo[0];
   		 Acc=ls(Acc);
   		 Quo=ls(Quo);
   		 Acc[Acc.length-1]=qzero;
   		 tempo=twoComplement(Mul);
   		 Acc=add(Acc,tempo);
   		 if(Acc[0]==1)
   		 {    
   			 Quo[Quo.length-1]=0;
   			 Acc=add(Acc,Mul);
   		 }
   		 else
   			 Quo[Quo.length-1]=1;
   		 System.out.print("\nA = ");
   		 display(Acc);
   		 System.out.print("\tQ = ");
   		 display(Quo);
   		 System.out.printf("\tCount = "+(--count));
   	 }
   	 finalarr[0]=b2d(Quo);
   	 finalarr[1]=b2d(Acc);
   	 return finalarr;
    }
    
    public  static int[] add(int array1[],int array2[])
    {    
   	 int finalarray[]=new int[array1.length];
   	 int counter=array1.length-1;
   	 int temp=0,carry=0;
   	 while(counter>=0)
   	 {
   		 temp=array1[counter]+array2[counter]+carry;
   		 if(temp==3)
   		 {    
   			 finalarray[counter]=1;
   			 carry=1;
   		 }
   		 else if(temp==2)
   		 {
   			 finalarray[counter]=0;
   			 carry=1;
   		 }
   		 else if(temp==1)
   		 {
   			 finalarray[counter]=1;
   			 carry=0;
   		 }
   		 else if(temp==0)
   		 {
   			 finalarray[counter]=0;
   			 carry=0;
   		 }
   		 counter--;
   	 }
   	 return finalarray;    
    }
    
    public static void main(String args[])
    {
   	 int dividend=0, divisor=0, Quo[],Mul[];
   	 Scanner sc=new Scanner(System.in);
   	 double answer[];
   	 //Restoring Method
   	 System.out.println("For Restoring Division Method input Dividend and Divisor");
	 dividend=sc.nextInt();
   	 divisor=sc.nextInt();
   	 Quo=Division.binary(dividend);
   	 Mul=Division.binary(divisor);
   	 answer=rest(Quo,Mul);
   	 System.out.println("\nQ = " + answer[0] + "\tR =" + answer[1]);
   		 
   	 //Non-Restoring Method
   	 System.out.println("For Non-Restoring Division Method input Dividend and Divisor");
   	 dividend=sc.nextInt();
   	 divisor=sc.nextInt();
   	 Quo=Division.binary(dividend);
   	 Mul=Division.binary(divisor);
   	 answer=nonrest(Quo,Mul);
   	 System.out.println("\nQ = " + answer[0] + "\tR =" + answer[1]);   		 
    }
}

/*Output :
For Restoring Division Method input Dividend and Divisor
660
60

A = 0000000000000000	Q = 0000010100101000	Count = 15
A = 0000000000000000	Q = 0000101001010000	Count = 14
A = 0000000000000000	Q = 0001010010100000	Count = 13
A = 0000000000000000	Q = 0010100101000000	Count = 12
A = 0000000000000000	Q = 0101001010000000	Count = 11
A = 0000000000000000	Q = 1010010100000000	Count = 10
A = 0000000000000001	Q = 0100101000000000	Count = 9
A = 0000000000000010	Q = 1001010000000000	Count = 8
A = 0000000000000101	Q = 0010100000000000	Count = 7
A = 0000000000001010	Q = 0101000000000000	Count = 6
A = 0000000000010100	Q = 1010000000000000	Count = 5
A = 0000000000101001	Q = 0100000000000000	Count = 4
A = 0000000000010110	Q = 1000000000000001	Count = 3
A = 0000000000101101	Q = 0000000000000010	Count = 2
A = 0000000000011110	Q = 0000000000000101	Count = 1
A = 0000000000000000	Q = 0000000000001011	Count = 0
Q = 11.0	R =0.0
For Non-Restoring Division Method input Dividend and Divisor
660
60

A = 1111111111000100	Q = 0000010100101000	Count = 15
A = 1111111111000100	Q = 0000101001010000	Count = 14
A = 1111111111000100	Q = 0001010010100000	Count = 13
A = 1111111111000100	Q = 0010100101000000	Count = 12
A = 1111111111000100	Q = 0101001010000000	Count = 11
A = 1111111111000100	Q = 1010010100000000	Count = 10
A = 1111111111000101	Q = 0100101000000000	Count = 9
A = 1111111111000110	Q = 1001010000000000	Count = 8
A = 1111111111001001	Q = 0010100000000000	Count = 7
A = 1111111111001110	Q = 0101000000000000	Count = 6
A = 1111111111011000	Q = 1010000000000000	Count = 5
A = 1111111111101101	Q = 0100000000000000	Count = 4
A = 0000000000010110	Q = 1000000000000001	Count = 3
A = 1111111111110001	Q = 0000000000000010	Count = 2
A = 0000000000011110	Q = 0000000000000101	Count = 1
A = 0000000000000000	Q = 0000000000001011	Count = 0
Q = 11.0	R =0.0
*/