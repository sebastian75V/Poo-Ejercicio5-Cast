package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DEMOSTRACION DE CASTING Y CONVERSIONES ===");

        // 1. DE STRING A PRIMITIVOS (Parsing)
        System.out.print("Ingrese el precio del producto (ej. 19.99): ");
        String textoPrecio = sc.nextLine().trim();

        System.out.print("Ingrese la cantidad (ej. 3): ");
        String textoCantidad = sc.nextLine().trim();

        System.out.print("Tiene descuento? (true/false): ");
        String textoDescuento = sc.nextLine().trim();

        double precio = Double.parseDouble(textoPrecio);        // String -> double
        int cantidad = Integer.parseInt(textoCantidad);         // String -> int
        boolean tieneDescuento = Boolean.parseBoolean(textoDescuento); // String -> boolean

        System.out.println("\n--- 1. String a Primitivos ---");
        System.out.println("Precio (double): " + precio);
        System.out.println("Cantidad (int): " + cantidad);
        System.out.println("Descuento (boolean): " + tieneDescuento);

        // 2. CASTING IMPLICITO (De tipo pequeno a grande: int -> double)
        // Java lo hace automaticamente porque un double tiene mas capacidad que un int
        double cantidadDecimal = cantidad;
        double subtotal = precio * cantidadDecimal;

        System.out.println("\n--- 2. Casting Implicito (int -> double) ---");
        System.out.println("Cantidad convertida automaticamente a double: " + cantidadDecimal);
        System.out.println("Subtotal calculado: $" + subtotal);

        // 3. CASTING EXPLICITO (De tipo grande a pequeno: double -> int)
        // Se fuerza con (int) y se pierden los decimales (truncamiento)
        int subtotalSinCentavos = (int) subtotal;

        System.out.println("\n--- 3. Casting Explicito (double -> int) ---");
        System.out.println("Subtotal original (double): $" + subtotal);
        System.out.println("Subtotal truncado (int): $" + subtotalSinCentavos);

        // 4. DE PRIMITIVOS A STRING
        String subtotalTexto = String.valueOf(subtotal);
        String puntosGanadosTexto = Integer.toString(subtotalSinCentavos * 10);

        System.out.println("\n--- 4. Primitivos a String ---");
        System.out.println("Subtotal como String: \"" + subtotalTexto + "\" (Longitud: " + subtotalTexto.length() + " caracteres)");
        System.out.println("Puntos ganados como String: \"" + puntosGanadosTexto + "\"");
    }
}