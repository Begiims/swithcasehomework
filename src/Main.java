import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("java lesson");
                break;
            case 2:
                System.out.println("Technical English");
                break;
            case 3:
                System.out.println("math lesson");
                break;
            case 4:
                System.out.println("geography");
                break;
            case 5:
                System.out.println("literature");
                break;
            default:
                System.out.println("Sabak bolboyt");
        }
    }
}