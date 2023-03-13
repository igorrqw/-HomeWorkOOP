package HomeWorkOOP.Homework4;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
                Scheduler taskList = new Scheduler();

                taskList.addTask(new HighPriority(LocalDate.of(2023, 01, 11), "Drive",
                                "23:59", "2023 01 12", "Igor"));
                taskList.addTask(new MidlePriority(LocalDate.of(2023, 01, 13), "Birthday",
                                "9:00", "2023 01 14", "Igor"));
                taskList.addTask(new LowPriority(LocalDate.of(2023, 01, 15), "Job",
                                "12:00", "2023 02 1", "Igor"));
                taskList.addTask(new HighPriority(LocalDate.of(2023, 02, 1), "flight",
                                "2:30", "2023 02 2", "Gin"));
                System.out.println(taskList);
                System.out.println("--------------------------------------------------------");

                // При помощи методов showHiPriority(), showMidlePriority(), showLowPriority()
                // получаем задачи по приоритетам
                System.out.println("Задача среднего приоритета:");
                taskList.showMidlePriority();
                System.out.println("--------------------------------------------------------");

                // Для удаления записи вызываем метод deleteTask()
                System.out.println("Введите id записи для удаления или добавления");
                int id = input.nextInt();
                taskList.deleteTask(id);
                System.out.println("--------------------------------------------------------");
                System.out.println(taskList);
                System.out.println("--------------------------------------------------------");

                System.out.println(
                                "Выберете приоритет задачи. Нажмите цифру\n1-высокий 2-средний 3-низкий");
                int chek = input.nextInt();
                // Метод формирует задачу и записывает её в файл Scheduler.csv
                taskList.addTaskFromUserByCheck(chek);

                // Метод считывает данные из файла Scheduler.csv и выводит данные в консоль
                ReadScheduler rd = new ReadScheduler();
                rd.readFile();

        }
}