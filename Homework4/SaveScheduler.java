package HomeWorkOOP.Homework4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveScheduler<E> {
    public void save(List<E> list) {

        try (FileWriter fw = new FileWriter("Scheduler.csv", true)) {

            for (E el : list) {
                fw.write(el.toString());
                fw.append('\n');
                fw.append("---------------------------------");
                fw.append('\n');
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}