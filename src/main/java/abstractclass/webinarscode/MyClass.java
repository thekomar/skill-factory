package abstractclass.webinarscode;

public class MyClass {
    String name;
    int age;

    public MyClass() {
    }

    public MyClass(int age) {
        this.age = age;
    }

    public MyClass(String name) {
        this.name = name;
    }

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void method1(String someParam){
        name = someParam.repeat(3);
    }
    int sumAge(int age){
        return this.age + age;
    }
}
