package HomeWork2;

public class main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr2 = new String[][]{
                {"4", "8", "14", "8", "13"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "tr", "24"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr3 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"549", "1001", "-47", "-800"}};


        try {
            Hw2.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            Hw2.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            Hw2.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
