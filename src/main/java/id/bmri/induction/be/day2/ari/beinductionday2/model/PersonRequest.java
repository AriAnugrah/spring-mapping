package id.bmri.induction.be.day2.ari.beinductionday2.model;

public class PersonRequest {

    String name;
    Integer age;

    public PersonRequest(String name, Integer age) {
        this.name = name;
        this.age = age;
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
        return "PersonRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
