package oop;

public class Student extends Person {
    private String universityName;

    public Student() {
    }

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public Student clone() {
        Student copy = new Student(super.getName(), super.getAge(), super.getHeight(), this.universityName);
        return copy;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder(super.getInfo());
        info.append(", university name = ").append(this.universityName);
        return info.toString();
    }
}
