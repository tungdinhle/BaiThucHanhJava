public class Sile35 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 mời nhập");
        double a;
        double b;
        double c;
        double n1;
        double n2;
        double n3;
        //Nhập số a//
        Scanner soa = new Scanner(System.in); 
        System.out.println("Nhập số a:"); 
        a = soa.nextDouble();
        //Nhập số b//
        Scanner sob = new Scanner(System.in);
        System.out.println("Nhập số b:"); 
        b = sob.nextDouble();
        //Nhập số c//
        Scanner soc = new Scanner(System.in);
        System.out.println("Nhập số c:"); 
        c = soc.nextDouble();
        double denta = b*b-4*a*c;
        if (denta < 0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if (denta == 0){
            n3 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép là" + denta);
        }
        else{
           n1 = (-b + Math.sqrt(denta))/(2*a);
           n2 = (-b - Math.sqrt(denta))/(2*a);
           System.out.println("Phương trình có 2 nghiệm  là" + n1 +"và" + n2);
        }   
}
}
