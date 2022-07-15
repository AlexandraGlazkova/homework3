public class Main {
    //Задача 5


    public static void main(String[] args) { task5(); }

    private static void task5() {
        int monthNumber =5;
        switch (monthNumber){
            case 12:
                System.out.println("декабрь"+" Зима");
                break;
            case 1:
                System.out.println("январь"+" Зима");
                break;
            case 2:
                System.out.println("февраль"+" Зима");
                break;
            case 3:
                System.out.println("март"+" весна");
                break;
            case 4:
                System.out.println("апрель"+" весна");
                break;
            case 5:
                System.out.println("май"+" весна");
                break;
            case 6:
                System.out.println("июнь"+" лето");
                break;
            case 7:
                System.out.println("июль"+" лето");
                break;
            case 8:
                System.out.println("август"+" лето");
                break;
            case 9:
                System.out.println("сентябрь"+" осень");
                break;
            case 10:
                System.out.println("октябрь"+" осень");
                break;
            case 11:
                System.out.println("ноябрь"+" осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }


    }
}