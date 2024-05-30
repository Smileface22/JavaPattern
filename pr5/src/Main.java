
public class Main {
    public static void main(String[] args) {
        Singleton1 instance11 = Singleton1.getInstance();
        Singleton1 instance12 = Singleton1.getInstance();
        Singleton2 instance21 = Singleton2.getInstance();
        Singleton2 instance22 = Singleton2.getInstance();
        Singleton3 instance31 = Singleton3.getInstance();
        Singleton3 instance32 = Singleton3.getInstance();
        System.out.println("Объект11 - " + instance11);
        System.out.println("Объект12 - " + instance12);
        System.out.println("Объект21 - " + instance21);
        System.out.println("Объект22 - " + instance22);
        System.out.println("Объект31 - " + instance31);
        System.out.println("Объект32 - " + instance32);
    }
}