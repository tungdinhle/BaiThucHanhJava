public class Bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        // Nhập số dòng và số cột của ma trận
        System.out.print("Nhập số dòng của ma trận: ");
        int numRows = input.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int numCols = input.nextInt();
  
        // Khởi tạo ma trận với kích thước đã nhập
        int[][] matrix = new int[numRows][numCols];
  
        // Nhập các giá trị cho từng phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < numCols; j++) {
              matrix[i][j] = input.nextInt();
           }
        }
  
        // Tìm giá trị lớn nhất trong ma trận
        int maxValue = matrix[0][0];
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < numCols; j++) {
              if (matrix[i][j] > maxValue) {
                 maxValue = matrix[i][j];
              }
           }
        }
  
        // Hiển thị giá trị lớn nhất và vị trí của nó trong ma trận
        System.out.println("Giá trị lớn nhất trong ma trận là " + maxValue);
     }
}
