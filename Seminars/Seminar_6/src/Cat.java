import java.util.Objects;

public class Cat {
//    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.

    public static int counter = 0;
    public int id;
    public int age;
    public String color;
    public String name;

    public Cat(String name, String color, int age){
            this.id = counter++;
            this.name = name;
            this.color = color;
            this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Кот №%d: Кличка: %s, Цвет: %s, Возраст: %d", this.id, this.name, this.color, this.age);
    }
    public String say(){
        return "Meow";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat){
            Cat cat = (Cat) o;
            return cat.age == this.age && cat.name == this.name && cat.color == this.color;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name, this.color);
    }
}
