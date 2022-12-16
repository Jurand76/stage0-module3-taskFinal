package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result, first, second, third, fourth;
        first = number / 1000;
        second = (number - first*1000) / 100;
        third = (number - first*1000 - second*100) / 10;
        fourth = number - first*1000 - second*100 - third*10;
        System.out.println(first+second+third+fourth);
    }
}
