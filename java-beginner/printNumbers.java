public class printNumbers {
    
    public static void printDec(int A){
        if(A==0){
            return;
        }
        System.out.print(A+" ");
        printDec(A-1);
    }

    public static void printInc(int A){
        if(A==0){
            return;
        }
        printInc(A-1);
        System.out.print(A+" ");
    }
    
    public static void main(String[] args) {
        printInc(9);
        printDec(9);
        //printInc(4);
    }
}
