public class Cat {
    private double age;
    private String nickname;
    private String breed;
    private String color;

    public Cat(double age, String nickname, String breed, String color){
        this.age = age;
        this.nickname = nickname;
        this.breed = breed;
        this.color = color;
    }

    @Override
    public String toString() {
        return " возраст кота: " + age +"\n кличка: " + nickname +"\n порода: " + breed + "\n окрас: " + color;
    }

    public static void main(String[] args) {
        Cat catMy = new Cat(0.1, "Marmelad", "пятнистая", "рыже-черно-белый");
        Cat catMyFriend = new Cat(4, "Inga", "null", "серый");
//        catMy.age = 0.1;
//        catMy.nickname = "Marmelad";
//        catMy.breed = "пятнистая";
//        catMy.color = "рыже-черно-белый";
        System.out.println(catMy);
        System.out.println();
        System.out.println(catMyFriend);
    }

}

