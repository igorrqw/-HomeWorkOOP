package HomeWorkOOP.Homework4;

import java.time.LocalDate;

public class LowPriority extends Task {

    public LowPriority(LocalDate data, String node, String deadLineTime, String deadLineDate, String avtor) {
        super(data, node, deadLineTime, deadLineDate, avtor);
    }

    @Override
    public String toString() {
        return "LowPriority! " + super.toString();
    }
}