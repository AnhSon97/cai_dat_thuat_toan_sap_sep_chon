public class SelectionSort {
    public static void selectionSort(double [] list){
        for (int i = 0; i < list.length -1; i ++){
            int minArrIndex = i;
            for (int j = i + 1; j < list.length; j ++){
                if (list[minArrIndex] > list[j]){
                    minArrIndex = j;
                }
                  double term = list[minArrIndex];
                list[minArrIndex] = list[i];
                list[i] = term;

            }
        }
    }
}

class test{
    public static void main(String[] args) {
        double [] arr = {10.2, 11.2, 13.2, 14.2, 15.2, 16.2, 17.2};
        SelectionSort.selectionSort(arr);

        for (double i : arr)
        System.out.println(i);
    }
}
