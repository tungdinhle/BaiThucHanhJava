import java.util.Scanner;

public class Bai3 {
    public class Main {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Nhập tên của bạn: ");
                String ten = sc.nextLine();
                
                System.out.print("Nhập năm sinh của bạn: ");
                int namSinh = sc.nextInt();
                
                int tuoi = 2023 - namSinh;
                
                if (tuoi < 16) {
                    System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên");
                } else if (tuoi >= 16 && tuoi < 18) {
                    System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành");
                } else {
                    System.out.println("Bạn " + ten + " đã già");
                }
            }
        }
}
