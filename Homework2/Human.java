package HomeWorkOOP.Homework2;

public abstract class Human {
    protected String firstName;
    protected String surName;
    protected Integer age;
    protected Gender gender;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = (Gender) gender;
    }
}
