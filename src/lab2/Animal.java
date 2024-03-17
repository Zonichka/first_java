package lab2;

// Класс Animal (животное)
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Барон", 3, "Лабрадор");
        myDog.makeSound();
        myDog.bark();
        System.out.println("Его зовут " + myDog.getName());

        Cat myCat = new Cat("Мурка", 2, "Сухой корм");
        myCat.makeSound();
        myCat.meow();
        System.out.println("Котику " + myCat.getAge() + " годика");

        Bird myBird = new Bird("Чижик", 1, true);
        myBird.makeSound();
        myBird.tweet();
    }
}

// Подкласс Dog (собака)
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Гав-гав!");
    }
}

// Подкласс Cat (кошка)
class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public void meow() {
        System.out.println("Мяу!");
    }
}

// Подкласс Bird (птица)
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void tweet() {
        System.out.println("Чирик-чирик!");
    }
}
