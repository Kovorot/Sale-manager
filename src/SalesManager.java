import static java.lang.Double.valueOf;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int averageCropped() {
        int minMeaning = 0;
        int maxMeaning = 0;
        int sumMeaning = 0;
        for (int sale : sales) {
            if (minMeaning == 0 || minMeaning > sale) {
                minMeaning = sale;
            }
            if (maxMeaning == 0 || maxMeaning < sale) {
                maxMeaning = sale;
            }
            sumMeaning += sale;
        }
        sumMeaning = sumMeaning - (maxMeaning + minMeaning);
        return (sumMeaning / (sales.length - 2));
    }
}
