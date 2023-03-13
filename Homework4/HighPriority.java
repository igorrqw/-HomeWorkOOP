package HomeWorkOOP.Homework4;

import java.time.LocalDate;

public class HighPriority extends Task {

    public HighPriority(LocalDate data, String node, String deadLineTime, String deadLineDate, String avtor) {
        super(data, node, deadLineTime, deadLineDate, avtor);
    }

    @Override
    public String toString() {
        return "HighPriority!!! " + super.toString();
    }
}