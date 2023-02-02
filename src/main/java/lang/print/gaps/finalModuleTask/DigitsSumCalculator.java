package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int summ = 0;
        for (int i=1; i<=4; i++){
            summ = summ+number%10;
            number=number/10;
        }

        System.out.println(summ);
    }
}
