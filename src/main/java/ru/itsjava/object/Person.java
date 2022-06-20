package ru.itsjava.object;


public class Person {
//1. Написать свой класс Person с полями имя, возраст
//2. Метод void birthday() (который увеличивает возраст на 1)
//и boolean takeBeer(), который проверяет возраст и выдает true если возраст больше 18 и false в ином случае
//3. Написать все возможные тесты на этот класс

    //поля
    private final String name;
    private int age;

    //конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age=age;
    }

    ;

    // методы
    public void birthday() {
        this.age = age + 1;
        System.out.println("Теперь возраст: " + age);
    }

    public boolean takeBeer() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        final Person other = (Person) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Person;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        return result;
    }

    public String toString() {
        return "Person(name=" + this.getName() + ", age=" + this.getAge() + ")";
    }
}



