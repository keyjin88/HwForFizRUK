package src.hw3p3;

public class t1 {

    public class Bat extends Mammal implements Flying{

        @Override
        public void fly() {
            System.out.println("Летает медленно");
        }
    }

    public class Dolphin extends Mammal implements Swimming{
        @Override
        public void swim() {
            System.out.println("Плавает быстро");
        }
    }

    public class GoldFish extends Fish implements Swimming{
        @Override
        public void swim() {
            System.out.println("Плавает медленно");
        }
    }

    public class Eagle extends Bird implements Flying{
        @Override
        public void fly() {
            System.out.println("Летает быстро");
        }
    }

    public abstract class Animal {
        public void eat() {
            System.out.println("Единый метод поглощения пищи");
        }

        public void sleep() {
            System.out.println("Zzz...");
        }

        abstract void wayOfBirth();
    }

    public abstract class Mammal extends Animal {
        @Override
        void wayOfBirth() {
            System.out.println("Живорождение");
        }
    }

    public abstract class Fish extends Animal {
        @Override
        void wayOfBirth() {
            System.out.println("Метание икры");

        }
    }

    public abstract class Bird extends Animal {
        @Override
        void wayOfBirth() {
            System.out.println("Откладывание яиц");
        }
    }

    public interface Flying {
        void fly();
    }

    public interface Swimming {
        void swim();
    }

}
