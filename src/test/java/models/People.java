package models;

public class People {
    private String name;
    private Integer age;
    private String gender;

    public People(String name, Integer age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String  toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }


}
