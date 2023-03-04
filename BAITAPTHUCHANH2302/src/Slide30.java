public class Slide30 {
    public static void main(String[] args){
        int a;
        int tong = 0;
        System.out.println("Nhập số cần tính:");
        Scanner stn = new Scanner(System.in);
        a = stn.nextInt();
        do {
            tong = tong + a % 10;
            a = a / 10;
        } while (a > 0);
        System.out.println("ket qua" + tong);
    }
}
