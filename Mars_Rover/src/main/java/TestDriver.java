public class TestDriver {
    public static void main(String[] args) {
        float[] values = {1.00F, 1.00F, 1.00F, 1.00F, 2.45F, 30.00F, 13.76F, 2.34F, 90.00F, 90.00F};

        MarsRover mr;

        for(int i = 0; i < 5; i++){
           mr = new MarsRover(values[i], values[i+5]);
           mr.calcTurnRadius();
        }
    }
}
