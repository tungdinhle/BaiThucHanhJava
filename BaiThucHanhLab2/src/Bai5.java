public class Bai5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sum <= 100) {
            System.out.print("Nhập một số nguyên: ");
            int number = sc.nextInt();
            sum += number;
        }

        System.out.println("Tổng của các số đã nhập là: " + sum);
    }
}
