public class recursividad2 {
    public static void main(String[] args) {
        int x=6;
        System.out.println(fibonacci(x));
    }

    public static int fibonacci(int x){
        if(x<=1){
            return x; 

        }
        return fibonacci(x-1)+fibonacci(x-2);

    }
}
