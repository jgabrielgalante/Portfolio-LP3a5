import java.util.concurrent.ForkJoinPool;

public class main {
	
    private static String arrayToString(int[] array){
        String aux = "[" + array[0];
        for(int i = 1; i < array.length; i++){
            aux += ", " + array[i];
        }
        return aux + "]";
    }
	
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        
        int[] A = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        

        System.out.println("Array A (not ordered) = " + arrayToString(A));
        
        
        A = new int[]{5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        QuicksortForkJoinHoare quicksortTaskHoare = new QuicksortForkJoinHoare(A);
        pool.invoke(quicksortTaskHoare);
        System.out.println("A (ordered with hoare quicksort) = " + arrayToString(A));
        
    }
    
}