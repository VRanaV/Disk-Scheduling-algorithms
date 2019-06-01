import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;
public class FCFS {
    Vector<Integer> myvector= new Vector< >();
    Vector<Integer> temp= new Vector<>();
    
    int head;
   public Vector<Integer>  fill(int x) {
    	myvector.add(x);
    	return myvector;
    }
public int FCFSfillvector (int head){

   /* myvector.add(98);
    myvector.add(183);
    myvector.add(37);
    myvector.add(122);
    myvector.add(14);
    myvector.add(124);
    myvector.add(65);
    myvector.add(67);
*/
    
    int sum=0;
    for (int i=0 ;i<myvector.size(); i++){
        if(i==0){
            sum+=Math.abs(head-myvector.get(i));
        }
        else{
            sum+=Math.abs(myvector.get(i)-myvector.get(i-1));
        }

    }
    return sum;
 }
 public void FCFSprint(){
     System.out.println("Sequence FCFS:");
     for (int i=0 ;i<myvector.size(); i++){
         System.out.print(myvector.get(i)+" ");
     }
 }
 public int SSTFfillvec(int head){

    

     
    int sum=0;

     int min,m=0,index;
     temp.add(head);
     
     for(int j=0;j<myvector.size(); j++) {
         min=50000;   index=-1;
         for (int i = 0; i < myvector.size(); i++) {
             if(!temp.contains(myvector.get(i))) {
                 m = Math.abs(head - myvector.get(i));
                 if (m < min) {
                     min = m;
                     index=i;
                       }
             }

         } 
         sum+=Math.abs(myvector.get(index)-head);
         temp.add(myvector.get(index));
         head=myvector.get(index);
     
        }

    return sum;
    }
public void printt(){
    System.out.println(" ");
    for (int i =0; i<temp.size(); i++){
        System.out.print(temp.get(i)+" ");
    }
}

public int ScanFill(int head){

    
    int h=-1;
    myvector.add(head);
    Collections.sort(myvector);
    for(int i=0 ; i<myvector.size();i++) {
    	if(myvector.get(i)==head) {
    		h=i;
    	}
    }
    myvector.remove(h);
   int sum=0;
    int min,m=0,index;
    temp.add(head);
    
    int least=myvector.get(0);
   
    for(int j=0;j<h; j++) {
        min=50000;   index=-1;
        for (int i = 0; i < h; i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
       // System.out.println(sum+" "+"\n");
        temp.add(myvector.get(index));
        head=myvector.get(index);
        if(myvector.get(index)==least) {
        	sum+=Math.abs(least-0);
            //System.out.println("zero"+sum+" "+"\n");

        	temp.add(0);
        	head=0;
        }
    
        
         }
	head=0;

    for(int j=h;j<myvector.size(); j++) {
        min=50000;   index=h+1;
        for (int i = h; i < myvector.size(); i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
     //   System.out.println("second "+sum+" "+"\n");

        temp.add(myvector.get(index));
        head=myvector.get(index);

        
       }

   return sum;
   }
public void printscan(){
   System.out.println(" ");
   for (int i =0; i<temp.size(); i++){
       System.out.print(temp.get(i)+" ");
   }
}

public int CScanFill(int head){

      int h=-1;
      myvector.add(head);
    Collections.sort(myvector);
    for(int i=0 ; i<myvector.size();i++) {
    	if(myvector.get(i)==head) {
    		h=i;
    	}
    }
    myvector.remove(h);
   int sum=0;
    int min,m=0,index;
    temp.add(head);
    
    int max=myvector.get(myvector.size()-1);
    

    for(int j=h;j<myvector.size(); j++) {
        min=50000;   index=h+1;
        for (int i = h; i < myvector.size(); i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
     //   System.out.println("second "+sum+" "+"\n");

        temp.add(myvector.get(index));
        head=myvector.get(index);
        if(myvector.get(index)==max) {
        	sum+=Math.abs(max-199);
            //System.out.println("zero"+sum+" "+"\n");

        	temp.add(199);
        	head=199;
        }

        
       }

   
    for(int j=0;j<h; j++) {
        min=50000;   index=-1;
        if(head==199) {
        	sum+=199;
        	temp.add(0);
        	head=0;
        }
        for (int i = 0; i < h; i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
       // System.out.println(sum+" "+"\n");
        temp.add(myvector.get(index));
        head=myvector.get(index);
            
        
         }
	

   return sum;
   }
public void printCscan(){
   System.out.println(" ");
   for (int i =0; i<temp.size(); i++){
       System.out.print(temp.get(i)+" ");
   }
}



public int CLook(int head){

    int h=-1;
    myvector.add(head);
    Collections.sort(myvector);
    for(int i=0 ; i<myvector.size();i++) {
    	if(myvector.get(i)==head) {
    		h=i;
    	}
    }
    myvector.remove(h);
   int sum=0;
    int min,m=0,index;
    temp.add(head);
    
    int max=myvector.get(myvector.size()-1);
    

    for(int j=h;j<myvector.size(); j++) {
        min=50000;   index=h+1;
        for (int i = h; i < myvector.size(); i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
     //   System.out.println("second "+sum+" "+"\n");

        temp.add(myvector.get(index));
        head=myvector.get(index);
        if(myvector.get(index)==max) {
        	sum+=Math.abs(max-myvector.get(0));
            //System.out.println("zero"+sum+" "+"\n");

        	
        	head=myvector.get(0);
        }

        
       }

   
    for(int j=0;j<h; j++) {
        min=50000;   index=-1;
        for (int i = 0; i < h; i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
       // System.out.println(sum+" "+"\n");
        temp.add(myvector.get(index));
        head=myvector.get(index);
            
        
         }
	

   return sum;
   }
public void printCLook(){
   System.out.println(" ");
   for (int i =0; i<temp.size(); i++){
       System.out.print(temp.get(i)+" ");
   }
}


public int newlyoptimized(int head){
    /*
    myvector.add(38);
    myvector.add(180);
    myvector.add(130);
    myvector.add(10);
    myvector.add(50);
    myvector.add(15);
    myvector.add(190);
    myvector.add(90);
    myvector.add(150);
    head=0;
    */
    Collections.sort(myvector);
    
   int sum=0;
    int min,m=0,index;
    temp.add(0);
    
    int max=myvector.get(myvector.size()-1);
    

    for(int j=0;j<myvector.size(); j++) {
        min=50000;   index=-1;
        
        for (int i = 0; i < myvector.size(); i++) {
            if(!temp.contains(myvector.get(i))) {
                m = Math.abs(head - myvector.get(i));
                if (m < min) {
                    min = m;
                    index=i;
                      }
            }

        }
        
        sum+=Math.abs(myvector.get(index)-head);
     //   System.out.println("second "+sum+" "+"\n");

        temp.add(myvector.get(index));
        head=myvector.get(index);
       
        
       }

   
   
   return sum;
   }
public void printOptimized(){
   System.out.println(" ");
   for (int i =0; i<temp.size(); i++){
       System.out.print(temp.get(i)+" ");
   }
}

 public static void main (String args[]){
Scanner input = new Scanner(System.in);
     FCFS c=new FCFS();
     System.out.println("Please,Enter the number of elements"+"\n");
     int n=input.nextInt();
     
     for(int k=0; k<n ;k++) {
    	 int o=input.nextInt();
    	 c.fill(o);
     }
   System.out.println("Now Enter the head");
   int h=input.nextInt();
  //System.out.println(c.FCFSfillvector(h));
  //c.FCFSprint();
  //   System.out.print(c.SSTFfillvec(h));
   //    c.printt();
      
  
   //System.out.println(c.ScanFill(h));
  // c.printscan();
   System.out.println( c.CScanFill(h));
    c.printCscan();
    // System.out.println(c.CLook(h));
    // c.printCLook();
   // System.out.println( c.newlyoptimized(h) );
   //c.printOptimized();
 }

}
