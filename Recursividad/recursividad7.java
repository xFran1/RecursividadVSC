public class recursividad7 {
    // Programar una función recursiva que permita multiplicar dos números, sumando el
    //primero tantas veces como el segundo.
    public static void main(String[] args) {
        int num1 = 6;
        int num2=3;

        System.out.println(multiplicar(num1, num2));
    }
    public static int multiplicar(int num1,int num2){
        if(num2==0){
            return 0;
        }
        return num1+multiplicar(num1, num2-1);
    }
}
