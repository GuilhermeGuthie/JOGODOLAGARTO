package Modelo;

public abstract class Node {

    private int x;
    private int y;
    private int largura;
    private int altura;

    public Node(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;

    }

}
