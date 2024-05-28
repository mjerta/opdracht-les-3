### Opdracht:Les 3

#### Doel

In deze opdracht ga je werken met collecties (Arrays en ArrayLists), verschillende lussen (do-while, while-do, for, en
enhanced for) en complexe types. Je leert hoe je complexe objecten kunt beheren binnen collecties en welke lus je in
verschillende situaties kunt gebruiken.

#### Instructies

1. Maak een Java-project in je IDE.
2. Maak een klasse `Main` met een `main`-methode.
3. Maak een klasse `Persoon` met eigenschappen `naam` en `leeftijd`.
4. Implementeer de volgende stappen en beantwoord de vragen die daarbij horen.

#### Stappen

##### Stap 1: Arrays en Primitieve Types

1. **Maak een array van integers:** Initialiseer deze met willekeurige waarden,
   bijvoorbeeld `int[] getallen = {1, 2, 3, 4, 5};`.

    ```java
    int[] getallen = {1, 2, 3, 4, 5};
    ```

2. **Gebruik een `for`-lus:** Bereken de som van alle waarden in het array.][p;l.]
    ```java
    int som = 0;
    for (int i = 0; i < getallen.length; i++) {
        som += getallen[i];
    }
    System.out.println("Som: " + som);
    ```

3. **Gebruik een `while`-lus:** Vind de grootste waarde in het array.

    ```java
    int grootste = getallen[0];
    int j = 1;
    while (j < getallen.length) {
        if (getallen[j] > grootste) {
            grootste = getallen[j];
        }
        j++;
    }
    System.out.println("Grootste waarde: " + grootste);
    ```

4. **Gebruik een `do-while`-lus:** Tel het aantal even getallen in het array.

    ```java
    int evenCount = 0;
    int k = 0;
    do {
        if (getallen[k] % 2 == 0) {
            evenCount++;
        }
        k++;
    } while (k < getallen.length);
    System.out.println("Aantal even getallen: " + evenCount);
    ```

5. **Gebruik een `enhanced for`-lus:** Print elke waarde in het array.

    ```java
    for (int getal : getallen) {
        System.out.println(getal);
    }
    ```

##### Stap 2: Klasse Persoon

1. **Maak een klasse `Persoon`:** Deze klasse moet de eigenschappen `naam` (String) en `leeftijd` (int) bevatten.

    ```java
    public class Persoon {
        private String naam;
        private int leeftijd;
    }
    ```

2. **Voeg een constructor toe:** Zorg ervoor dat je een constructor hebt die de eigenschappen `naam` en `leeftijd`
   initialiseert.

    ```java
    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }
    ```

3. **Voeg getters en setters toe:** Maak methodes om de waarden van `naam` en `leeftijd` te kunnen opvragen en wijzigen.

    ```java
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    ```

4. **Voeg een `toString`-methode toe:** Deze methode geeft een stringrepresentatie van het object terug, handig voor het
   printen.

`@override` is nodig omdat op elke klasse al de toString() methode is opgenomen. Hiermee geef je aan dat je die
standaard implemntatie wilt overschrijven.

```java
    @Override
public String toString(){
        return"Persoon{"+
        "naam='"+naam+'\''+
        ", leeftijd="+leeftijd+
        '}';
        }
```

##### Stap 3: Arrays en Complexe Types

1. **Maak een array van `Persoon`-objecten:** Initialiseer deze met ten minste drie personen.

    ```java
    Persoon[] personenArray = {
        new Persoon("Alice", 25),
        new Persoon("Bob", 30),
        new Persoon("Charlie", 35)
    };
    ```

2. **Gebruik een gewone `for`-lus:** Itereer door het array en print de details van elke persoon.

3. **Gebruik een `while`-lus:** Itereer door het array en print de details van elke persoon.

4. **Gebruik een `do-while`-lus:** Itereer door het array en print de details van elke persoon.

5. **Gebruik een `enhanced for`-lus:** Itereer door het array en print de details van elke persoon.

##### Stap 4: ArrayList en Complexe Types

1. **Maak een `ArrayList` van `Persoon`-objecten:** Voeg ten minste drie personen toe.

    ```java
    List<Persoon> personenList = new ArrayList<>();
    personenList.add(new Persoon("David", 40));
    personenList.add(new Persoon("Eva", 45));
    personenList.add(new Persoon("Frank", 50));
    ```

2. **Gebruik een gewone `for`-lus:** Itereer door de `ArrayList` en print de details van elke persoon.

3. **Gebruik een `while`-lus:** Itereer door de `ArrayList` en print de details van elke persoon.

4. **Gebruik een `do-while`-lus:** Itereer door de `ArrayList` en print de details van elke persoon.

5. **Gebruik een `enhanced for`-lus:** Itereer door de `ArrayList` en print de details van elke persoon.

 

##### Reflectievragen

1. Wat zijn de voordelen van het gebruik van een `enhanced for`-lus ten opzichte van een gewone `for`-lus?
2. In welke situaties zou een `while`-lus geschikter zijn dan een `for`-lus?
3. Waarom zou je een `do-while`-lus gebruiken in plaats van een `while`-lus?
4. Welke lus vond je het gemakkelijkst te gebruiken met een `ArrayList` en waarom?
5. Wat zijn de voor- en nadelen van het gebruik van arrays versus ArrayLists voor complexe types zoals de
   klasse `Persoon`?

