public class Main {
     //Задача 2

    public static void main(String[] args) {
        task2();
    }

    private static void task2() {
    int clientDeviceYear = 2014;
    int clientOS =0;
        if (clientDeviceYear<2015 && clientOS==1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear<2015 && clientOS==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Продолжить установку");
        }
    }
}