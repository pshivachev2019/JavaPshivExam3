public class Main {

    public static void main(String[] args) {
        int [] array = {8,7,6,1,4,3,2,5};
        boolean FLAG = false;
        int count = 0;

        for (int i=0; i<array.length; i++) {
            FLAG = false;
            count = i+1;
            for (int j=0; j<array.length-1; j++) {
                if (array[j]>array[j+1]) {
                    int TEMP = array[j];
                    array[j] = array[j+1];
                    array[j+1] = TEMP;
                    FLAG = true;
                }
            }
            if (!FLAG)
                break;
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Iterations count " + count);
    }
}
