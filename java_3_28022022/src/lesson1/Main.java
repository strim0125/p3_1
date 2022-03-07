package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

//        double x = sumOfList(numbers);
        int x =  getFirstElement(numbers);
        System.out.println(x);

//        Collections.copy();
    }

    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> nums){
        double sum = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i).doubleValue();
        }
        return sum;
    }

    private static void exBoxWithNumbers(){
        BoxWithNumbers<Float> boxFloat1 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);
        BoxWithNumbers<Float> boxFloat2 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);

        System.out.println("boxFloat1 avg : " + boxFloat1.avg());
        System.out.println("boxFloat2 avg : " + boxFloat2.avg());
        System.out.println(boxFloat1.sameAvg(boxFloat2));

        BoxWithNumbers<Integer> boxInteger = new BoxWithNumbers<>(1, 2, 3);
        System.out.println("boxInteger avg : "+ boxInteger.avg());
        System.out.println(boxFloat1.sameAvg(boxInteger));
    }

    private static void exBoxGen() {
        BoxGen<Integer> box1 = new BoxGen<>(10);
        BoxGen<Integer> box2 = new BoxGen<>(20);

        box1.setObj(15);

        int sum = box1.getObj() + box2.getObj();
        System.out.println("sum : " + sum);

        BoxGen<String> boxStr = new BoxGen<>("java");

        System.out.println(box1.getClass());
        System.out.println(boxStr.getClass());
    }

    private static void exSimpleBox() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);

        ////////
        box1.setObj("java");
        ///////
        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            int sum = (Integer) box1.getObj() + (Integer) box2.getObj();
            System.out.println("sum : " + sum);
        }
    }
}
