public class recursividad4 {
    // Programar una función recursiva que permita hacer la división entera por restas sucesivas.
    public static void main(String[] args) {
        int dividendo = 25;
        int divisor = 5;

        System.out.println(division(dividendo,divisor));
    }
    public static int division(int dividendo,int divisor){
        if(dividendo==0){
            return 0;
        }else{
            return 1+ division(dividendo-divisor, divisor);
        }
        
    }
}
