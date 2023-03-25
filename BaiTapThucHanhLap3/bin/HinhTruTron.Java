public class HinhTrutron{
    float chieu cao;
    float the tich;
    float dien tich hai day;
    float dien tich toan phan;
    float chu vi;
    float ban kinh;
    final float PI = 3,14f;
    void nhapBanKinh();
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("nhapBanKinh: ");
        nhapBankinh = sc.newfloat();     
    }

    void nhapChieuCao();
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhapChieuCao: ")
        nhapChieuCao = sc.newfloat();
    }

    float tinhChuVi()
    {
        return ChuVi = 2 * PI * BanKinh * ChieuCao;
    }
   
    float tinhDienTichHaiDay()
    {
        return DienTichHaiDay = 2 * PI * BanKinh * BanKinh;
    }
     
    float tinhDienTichToanPhan()
    {
        return DienTichToanPhan = 2 * PI * BanKinh + (BanKinh + ChieuCao);
    }

    float tinhTheTich()
    {
        return TheTich = PI * BanKinh * BanKinh * ChieuCao;
    }

    void inThongTin()
    {
        System.out.printf(format: Hinh tru tron co: BanKinh = %f; DienTichHaiDay = %f; DienTichToanPhan = %f; TheTich = %f; ChieuCao = %f
        BanKinh, DienTichHaiDay, DienTichToanPhan, TheTich, ChieuCao);
    }
        
        

        
    }
}
