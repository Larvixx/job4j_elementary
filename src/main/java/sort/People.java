package sort;

public class People implements Comparable<People> {
    private String name;

    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= " + name + "---"
                +
                " age=" + age + System.lineSeparator();
    }

    @Override
    public int compareTo(People o) {
        return Integer.compare(age, o.age);
    }
}
