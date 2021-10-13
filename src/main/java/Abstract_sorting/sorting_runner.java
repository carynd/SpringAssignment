package Abstract_sorting;

public class sorting_runner {

    public static void main(String[] args) {

         int  arr[]={1,5,7,8,-1,-2,0,2,7};
          int n=9;

        bubble_sort bs=new bubble_sort();
        bs.sorting_function(arr, n);


        selection_sort ss=new selection_sort();
        ss.sorting_function(arr, n);

        insertion_sort is=new insertion_sort();
        is.sorting_function(arr, n);
    }
}
