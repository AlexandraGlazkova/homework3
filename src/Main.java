public class Main {
    //Задача 6


    public static void main(String[] args) { task6(); }

    private static void task6() {
       int age = 19;
       int salary = 58_000;
       double x=1.5;
       int y=2;
       int z=3;
       double h=1.2;

       if (age>=23 && salary>=50_000) {
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+ salary*y*h);}
              if (age>=23 && salary>=80_000){
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+ salary*z*x);}
              if (age<=23 && salary>=50_000){
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+ salary*y*h);}
              if(age<=23 && salary>=80_000){
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+ salary*y*x);}

    }
}