public class sum {
    public static void main(String[] args) {
        System.out.println(funt(4));
    }
    static int funt(int n){
        if(n==1 ){
            return n;
        }
        return n+funt(n-1);
    }
}