### Bonusopdracht

Schrijf een methode die een lijst van willekeurige `Persoon`-objecten genereert en de gemiddelde leeftijd van deze
personen berekent. Gebruik hiervoor ten minste twee verschillende soorten lussen (bijvoorbeeld een `for`-lus en
een `while`-lus).


---

## Toelichting

Hier zijn de basisimplementaties van verschillende lusconstructies in Java:

### Do-While Loop
Een do-while-lus voert de instructies in het blok minstens één keer uit, ongeacht de voorwaarde, omdat de voorwaarde aan het einde van de lus wordt gecontroleerd.

```java
int count = 0;
do {
    System.out.println("Count is: " + count);
    count++;
} while (count < 5);
```

### While Loop
Een while-lus controleert de voorwaarde aan het begin van elke herhaling en voert de instructies in het blok uit zolang de voorwaarde waar is.

```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++;
}
```

### For Loop
Een for-lus is handig wanneer je een blok instructies een bepaald aantal keren wilt uitvoeren. Het heeft drie delen: initialisatie, voorwaarde, en incrementeer-/decrementeeroperatie.

```java
for (int count = 0; count < 5; count++) {
    System.out.println("Count is: " + count);
}
```

### Enhanced For Loop (For-Each)
Een enhanced for-lus (ook bekend als een for-each-lus) wordt gebruikt om door arrays of collecties te itereren.

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println("Number is: " + number);
}
```

---

## Uitwerking
<details>
<summary>klik hier voor de uitwerkingen</summary>

#### Klasse Persoon

```java
public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
```

#### Arrays en complexe types

```java
public class Main {
    public static void main(String[] args) {
        Persoon[] personenArray = {
                new Persoon("Alice", 25),
                new Persoon("Bob", 30),
                new Persoon("Charlie", 35)
        };

        // For-loop
        for (int i = 0; i < personenArray.length; i++) {
            System.out.println(personenArray[i]);
        }

        // While-loop
        int i = 0;
        while (i < personenArray.length) {
            System.out.println(personenArray[i]);
            i++;
        }

        // Do-while loop
        int j = 0;
        do {
            System.out.println(personenArray[j]);
            j++;


        } while (j < personenArray.length);

        // Enhanced for-loop
        for (Persoon persoon : personenArray) {
            System.out.println(persoon);
        }

        // ArrayList en Complexe Types
        List<Persoon> personenList = new ArrayList<>();
        personenList.add(new Persoon("David", 40));
        personenList.add(new Persoon("Eva", 45));
        personenList.add(new Persoon("Frank", 50));

        // For-loop
        for (int k = 0; k < personenList.size(); k++) {
            System.out.println(personenList.get(k));
        }

        // While-loop
        int k = 0;
        while (k < personenList.size()) {
            System.out.println(personenList.get(k));
            k++;
        }

        // Do-while loop
        int l = 0;
        do {
            System.out.println(personenList.get(l));
            l++;
        } while (l < personenList.size());

        // Enhanced for-loop
        for (Persoon persoon : personenList) {
            System.out.println(persoon);
        }

        // Arrays en Primitieve Types
        int[] getallen = {1, 2, 3, 4, 5};

        // Som van alle waarden
        int som = 0;
        for (int m = 0; m < getallen.length; m++) {
            som += getallen[m];
        }
        System.out.println("Som: " + som);

        // Grootste waarde
        int grootste = getallen[0];
        int n = 1;
        while (n < getallen.length) {
            if (getallen[n] > grootste) {
                grootste = getallen[n];
            }
            n++;
        }
        System.out.println("Grootste waarde: " + grootste);

        // Aantal even getallen
        int evenCount = 0;
        int o = 0;
        do {
            if (getallen[o] % 2 == 0) {
                evenCount++;
            }
            o++;
        } while (o < getallen.length);
        System.out.println("Aantal even getallen: " + evenCount);

        // Enhanced for-loop
        for (int getal : getallen) {
            System.out.println(getal);
        }
    }
}
```

#### Reflectievragen - Antwoorden

1. De voordelen van een `enhanced for`-lus zijn dat het code simpeler en leesbaarder maakt, vooral wanneer je niet de
   index van de elementen nodig hebt.
2. Een `while`-lus is geschikter wanneer je niet weet hoeveel iteraties nodig zijn en je een conditie hebt die tijdens
   de iteraties kan veranderen.
3. Een `do-while`-lus gebruik je als je zeker weet dat de code in het blok minstens één keer uitgevoerd moet worden
   voordat de conditie gecontroleerd wordt.
4. De `enhanced for`-lus is vaak het gemakkelijkst te gebruiken met een `ArrayList` omdat je direct door de elementen
   kunt itereren zonder gebruik te maken van een index.
5. Arrays zijn statisch in grootte en sneller bij toegang, maar minder flexibel. ArrayLists zijn dynamisch in grootte en
   flexibeler, maar hebben een kleine overhead voor dynamisch geheugenbeheer.

</details>