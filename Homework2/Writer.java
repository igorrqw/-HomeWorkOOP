package HomeWorkOOP.Homework2;

import java.util.List;
import java.io.*;

public class Writer {
    private FamilyTree tree;

    public Writer(FamilyTree tree) {
        this.tree = tree;
    }

    public void writeToFile() {
        List<Relationship> lst = tree.getRelationship();

        try (FileWriter writer = new FileWriter("File.txt", false)) {
            for (int i = 0; i < lst.size(); i++) {
                Relationship el = lst.get(i);

                String str = String.format("%s is %s for %s",
                        el.getPerson().getFirstname() + " " + el.getPerson().getSurname(),
                        el.getRelation(),
                        el.getRelationPerson().getFirstname() + " " + el.getRelationPerson().getSurname());

                writer.write(str);
                writer.append('\n');
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}