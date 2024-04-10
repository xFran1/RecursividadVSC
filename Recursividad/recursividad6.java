public class recursividad6 {
    //. Programar una función recursiva que permita invertir un número.
    // Ejemplo: Entrada: 123 Salida: 321 
    public static void main(String[] args) {
        int x=46;
        invertirNumero(x);
    }

    private static void invertirNumero(int x){
        if(x<10){
            System.out.print(x);
            return;
        }else
            System.out.print(x%10);
            invertirNumero(((x-(x%10))/10));
    }
        
    }



