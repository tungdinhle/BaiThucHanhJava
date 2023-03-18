import javax.security.auth.x500.X500Principal;

public class Bai6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào mot so nguyen duong bat ky");;
        int number = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Giai thừa của " + number + " là: " + factorial);
    }
}
