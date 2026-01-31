import java.util.Scanner;
public class Sunrise {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int count=0;
                int maxHeight=0;
                for(int i=0;i<n;i++){
                        if(arr[i]>maxHeight){
                                count++;
                                maxHeight=arr[i];
                        }
                }
                System.out.println(count);
        }
}
