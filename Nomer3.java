public class QuickSort {	
    static Scanner in = new Scanner(System.in);
    private int[] data; 
    public QuickSort(int[] data) {
        this.data = data;
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                QuickSortAscending();
                break;
            case 2:
                QuickSortDescending();
                break;
        }
    }
    public void QuickSortAscending() {
        System.out.println("Sebelum : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Sesudah : ");
        sort();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    public void QuickSortDescending() {
        System.out.println("Sebelum : ");
    }
}