
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        String firstName = "Ivan"; //для хранения имени
        String middleName = "Ivanovich"; //для хранения отчества
        String lastName = "Ivanov";//для хранения фамилии
        String fullName = lastName + " " + firstName + " " + middleName;// для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Задача №2
        System.out.println("Задача №2");
        String s1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + s1);

        //Задача №3
        System.out.println("Задача №3");
        String fullName2 = "Иванов Семён Семёнович";
        String correctedFullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName2);
    }
}