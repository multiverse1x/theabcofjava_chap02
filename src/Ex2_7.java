import  java.util.*;

public class Ex2_7 {
    public static void main(String[] args) {

        //화면으로부터 입력받기
        //Scanner 클래스

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num);

        //두개의 값을 연속적으로 받으려면 하나 더써주자.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt(); //한칸 띄우고 적어도됨
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        //라인단위로 입력
        String input = scanner.nextLine();
        int num4 = Integer.parseInt(input);
        System.out.println(num4);

    }
}
