package B4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name,LocalDate birthDate ) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public Person() {
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getAge(){
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age: " + age);
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        getAge();
    }
}
