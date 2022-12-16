package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first;
        int second;
        int third;
        first = number / 100;
        second = (number - (first*100)) / 10;
        third = number - first*100 - second*10;
        System.out.println(third * 100 + second * 10 + first);
    }
}
