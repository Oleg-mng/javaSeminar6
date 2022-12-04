import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cat {
    private int id;
    private double age;
    private String nickname;
    private String breed;
    private String color;
    public static Set<Cat> cats;

    public Cat(int id, double age, String nickname, String breed, String color) {
        this.id = id;
        this.age = age;
        this.nickname = nickname;
        this.breed = breed;
        this.color = color;
        cats = new HashSet();
    }

    @Override
    public String toString() {
        return " id:" + id + "\n возраст кота: " + age + "\n кличка: " + nickname + "\n порода: " + breed + "\n окрас: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return id == cat.id && Double.compare(cat.age, age) == 0 && nickname.equals(cat.nickname) && breed.equals(cat.breed) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, nickname, breed, color);
    }

    public static void main(String[] args) {
//        Set<Cat> cats = new HashSet();
        Cat catMy = new Cat(101, 0.1, "Marmelad", "пятнистая", "рыже-черно-белый");
        Cat catMyFriend = new Cat(102, 4, "Inga", "unknown", "серый");
        Cat catMyDublicate = new Cat(101, 0.1, "Marmelad", "пятнистая", "рыже-черно-белый");
        cats.add(catMy);
        cats.add(catMyFriend);
        cats.add(catMyDublicate);
//        catMy.age = 0.1;
//        catMy.nickname = "Marmelad";
//        catMy.breed = "пятнистая";
//        catMy.color = "рыже-черно-белый";
//        System.out.println(catMy);
//        System.out.println();
//        System.out.println(catMyFriend);
        for (Cat i : cats) {
            System.out.println();
            System.out.println(i);
        }
        System.out.println("Проверка множества котов на равенство: ");
        System.out.println("равны ли коты: catMy = catMyDublicate? ответ: " + catMy.equals(catMyDublicate));
        System.out.println("равны ли коты: catMy = catMyFriend? ответ: " + catMy.equals(catMyFriend));
    }
}

