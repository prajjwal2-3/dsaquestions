//import static jdk.internal.org.jline.utils.Colors.s;

public class binar {
    public static void main(String[] args) {
int[] arr={2,34,54,56,78};
int target =  6;
int s =0;
int e=arr.length-1;
        System.out.println(binu(arr,target,s,e));
    }
    static int binu(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return binu(arr,target,s,m-1);
        }
        return binu(arr,target,m+1,e);
    }
}
