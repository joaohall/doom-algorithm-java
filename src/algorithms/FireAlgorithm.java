package algorithms;

public class FireAlgorithm {

    private static final int[][] firevectorpixels = new int[40][40];
    private static final int[][] firevector = new int[40][40];


    public void createRenderFire() {
        int limitColorOfFire = 36;
        for (int i = 39; i > 0; i--) {
            for (int j = 0; j < 39; j++) {
                firevector[i][j] = limitColorOfFire;
            }
            if (limitColorOfFire > 0){
                limitColorOfFire--;
            }else if (limitColorOfFire < 0){
                limitColorOfFire = 0;
            }
        }
    }
    /*
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        36 36 36 36 36 36 36 36 36 36

     */

    public void createFirePixels(){
        int n = 0;
        for (int i = 0; i < 39; i++) {
            for (int j = 0; j < 39; j++) {
                firevectorpixels[i][j]=n;
                n++;
            }
        }
    }

    public void getFirePixels(){
        for (int i = 0; i < 39; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                System.out.print(firevectorpixels[i][j]);
            }
        }
    }
    public void getFire() throws InterruptedException {
        for (int i = 0; i < 39; i++) {
            System.out.println("");
            for (int j = 0; j < 39; j++) {
                System.out.print(firevector[i][j]);

            }
        }
    }


}

