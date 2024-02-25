import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionarioIngEsp = new HashMap<>();

        diccionarioIngEsp.put("ahora", "now");
        diccionarioIngEsp.put("esquina", "corner");
        diccionarioIngEsp.put("caliente", "hot");
        diccionarioIngEsp.put("verano", "summer");
        diccionarioIngEsp.put("aplauso", "applause");
        diccionarioIngEsp.put("sabotaje", "sabotage");
        diccionarioIngEsp.put("actriz", "actress");
        diccionarioIngEsp.put("polilla", "moth");
        diccionarioIngEsp.put("venganza", "revenge");
        diccionarioIngEsp.put("fiesta", "party");
        diccionarioIngEsp.put("vida", "life");
        diccionarioIngEsp.put("tendencia", "trend");
        diccionarioIngEsp.put("escuela", "school");
        diccionarioIngEsp.put("dignidad", "dignity");
        diccionarioIngEsp.put("palabra", "word");
        diccionarioIngEsp.put("santo", "saint");
        diccionarioIngEsp.put("amigo", "friend");
        diccionarioIngEsp.put("vestido", "dress");
        diccionarioIngEsp.put("dolor", "pain");
        diccionarioIngEsp.put("cantidad", "amount");

        HashSet<String> palabrasUsadas = new HashSet<>();

        Random palabraRandom = new Random();

        Scanner palabraIngresada = new Scanner(System.in);

        int palabrasIncorrectas = 0;
        int palabrasCorrectas = 0;

        for(int i = 0; i<5; i++){
            String palabra = (String) diccionarioIngEsp.keySet().toArray()[palabraRandom.nextInt(diccionarioIngEsp.size())];
                while (palabrasUsadas.contains(palabra)){
                    palabra =  (String) diccionarioIngEsp.keySet().toArray()[palabraRandom.nextInt(diccionarioIngEsp.size())];
                }
            palabrasUsadas.add(palabra);

            System.out.println("¿Cómo se dice " + "'" + palabra + "'" + " en inglés?");
            String respuesta = palabraIngresada.nextLine();

            if(diccionarioIngEsp.get(palabra).equalsIgnoreCase(respuesta)){
                palabrasCorrectas++;
                System.out.println("La traducción es correcta. \uD83D\uDE00" );
            }else{
                palabrasIncorrectas++;
                System.out.println("La traducción es incorrecta. \uD83D\uDE13");
            }
        }

        System.out.println(" ");
        System.out.println("Respuestas correctas: " + palabrasCorrectas);
        System.out.println("Respuestas incorrectas " + palabrasIncorrectas);

        if(palabrasCorrectas>2){
            System.out.println("¡Muy bien! ✅");
        }else{
            System.out.println("Mejor suerte la próxima vez \uD83D\uDE23");
        }

}
}
