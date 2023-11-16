public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        int count = 0;
        for (int i = 0; i < arrayInt[0].length; i++) {
            for (int j = 0; j < arrayInt.length; j++) {
                count++;
                System.out.println("Elemen ke-" + count);
            }
        }
        System.out.println("Jumlah elemen ada: " + count + ".");
    }
}
