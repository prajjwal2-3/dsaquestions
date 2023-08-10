public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(nom(123567));
    }
    static int nom(int n){
        if(n==0){
            return 0;
        }
        return nom(n/10)+n%10;
    }

}
