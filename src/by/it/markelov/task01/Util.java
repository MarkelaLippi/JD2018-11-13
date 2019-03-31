package by.it.markelov.task01;

public class Util {
    public static int random (int min, int max){
        return min + (int) (Math.random() * (max-min+1));
    }
}
