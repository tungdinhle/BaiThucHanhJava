import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        
        // Tính tổng, hiệu, tích, thương, chia lấy dư
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quo = a / b;
        int rem = a % b;
        
        // In kết quả
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + diff);
        System.out.println("Tích: " + prod);
        System.out.println("Thương: " + quo);
        System.out.println("Chia lấy dư: " + rem);
        
        // Sử dụng toán tử so sánh
        if (a > b) {
            System.out.println(a + " lớn hơn " + b);
        } else if (a < b) {
            System.out.println(a + " nhỏ hơn " + b);
        } else {
            System.out.println(a + " bằng " + b);
        }
    }
    }

