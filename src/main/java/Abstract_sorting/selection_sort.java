package Abstract_sorting;

public class selection_sort extends Abstract_class_sorting{
    private int[] arr;
    private int n;


    @Override
    public void sorting_function(int[] arr, int n) {
        System.out.println("selection sort result");
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){

                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=0;i < n; i++){
            System.out.println(arr[i]);
        }

    }
}
