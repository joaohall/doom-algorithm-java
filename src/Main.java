import panels.fire;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        fire fogo = new fire();
        fogo.createFirePixels();
        fogo.createRenderFire();
        fogo.getFire();
    }
}
