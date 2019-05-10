import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap a =");
        a=scanner.nextInt();
        System.out.println("Nhap b =");
        b=scanner.nextInt();
        if (a!=0){
            x=-b/a;
            System.out.println("phuong trinh co nghiem la"+x);
        }else {
            if (b==0){
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
