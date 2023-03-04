public class Slide47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (sum <= 100) {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Tổng các số đã nhập là: " + sum);
        scanner.close();
    }
}
