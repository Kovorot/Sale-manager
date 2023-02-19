import static java.lang.Double.valueOf;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long averageCropped() {
        long minMeaning = 0;
        long maxMeaning = 0;
        long sumMeaning = 0;
        for (long sale : sales) {
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
