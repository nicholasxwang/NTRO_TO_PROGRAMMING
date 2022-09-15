public class tiles {
    public static void main(String[] args){
        // Input: `row column`
        // Example: `5 5`
        // Output:

        int N = 7;
        int M = 9;
        int newN = N;
        int newM = M;
        if (newN % 2 == 1){
            newN ++;
        }
        if (newM % 2 == 1){
            newM ++;
        }
        newN = newN/2-1;
        newM = newM/2-1;
        for (int i = 0; i<N; i++){
            for (int j = 0; j<M; j++){
                if (i == 0 || j == 0 || i == (N-1) || j== (M-1)){
                    System.out.print("#");
                }else if (i == newN && j == newM){
                    System.out.print("#");
                }
                else{

                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
