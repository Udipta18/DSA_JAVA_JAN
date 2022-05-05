package demon;
import java.util.*;
public class helpRamu {
   public static void main(String[] args) {
        // TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     int[] helper=new int[n];
     for(int i=0;i<n;i++) {
         arr[i]=sc.nextInt();
         helper[i]=arr[i];
     }
       int t=sc.nextInt();
       int copyn=n;
       for(int i=0;i<t;i++) {
           n=copyn;
           int temp=n;
           int j=1;
           int k=sc.nextInt();
           
            while(n>0) {
                 j=j%temp;
                 //System.out.println(k);
                int x=temp-j;
                int y=temp-j-k;
                if(j==0) {
                    x=0;
                    y=x-k;
                }
                
                if(y<0) {
                    arr[x]=helper[x]+helper[y+arr.length];}
                else {
                    arr[x]=helper[x]+helper[y];
                }
                
                j++;
                n--;
            }
            
            for(int m=0;m<arr.length;m++){
                helper[m]=arr[m];
                }
       }
       
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            ans+=arr[i];
        }
        
        ans%=(int)(Math.pow(10, 9)+7);
        System.out.println(ans);
    }
}