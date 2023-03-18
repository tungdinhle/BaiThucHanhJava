public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi và ký tự cần đếm từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char c = sc.next().charAt(0);

        // Khai báo biến count và đếm số lần xuất hiện của ký tự đó trong chuỗi
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        // Hiển thị số lần xuất hiện của ký tự đó
        System.out.printf("Ký tự '%c' xuất hiện %d lần trong chuỗi '%s'", c, count, str);
        sc.close();
    }
}
