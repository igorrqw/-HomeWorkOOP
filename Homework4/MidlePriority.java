package HomeWorkOOP.Homework4;

import java.time.LocalDate;

public class MidlePriority extends Task {

    public MidlePriority(LocalDate data, String node, String deadLineTime, String deadLineDate, String avtor) {
        super(data, node, deadLineTime, deadLineDate, avtor);
    }

    @Override
    public String toString() {
        return "MidlePriority!! " + super.toString();
    }
}