public class recursividad1{
    
    //Programar una función recursiva que calcule el factorial de un número dado
    public static void main(String[] args) {
        int x=4;
       
        System.out.println("El factorial de "+x+" es: "+factorial(x));
    }
    private static int factorial(int x){
        if(x==0){
            return 1;
        }
        return x*factorial(x-1);
    }
}