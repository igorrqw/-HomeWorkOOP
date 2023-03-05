package HomeWorkOOP.Homework2;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Relationship> link = new ArrayList<>();

    public List<Relationship> getRelationship() {
        return link;
    }

    public void setRelationship(List<Relationship> links) {
        this.link.addAll(links);
    }

    public void addRelationship(Person p1, Person p2, Relation r1, Relation r2) {
        this.link.add(new Relationship(p1, p2, r1));
        this.link.add(new Relationship(p2, p1, r2));
    }

    @Override
    public String toString() {
        String result = new String();
        for (Relationship el : link) {
            result += el + "\n";
        }
        return result;
    }
}