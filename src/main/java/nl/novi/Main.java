package nl.novi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    // Stap 2: Klasse Persoon
    System.out.println("Step2");
    Person person = new Person("Maarten", 33);
    Person[] personsArray = {
        new Person("Alice", 25),
        new Person("Bob", 30),
        new Person("Charlie", 35)
    };
    System.out.println(person.toString());

    // Stap 3: Arrays en Complexe Types
    System.out.println("Step3");
    for (int i = 0; i < personsArray.length; i++) {
      var name = personsArray[i].getName();
      var age = personsArray[i].getAge();
      System.out.println("Name: " + name + ", Age: " + age);
    }

    System.out.println();
    int i = 0;
    while (i < personsArray.length) {
      var name = personsArray[i].getName();
      var age = personsArray[i].getAge();
      System.out.println("Name: " + name + ", Age: " + age);
      i++;
    }

    System.out.println();
    int j = 0;
    do {
      var name = personsArray[j].getName();
      var age = personsArray[j].getAge();
      System.out.println("Name: " + name + ", Age: " + age);
      j++;
    } while (j < personsArray.length);

    System.out.println();
    for (Person person2 : personsArray) {
      var name = person2.getName();
      var age = person2.getAge();
      System.out.println("Name: " + name + ", Age: " + age);
    }
    System.out.println();

    // Stap 4: ArrayList en Complexe Types
    System.out.println("Step4");
    List<Person> personList = new ArrayList<Person>();
    personList.add(new Person("David", 40));
    personList.add(new Person("Eva", 45));
    personList.add(new Person("Frank", 50));

    for (int k = 0; k < personList.size(); k++) {
      var name = personList.get(k).getName();
      var age = personList.get(k).getAge();
      System.out.println("Name: " + name + ", Age: " + age);
    }
    System.out.println();

    i = 0;
    while (i < personList.size()) {
      var name = personList.get(i).getName();
      var age = personList.get(i).getAge();
      System.out.println("Name: " + name + ", Age: " + age);
      i++;
    }
    System.out.println();

    i = 0;
    do {
      var name = personList.get(i).getName();
      var age = personList.get(i).getAge();
      System.out.println("Name: " + name + ", Age: " + age);
      i++;
    } while (i < personList.size());
    System.out.println();

    for (Person person2 : personList) {
      var name = person2.getName();
      var age = person2.getAge();
      System.out.println("Name: " + name + ", Age: " + age);
    }

    // Bonusopdracht
    generateRandomePerson(7);

//    Reflectievragen
//    Wat zijn de voordelen van het gebruik van een enhanced for-lus ten opzichte van een gewone for-lus?
//    Kortere syntax, overzichtelijker.
//        In welke situaties zou een while-lus geschikter zijn dan een for-lus?
//    Wanneer je nog niet perse de lengte van een array weet. Of wanneer een lus uitgevoerd moet worden tenzij een waarde aan een
//    conditie binnen de loop in de een if statement niet voldoet of juist wel.
//        Waarom zou je een do-while-lus gebruiken in plaats van een while-lus?
//    Vooral om de eerst iteratie van de loop uit te laten voeren.
//        Welke lus vond je het gemakkelijkst te gebruiken met een ArrayList en waarom?
//    De enhanced loop vooral omdat die lekker snel getypt is en gewoon werkt. En de notatie is fijn en duidelijk.
//    Wat zijn de voor- en nadelen van het gebruik van arrays versus ArrayLists voor complexe types zoals de klasse Persoon?
//    Arrays zijn vooraf opgegegeven dus daar kan niet aan toegevoegd worden. Ze zijn wat eenvoudiger.
//    Deze arrays hebben geen ingebouwde methoden
//    De ArrayList daarin tegen is rijk aan methodes en kan dynamisch groeien of krimpen.
    // Een nadeel is wel dat ArrayList werkt met objecten en niet met primitieve datatypes. Dit betekent dat er extra overhead is voor
    // autoboxing en unboxing als je met primitieve types werkt.

    //conclusie
//    Gebruik arrays wanneer de grootte van de verzameling bekend en vast is, en wanneer maximale prestatie en minimale
//    geheugenvoetafdruk vereist zijn.
//    Gebruik ArrayList wanneer je flexibiliteit nodig hebt in termen van dynamische grootte en wanneer je wilt profiteren van de
//    uitgebreide ingebouwde methoden voor collectiebeheer.
  }

  public static void generateRandomePerson(int amountOfPersons) {
    List<Person> personList = new ArrayList<>();
    String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

    Random random = new Random();
    String name;
    int age;
    int i = 0;
    int totalAge = 0;
    while (i < amountOfPersons) {
      name = names[random.nextInt(names.length)];
      age = random.nextInt(100);
      personList.add(new Person(name, age));
      i++;
    }

    for (Person person : personList) {
      // Print all details
      name = person.getName();
      age = person.getAge();
      System.out.println("Name: " + name + ", Age: " + age);
      totalAge += person.getAge();
    }

    System.out.println("The average age of all persons is: " + totalAge / amountOfPersons);

  }
}