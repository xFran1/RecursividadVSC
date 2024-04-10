public class recursividad3 {
    //Programar una función recursiva que imprima una cadena texto alrevés
    public static void main(String[] args) {
        String palabra="hola";
        System.out.println(textoAlReves(palabra));
    }
    private static String textoAlReves(String palabra){

        if(palabra.length()==0){
            return "";
        }
        //System.out.println(palabra);
        //System.out.println("Le quita "+palabra.charAt(palabra.length()-1));
        return palabra.charAt(palabra.length()-1)+textoAlReves(palabra.substring(0,palabra.length()-1));
        
    }
}
