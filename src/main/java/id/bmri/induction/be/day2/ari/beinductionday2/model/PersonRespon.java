package id.bmri.induction.be.day2.ari.beinductionday2.model;

import lombok.Data;

@Data
public class PersonRespon {

    String name;
    Integer age;

    public PersonRespon(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonRespon(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonRespon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
