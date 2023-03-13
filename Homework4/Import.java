package HomeWorkOOP.Homework4;

import java.io.*;

public class Import implements Serializable {
    public void doImport() throws IOException, ClassNotFoundException {
        Scheduler npExport = new Scheduler();
        FileInputStream fileInput = new FileInputStream("MyScheduler.out");
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        npExport = (Scheduler) objectInput.readObject();
    }
}