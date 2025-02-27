/*
 * 10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)
 */

package exercicio01.problema10;

public class DistanciaEntreDoisPontos {
    public static double calcularDistancia(int x1, int x2, int y1, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 6;
        double distancia = calcularDistancia(x1, x2, y1, y2);
        System.out.printf("A distância entre os pontos (%d, %d) e (%d, %d) é %.2f%n", x1, y1, x2, y2, distancia);
    }
}
