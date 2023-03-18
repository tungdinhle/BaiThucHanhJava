public class Bai9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print( "Nhập vào chuỗi cần đếm ký tự: ");
        String input = scanner.nextLine();

        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("Số ký tự thường trong chuỗi là: " + lowerCaseCount);
        System.out.println("Số ký tự hoa trong chuỗi là: " + upperCaseCount);
        System.out.println("Số số trong chuỗi là: " + digitCount);
    }
}
