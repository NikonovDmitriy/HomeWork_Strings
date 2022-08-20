public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "ФИО сотрудника - "+lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        String fullName2= lastName + " " + firstName + " " + middleName;
        String fullName3 = fullName2.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName3);

        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        String fullName4 = "Иванов Семён Семёнович";
        String fullName5 = fullName4.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName5);
    }
}