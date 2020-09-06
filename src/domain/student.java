package domain;

public class student {
    private Integer num;
    private String name;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public student(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
