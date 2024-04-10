public class recursividad5 {
    //Programar una función recursiva que permita sumar los dígitos de un número.
    public static void main(String[] args) {
        int x = 543;
        System.out.println(sumarDigitos(x));
    }
    public static int sumarDigitos(int x){
if(x==0){
return 0;
}
return x%10+sumarDigitos((x-(x%10))/10);
    }
}
