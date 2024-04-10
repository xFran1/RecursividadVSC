public class recursividad10 {
    // Programar una función recursiva que calcule la exponenciación. Recibe dos
    //enteros correspondientes a la base y el exponente y devuelva el resultado. 
    public static void main(String[] args) {
      int base=5;
      int exponente=3; 
      System.out.println(exponenciacion(base, exponente));
      
    }

    public static int exponenciacion(int num1,int num2){
        if(num2==0){
            return 1;
        }
        return num1*exponenciacion(num1, num2-1);

    }
}
