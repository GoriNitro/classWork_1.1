public class Main {
    public static void main(String[] args) {
        String [] commands = {"Сидеть" , "Лежать"};
        String [] commands1 = {"Фасс", "Голос"};
        Shelter shelter = new Shelter("Romashka", "lenina 29");
        Dog dog = new Dog("Rex", "Mastiv",commands,shelter,color.BROWN );
        Dog dog1 = new Dog("Belka", "Ovcharka",commands1,shelter,color.BLACK);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Аф аф");
        System.out.println("--------------");
        System.out.println(dog1.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");
    }
}