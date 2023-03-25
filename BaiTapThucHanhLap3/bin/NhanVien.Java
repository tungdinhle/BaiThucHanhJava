    public class NhanVien {
        String ho ten;
        int tuoi;
        float he so luong;
        void nhapThongTin()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ho ten: ");
            fullName = sc.nextLine();
            System.out.println();
            System.out.println("Nhap tuoi: ");
            Age = sc.nextlnt();
            System.out.println("Nhap he so luong: ")
            he so luong = sc.nextfloat();

        } 

        float tinhluong()
        {
            return hesoluong * luongcoban;
        }

        void hienThiThongTin()
        {
            System.out.printf("ho ten: ");
            System.out.printf("tuoi: ");
            System.out.printf("hesoluong: ");
            System.out.printf("luong: " + tinh luong());
        
        }

    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhapThongTin();
        nhanVien.hienThongTin();
    }