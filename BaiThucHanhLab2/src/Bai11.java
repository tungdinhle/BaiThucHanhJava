public class Bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = input.nextInt();

        // Khai báo và khởi tạo mảng A có n phần tử
        int[] A = new int[n];

        // Nhập giá trị cho các phần tử trong mảng A từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }

        // Sắp xếp mảng A theo thứ tự tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        // In ra mảng A ban đầu
        System.out.print("Mảng A ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        // In ra mảng A đã sắp xếp theo thứ tự tăng dần
        System.out.print("\nMảng A đã sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
