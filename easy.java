public class easy {
    public static void main(String[] args) {
//        print(5);
        printrev(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printrev(int n){
        if(n==0){
            return;
        }
//        System.out.println(n);
        printrev(n-1);
        System.out.println(n);
}
}
