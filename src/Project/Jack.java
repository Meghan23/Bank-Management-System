import java.io.*;

class Jack{

        public  int frame_num;
        private int page_no;
        private int offset;
        private int log_add;
        private int phys_add;
        public static Jack obj[] = new Jack[5]; 
        
        public void setData (int la, int count){		//Method to calculate and set page number, offset and physical address.
                
        		frame_num = count--;
                log_add = la;
                offset = la%256;
                page_no = la/256;
                while(count >= 0){						
                        
                        if(Jack.obj[count].page_no == page_no){				//Checks whether page already present in page table.
                                frame_num = Jack.obj[count].frame_num;
                                break;
                        }
                        count--;
                        
                }
                phys_add = (frame_num*256)+offset;
                
        }
        
        public void getData(){									//Method to display details.
                
                System.out.println("Logical address : "+log_add);
                System.out.println("Page number : "+page_no);
                System.out.println("Offset : "+offset);
                System.out.println("Physical address : "+phys_add);
                
        }
        
        public static void main(String args[]){
        
                int i=0;
                String num; 
                try{
                        FileReader fr = new FileReader("C:\\Users\\Meghan L\\Downloads\\New folder\\Numbers.txt");
                        BufferedReader br = new BufferedReader(fr);
                        while((num=br.readLine())!=null){
                        		Jack.obj[i] = new Jack();
                                Jack.obj[i].setData(Integer.parseInt(num), i);
                                Jack.obj[i].getData();
                                i++;
                        }
                        br.close();
                        fr.close();
                }
                catch(Exception e){
                        System.out.println(e);
                }
        }

}

/* Numbers.txt :
 	16916
	62493
	16980
*/

/*  Output :
Logical address : 16916
Page number : 66
Offset : 20
Physical address : 20
Logical address : 62493
Page number : 244
Offset : 29
Physical address : 285
Logical address : 16980
Page number : 66
Offset : 84
Physical address : 84  */