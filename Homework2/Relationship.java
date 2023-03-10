package HomeWorkOOP.Homework2;

public class Relationship implements RelationshipInterface {
    private Person human1;
    private Person human2;
    private Relation relation;

    public Relationship(Person person1, Person person2, Relation relation) {
        this.human1 = person1;
        this.human2 = person2;
        this.relation = relation;
    }

    public Person getPerson() {
        return this.human1;
    }

    public Person getRelationPerson() {
        return this.human2;
    }

    public Relation getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return String.format("%s is %s for %s", this.human1.getFirstname() + " " + this.human1.getSurname(),
                this.relation, this.human2.getFirstname() + " " + this.human2.getSurname());
    }
}
