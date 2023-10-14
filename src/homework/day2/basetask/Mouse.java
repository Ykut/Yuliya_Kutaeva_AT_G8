package homework.day2.basetask;

public class Mouse {
    String name;
    int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails(){
        System.out.println("� ����, ���� ����� " + getName() + " � ��� " + getAge());
    }
}
