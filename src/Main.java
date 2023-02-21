import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.print("Планетанын атын жазыныз: ");
        String planetaString = scanner.nextLine();
        Planets.valueOf(planetaString);
        Planets planets = Planets.valueOf(planetaString);

        switch(planets) {
            case Earth:
                System.out.println("Жер - Күндөн үчүнчү планета жана жашоону колдой турган жалгыз белгилүү планета.");
                break;
            case Mars:
                System.out.println("Марс Жер планетасына окшош, анткени ал мезгилдер, полярдык муз капкактары жана суюк суунун далили.");
                break;
            case Saturn:
                System.out.println("Сатурн Күндөн алтынчы планета болуп саналат жана анын көрүнүктүү жана кооз шакек системасы менен белгилүү.");
                break;
            case Neptun:
                System.out.println("Нептун - Күндөн сегизинчи жана акыркы планета.\n" +
                        "Нептун муз гиганттарына таандык жана Римдин деңиздердин кудайы Нептундун атынан аталган.");
                 break;
            default:
                System.out.println("Мындай планета жок...");
        }

    }
}}