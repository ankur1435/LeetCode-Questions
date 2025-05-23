package Array; 

public class Search_A_2D_Matrix {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        int item = 13;
        System.out.println(Search(arr, item));
    }

    public static boolean Search(int[][] arr, int item) {
        int row = 0, col = arr[0].length - 1;
        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == item) {
                return true;
            } else if (arr[row][col] > item) {
                col--;
            } else {
                row++;
            }

        }
        return false;
    }
}
