public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}