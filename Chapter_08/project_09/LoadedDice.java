import java.util.Random;

public class LoadedDice extends Random {
    public int nextInt(int num){
        return super.nextInt(2) == 0 ? num - 1 : super.nextInt(num);
    }
}