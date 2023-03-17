package HomeWorkOOP.test;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LoggerClass {
    java.util.logging.Logger logger;

    public LoggerClass(java.util.logging.Logger logger){
        this.logger = logger;
    }
    
    public void doLog(double first, String operation, double second, double result) {
        String str = String.format("%s %s %s = %s", first,  operation, second, result);
        
        logger.info(str);

        try (FileWriter writer= new FileWriter("Homework5log.csv", true)) {
            writer.write(LocalDate.now() + ": " + str + ";\n");
    
        } catch (IOException ex) {
        }
}
}