import algorithms.FireAlgorithm;
import window.menu.OptionSelector;

public class Main {
    public static void main(String[] args) {
        FireAlgorithm fire = new FireAlgorithm();
        OptionSelector janela = new OptionSelector();

        janela.render();

        fire.createFirePixels();
        fire.createRenderFire();
    }
}
