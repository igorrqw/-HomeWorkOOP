package HomeWorkOOP.Homework1;

public class Main {
    public static void main(String[] args) {

        // Создаем 4 экземпляра класса Person для работы с ними.
        // grandfather - родитель для child
        // child - родитель для grandson1 и grandson2
        Person grandfather = new Person("Alexandr", "Man");
        Person child = new Person("Yriy", "Man", grandfather);
        Person grandson1 = new Person("Igor", "Man", child);
        Person grandson2 = new Person("Kirill", "Man", child);

        System.out.println("Перечень людей: " + Person.getPersons());

        System.out.println("Дети Александра: " + grandfather.getChildren());
        System.out.println("Дети Юрия: " + child.getChildren());
        System.out.println("Дети Игоря: " + grandson1.getChildren());

        System.out.println();

        System.out.println("Родители Александра: " + grandfather.getParent());
        System.out.println("Родители Юрия: " + child.getParent());
        System.out.println("Родители Игоря: " + grandson1.getParent());
        System.out.println("Родители Кирилла: " + grandson2.getParent());
    }
}