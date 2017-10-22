package sebastianougterolsen;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class MineMetoder {

    /*Skal indeholde minimum 5 ting, der illustrerer det, du har lært i september,
    f.eks. if, for, while, Random, Date, enum, Scanner, String eller andet, vi har snakket om.
    Skriv kommentar, der viser din forståelse af koden. */

public void altMuligt () {


    //Anvendelse af Class Date bare fordi det er nemt.
    Date dato = new Date(); //Opretter nyt objekt i klassen "Date" med default constructor
    //Default constructor i Date-klassen initialiserer automatisk et oprettet objekt med dagens dato
    System.out.println(dato + "\n"); //Udprinter jeg objektet "dato", vil den derfor vise tid og dato for i dag.


    System.out.println("Demonstration af" + "\n" + "SCANNER, RANDOM, ARRAY, IF STATEMENT OG LOOP:"+ "\n\n" + "Fyld tal i et Array:" + "\n");

    //Her konstruere jeg en ny array kaldet "mitArray"
    int[] mitArray = new int[10]; //Deklareres som int, og der gøres plads til 10 indexes


    //Her generere jeg et tilfældigt tal fra 0 til og med 9, som skal bruges i koden:
    //Der bliver genereret et tal mellem 0.0...01 og 0.9...99. som ganges med et tal for at ændre tallene den går mellem.
    //Og bruger (int) for at runde af til nærmeste heltal.
    //Denne vil så give et af tallene: 0,1,2,3,4,5,6,7,8,9.
    Random r= new Random();
    int random=r.nextInt(10);


    //Jeg laver et Scanner-objekt til input fra brugeren og udskriver hvor mange input brugeren kan foretage
    Scanner input = new Scanner(System.in);
    System.out.println("Indtast " + (mitArray.length-random) + " værdi(er) herunder:"); //Antal indexes angives med .length & -random for at få et tilfældigt input

    //Jeg laver et for-loop, der initialiserer vores array med brugerinputtet
    for (int i = 0; i < mitArray.length- random; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
        mitArray[i] = input.nextInt(); //Tildeler i-værdien til "mitArray"

    System.out.print("Nu indeholder vores array disse/denne værdi(er): " + "\n");

    // Her laver vi et for-loop, der printer hvert element i vores array
    for (int i = 0; i < mitArray.length-random; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
        System.out.print(mitArray[i] + " "); //"mitArray[i]" er naturligvis den værdi loopet initialiserer indexet

    //En if statement der fortæller om der er mere plads i Array'et
    if(random==1)//Hvis der er 1 plads tilbage
    System.out.println("\n" + "Der er stadig lige " + random + " Plads tilbage i Array'et" + "\n" + "Så indtast " + random + " mere herunder");
else if(random==0)//Hvis der er 0 pladser tilbage
    System.out.println("\n" +"Array'et er nu fyldt");
   else //Hvis der stadig er tomme pladser
   System.out.println("\n" + "Der er stadig " + random + " Pladser tilbage i Array'et" + "\n" + "Så indtast " + random + " mere herunder:");





    //Jeg laver et for-loop, der initialiserer vores array med brugerinputtet
    for (int i = 0; i < random; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
        mitArray[i] = input.nextInt(); //Tildeler i-værdien til "mitArray"

    // Her laver vi et for-loop, der printer hvert element i vores array
    for (int i = 0; i < mitArray.length; i++) //Hvis "i" er mindre end antallet af indexes i array køres loopet
        System.out.print(mitArray[i] + " "); //"mitArray[i]" er naturligvis den værdi loopet initialiserer indexet

}

}
