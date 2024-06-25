import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Por favor, ingresa tu elección (Piedra, Papel, Tijera):");
        String eleccionUsuario = scanner.nextLine();

        //función random con clase math

        int indiceRandom = (int) (Math.random() * opciones.length);
        String eleccionComputadora = opciones[indiceRandom];

        System.out.println("La computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equals("Tijera")) ||
                (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsuario.equalsIgnoreCase("Tijera") && eleccionComputadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}
