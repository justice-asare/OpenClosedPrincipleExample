public class App {

    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new InsertionSort());
        sorterManager.sort(new MergeSort());
        sorterManager.sort(new QuickSort());
    }
}
