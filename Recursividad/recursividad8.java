public class recursividad8 {
    // Programar una función recursiva que reciba una palabra y devuelva un booleano
    // indicando si es un palíndromo. 
    public static void main(String[] args) {
        String cadena = "seres";

        boolean esPalindromo = palindromo(cadena);
        if (esPalindromo) {
            System.out.println(cadena + " es un palíndromo.");
        } else {
            System.out.println(cadena + " no es un palíndromo.");
        }
    }

    public static boolean palindromo(String cadena) {
        if (cadena.length() < 2) {
            return true; // caso base: si la cadena tiene 0 o 1 caracteres, es un palíndromo
        } else if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            // si el primer y el último carácter son iguales, continuar con la subcadena central
            return palindromo(cadena.substring(1, cadena.length() - 1));
        } else {
            return false; // si los caracteres no coinciden, la cadena no es un palíndromo
        }
    }
}

