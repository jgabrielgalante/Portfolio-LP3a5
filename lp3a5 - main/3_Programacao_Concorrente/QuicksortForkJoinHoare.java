import java.util.concurrent.RecursiveAction;

public class QuicksortForkJoinHoare extends RecursiveAction {
    private int[] array; 
    private int start; 
    private int end; 

    public QuicksortForkJoinHoare(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public QuicksortForkJoinHoare(int[] array){
        this(array, 0, array.length - 1);
    }

    @Override
    protected void compute() {
        if(start < end){
            int q = partition(array, start, end); 
            invokeAll(new QuicksortForkJoinHoare(array, start, q - 1),
                      new QuicksortForkJoinHoare(array, q + 1, end));
        }
    }
    
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static int partition(int[] A, int start, int end){
        int pivot = A[start];
        int i = start + 1;
        int j = end;


        while(i <= j){
            while(i <= j && A[i] <= pivot){
                i = i + 1;
            }
            while(i <= j && A[j] > pivot){
                j = j - 1;
            }

            if(i < j){
                swap(A, i, j);
            }
        }
        swap(A, start, j);
        return j; 
    }


}