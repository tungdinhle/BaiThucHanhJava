public class Bai8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của dãy số: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào số thứ " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / n;

        System.out.println("Trung bình cộng của các số trong dãy là: " + average);
    }
}
