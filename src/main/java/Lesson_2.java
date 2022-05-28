public class Lesson_2 {
    public static void main(String[] args) {
        sum(7, 8);
        number(-17);
        newNumber(14);
        cycle("Lesson_2", 5);
        year(2020);
    }
    public static void sum(int a, int b) {
        if((a + b) >= 10 && (a + b) <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void number(int c) {
        if(c >= 0) {
            System.out.println("+");
        }
        else {
            System.out.println("-");
        }
    }
    public static void newNumber(int a) {
        if(a <= 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void cycle( String a, int b) {
        for(int i = 0; i <= b; i++) {
            System.out.println(a);
        }
    }
    public static void year(int a) {
            if(a % 400 == 0 && a % 100 == 0) {
                System.out.println("true");
            }
            else if(a % 4 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
    }
}
