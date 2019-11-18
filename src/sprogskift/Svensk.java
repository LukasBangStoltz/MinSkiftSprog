package sprogskift;

public class Svensk implements SprogI {

    public void printMenu() {
        System.out.println("Välkommen till Dog Show");
        System.out.println("1) visa hundlista");
        System.out.println("2) välj hund");
        System.out.println("3) sökhund med namn");
        System.out.println("4) Byt språk");
        System.out.println("9) avsluta programmet");
        System.out.println("Ange val:");
    }

    public void printLang() {
        System.out.println("Ändra språk:");
        System.out.println("1) danska");
        System.out.println("2) engelska");
        System.out.println("2) svenska");

    }

}
