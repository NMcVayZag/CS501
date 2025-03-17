package Final;

public class Recursion {
    public static int recurs(int n, int m){
        if(m != 0){
            return n +recurs(n, m -1); // value is from this function
        }else{
            return 0;
        }
        
        
    }
    public static void main(String[] args) {
        int result = recurs(2,2);
        System.out.println(result);
        
    }
    
}
