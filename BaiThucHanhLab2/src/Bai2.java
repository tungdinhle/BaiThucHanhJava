public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}
