package HomeWorkOOP.Homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadScheduler {
    public void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Scheduler.csv"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}