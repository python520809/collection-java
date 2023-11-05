public class Cat extends Animal {
    public Cat(String name, int age, String sex, double price) {
        super(name, age, sex, 200);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
