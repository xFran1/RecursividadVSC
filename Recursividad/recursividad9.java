public class recursividad9 {
    // Programar una función recursiva que reciba una palabra y devuelva un booleano
    //indicando si es un palíndromo, pero pasando el String a un array de char. 
    public static void main(String[] args) {
      String cadena= "seres";
      char[] array = cadena.toCharArray();
      
      boolean esPalindromo = palindromo(array,0,array.length-1);
      if (esPalindromo) {
          System.out.println(cadena + " es un palíndromo.");
      } else {
          System.out.println(cadena + " no es un palíndromo.");
      }
    }

    private static boolean palindromo(char[] array,int inicio,int fin) {
        if (inicio == fin) {
            return true; // caso base: si la cadena tiene 0 o 1 caracteres, es un palíndromo
        } else if (array[inicio] == array[fin]) {
            // si el primer y el último carácter son iguales, continuar con la subcadena central
            return palindromo(array,inicio+1,fin-1);
        } else {
            return false; // si los caracteres no coinciden, la cadena no es un palíndromo
        }
    }
}
