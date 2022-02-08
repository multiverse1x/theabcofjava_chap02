
public class Ex2_6 {
    public static void main(String[] args) {

        //printf()를 이용한 출력

        System.out.printf("%d%n", 15); // printf는 개행하지 않기때문에 %n을 넣어 개행해줌
        System.out.printf("%o%n", 15);
        System.out.printf("%x%n", 15);
        System.out.printf("%#x%n", 15); //접두사 붙이려면 #


        float f = 123.456789f;
        System.out.printf("%f%n", f);

        double t = 123.456789;
        System.out.printf("%f%n", t); //double타입의 정밀도가 더 높다
        System.out.printf("%e%n", t); // 지수형태
        System.out.printf("%g%n", t); // 간략형태


        System.out.printf("[%5d]%n", 10); // 5자리수, 오른쪽정렬, 남은자리는 공백
        System.out.printf("[%-5d]%n", 10); // 왼쪽 정력
        System.out.printf("[%05d]%n", 10); // 공백대신 0으로 채우기
        System.out.printf("[%5d]%n", 1234567); // 5자리수인데 값이 7자리면 출력도 7자리 전부됨

        // %전체자리.소수점아래자리f
        double d =1.23456789;
        System.out.printf("%f%n",d); //%f는 기본적으로 소수점 아래 6자리까지만 출력된다. 그래서소수점 아래 7자리에서 반올림됨
        System.out.printf("%14.10f%n", d); //소수점포함 총 14자리, 소수점 뒤 10자리. 앞은 공백, 뒤의 빈자리는 0으로 채워짐
        System.out.printf("%014.10f%n", d); // 위랑 같으며 0붙여서 앞공백에 0으로 채워짐


        System.out.printf("[%s]%n", "www.java.com"); //문자열 길이만큼 출력공간 확보
        System.out.printf("[%20s]%n", "www.java.com"); // 20글자 출력공간 확보, 우측정력
        System.out.printf("[%-20s]%n", "www.java.com"); // 20글자 출력공간 확보, 좌측정렬
        System.out.printf("[%.8s]%n", "www.java.com"); // 왼쪽에서 8글자만 출력
    }
}
