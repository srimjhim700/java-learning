// public class Matrix {
//     public static void main(String[] args) {
//    // int n = Integer.parseInt(args[0]);
//     int n = 3;
//     int[][] m = new int[n][n];

//     int i = 0, j = n / 2; // first column middle column
//     for (int x = 1; x <= n * n; ++x) {
//       m[i][j] = x;
//       --i;
//       ++j;
//       if (i >= 0 && j == n) { // row available and column NA
//         j = 0;
//       } else if (i == -1 && j < n) {
//         i = n - 1;
//       } else if (i == -1 && j == n) {
//         --j;
//         ++i; // back to preious position
//         ++i; // one step down
//       } else if (m[i][j] != 0) {
//         // check if data is already inserted or not
//         --j;
//         ++i;
//         ++i;
//       }
//     }
//     for (int[] row : m) {
//       for (int x : row) {
//         System.out.print(x + "\t");
//       }
//       System.out.println();
//     }
//     }  
// }

