public class Java_17_Arrays {
    static void main(String[] args) {
        int[] array = {12,14,15,18};
        System.out.println(array.length);


        System.out.println("Print array");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //Print in reverse order
        System.out.println("Print array in reverse order");
        for(int i = array.length; i > 0; i--){
            System.out.println(array[i-1]);
        }

        //Foreach loop
        System.out.println("Print array by foreach loop");
        for(int element: array){
            System.out.println(element);
        }

        //Multidimensional array
        int[][] flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 200;
        flats[0][2] = 300;
        flats[1][0] = 400;
        flats[1][1] = 500;
        flats[1][2] = 600;

        for(int i = 0; i < flats.length; i++){
            for (int j = 0; j < flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        String[][][] arr = new String[2][3][4];
    }
}
