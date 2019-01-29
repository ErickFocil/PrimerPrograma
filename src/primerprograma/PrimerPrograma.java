package primerprograma;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimerPrograma {
    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int a,b,c,d,e;
        System.out.println("Indique un valor numérico");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = " + a);
        System.out.println("---------------");
        System.out.println("Indique un valor numérico b");
        b = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de b = " + b);
        System.out.println("---------------");
        System.out.println("Indique un valor numérico c");
        c = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de c = " + c);
        System.out.println("---------------");
        System.out.println("Indique un valor numérico d");
        d = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de d = " + d);
        System.out.println("---------------");
        System.out.println("Indique un valor numérico e");
        e = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de e = " + e);
        System.out.println("---------------");
        
    }
    
}
