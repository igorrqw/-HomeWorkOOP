package HomeWorkOOP.Homework4;

import java.io.*;

public class Export implements Serializable {
    public void doExsport(Scheduler np) throws IOException {
        FileOutputStream fileOutput = new FileOutputStream("MyScheduler.out");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(np);
        objectOutput.flush();
        objectOutput.close();
    }
}