package codeCademy;

public class Dog {
        String breed;
        boolean hasOwner;
        int age;
        boolean isTrained;

        public Dog(String dogBreed, boolean dogOwned, int dogYears, boolean beenTrained) {
            System.out.println("Constructor invoked!");
            breed = dogBreed;
            hasOwner = dogOwned;
            age = dogYears;
            isTrained = beenTrained;
        }

        public static void main(String[] args) {
            System.out.println("Main method started");
            Dog fido = new Dog("poodle", false, 4, true);
            Dog nunzio = new Dog("shiba inu", true, 12, false);
            Dog ali = new Dog("boxer", true, 9, true);
            boolean isFidoOlder = fido.age > nunzio.age;
            boolean isAliYounger = ali.age < nunzio.age;
            int totalDogYears = nunzio.age + fido.age + ali.age;
            System.out.println("Three dogs created: a " + fido.breed + " a " + nunzio.breed + " and a " + ali.breed);
            System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
            System.out.println("The statement that Ali is younger than Nunzio is " + isAliYounger);
            System.out.println("The total age of the dogs is: " + totalDogYears);
            System.out.println("Main method finished");
        }
    }

