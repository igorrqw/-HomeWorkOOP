package HomeWorkOOP.Homework2;

public class Person extends Human implements PersonInterface {
    public Person(String firstName, String surName, Integer birthDate, Gender gender) {
        setFirstName(firstName);
        setSurName(surName);
        setAge(birthDate);
        setGender(gender);
    }

    @Override
    public String getFirstname() {
        return this.firstName;
    }

    @Override
    public String getSurname() {
        return this.surName;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, surName, age, gender);
    }
}
