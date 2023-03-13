package HomeWorkOOP.Homework4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Scheduler implements Iterable<Task>, Serializable {
    public static Scanner input = new Scanner(System.in);

    private List<Task> tasksList = new ArrayList<>();

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void addTask(Task task) {
        tasksList.add(task);
    }

    public void addTaskFromUserByCheck(int chek) {
        SaveScheduler savePlanner = new SaveScheduler();

        System.out.println("Введите дату. Пример (2023 01 01) (Год, Месяц, День)");
        String data = input.nextLine();
        String[] dataArr = data.split(" ");
        LocalDate d = LocalDate.of(Integer.parseInt(dataArr[0]), Integer.parseInt(dataArr[1]),
                Integer.parseInt(dataArr[2]));
        System.out.println("Добавьте задачу");
        String strTask = input.nextLine();
        System.out.println("Установите время дедлайна. Пример (23:59) ");
        String deadLineTime = input.next();
        System.out.println("Установите дату дедлайна. Пример (2023 01 01) (Год, Месяц, День)");
        String deadLineDate = input.next();
        System.out.println("Укажите автора");
        input.nextLine();
        String avtor = input.next();

        switch (chek) {
            case (1):
                tasksList.add(new HighPriority(d, strTask, deadLineTime, deadLineDate, avtor));
                savePlanner.save(tasksList);
                break;

            case (2):
                tasksList.add(new MidlePriority(d, strTask, deadLineTime, deadLineDate, avtor));
                savePlanner.save(tasksList);
                break;

            case (3):
                tasksList.add(new LowPriority(d, strTask, deadLineTime, deadLineDate, avtor));
                savePlanner.save(tasksList);
                break;

        }
    }

    public void showHiPriority() {
        for (Task item : tasksList) {
            if (item instanceof HighPriority) {
                System.out.println(item);
            }
        }
    }

    public void showMidlePriority() {
        for (Task item : tasksList) {
            if (item instanceof MidlePriority) {
                System.out.println(item);
            }
        }
    }

    public void showLowPriority() {
        for (Task item : tasksList) {
            if (item instanceof LowPriority) {
                System.out.println(item);
            }
        }
    }

    public int getTaskById(int id) {
        int i = 0;
        boolean not = true;
        while (not && i < tasksList.size()) {
            if (tasksList.get(i).getId() == id)
                not = false;
            else
                i++;
        }
        if (not) {
            i = -1;
        }
        return i;
    }

    public void deleteTask(int id) {
        if (getTaskById(id) > -1) {
            int i = getTaskById(id);
            tasksList.remove(i);
        }
    }

    @Override
    public String toString() {
        return "Имеются записи: \n" +
                tasksList +
                '}';
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int ind = 0;

            @Override
            public boolean hasNext() {
                return ind < tasksList.size();
            }

            @Override
            public Object next() {
                return tasksList.get(ind++);
            }
        };
    }
}