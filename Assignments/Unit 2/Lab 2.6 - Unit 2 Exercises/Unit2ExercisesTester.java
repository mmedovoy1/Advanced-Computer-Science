public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit2Exercises.alarmClock(1, false));
        System.out.println(Unit2Exercises.alarmClock(0, false));
        System.out.println(Unit2Exercises.love6(6, 4));
        System.out.println(Unit2Exercises.love6(4, 5));
        System.out.println(Unit2Exercises.redTicket(2, 2, 2));
        System.out.println(Unit2Exercises.redTicket(2, 2, 1));
        System.out.println(Unit2Exercises.redTicket(0, 0, 0));
        System.out.println(Unit2Exercises.fizzString("fig"));
        System.out.println(Unit2Exercises.fizzString("dib"));
        System.out.println(Unit2Exercises.fizzString("fib"));
        System.out.println(Unit2Exercises.doubleChar("Hi-There"));
        System.out.println(Unit2Exercises.countHi("abc hi ho"));
        System.out.println(Unit2Exercises.countHi("ABChi hi"));
        System.out.println(Unit2Exercises.countHi("hihi"));
        System.out.println(Unit2Exercises.catDog("catcat"));
        System.out.println(Unit2Exercises.catDog("1cat1cadodog"));
        System.out.println(Unit2Exercises.mixString("abc", "xyz"));
        System.out.println(Unit2Exercises.mixString("Hi", "There"));
        System.out.println(Unit2Exercises.mixString("xxxx", "There"));
        System.out.println(Unit2Exercises.repeatEnd("Hello", 3));
        System.out.println(Unit2Exercises.endOther("abc", "abXabc"));
        System.out.println(Unit2Exercises.countCode("cozexxcope"));
        int[] nums = {2, 1, 2, 3, 4};
        System.out.println(Unit2Exercises.countEvens(nums));
        int[] diff = {10, 3, 5, 6};
        System.out.println(Unit2Exercises.bigDiff(diff));
        int[] sums = {1, 2, 2, 1, 13};
        System.out.println(Unit2Exercises.sum13(sums));
        int[] zero = {1, 0, 0, 2};
        System.out.println(Unit2Exercises.zeroFront(zero));
        int[] average = {3, 4, 5, 1, 2, 3};
        System.out.println(Unit2Exercises.scoresAverage(average));
        int[] increase = {1, 3, 2};
        System.out.println(Unit2Exercises.scoresIncreasing(increase));
        int[] specialA = {20, 12, 4};
        int[] specialB = {2, 20, 10};
        System.out.println(Unit2Exercises.scoresSpecial(specialA, specialB));
        System.out.println(Unit2Exercises.firstTwo("hello"));
        System.out.println(Unit2Exercises.firstTwo("h"));
        System.out.println(Unit2Exercises.firstTwo(""));
        System.out.println(Unit2Exercises.divide(10, 55));
    }
}
