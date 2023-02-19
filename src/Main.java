public class Main {
    public static void main(String[] args) {

        long[] sales = {2, 5, 4, 10, 1, 35, 3};

        SalesManager manager = new SalesManager(sales);

        System.out.println(manager.max());

        System.out.println(manager.averageCropped());
        }
}