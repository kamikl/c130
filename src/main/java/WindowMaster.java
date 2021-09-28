import java.text.NumberFormat;
import java.util.*;


public class WindowMaster {

    public static void main(String[] args) {
        float height;
        float width;

        String stringHeight = "";
        String stringWidth = "";
        String stringWindowCost= "";
        String stringTrimCost = "";
        String stringWindowQty = "";

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float costOfWindow;
        float costOfTrim;

        int windowQty;

        Scanner myScanner = new Scanner(System.in);


        try {
            System.out.println("Please enter window height:");
            stringHeight = myScanner.nextLine();
            Float.parseFloat(stringHeight);

            System.out.println("Please enter window width:");
            stringWidth = myScanner.nextLine();
            Float.parseFloat(stringWidth);

            System.out.println("Please enter window cost by area");
            stringWindowCost = myScanner.nextLine();
            Float.parseFloat(stringWindowCost);

            System.out.println("Please enter trim cost by area");
            stringTrimCost = myScanner.nextLine();
            Float.parseFloat(stringTrimCost);

            System.out.println("Please enter quantity of Windows");
            stringWindowQty = myScanner.nextLine();
            Float.parseFloat(stringWindowQty);

        } catch(NumberFormatException ex) {
            System.out.println("That was not a number!");
        }








        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        costOfWindow = Float.parseFloat(stringWindowCost);
        costOfTrim = Float.parseFloat(stringTrimCost);
        windowQty = Integer.parseInt(stringWindowQty);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);

        cost = windowQty * ((costOfWindow*areaOfWindow) + (costOfTrim * perimeterOfWindow));

        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " +perimeterOfWindow);
        System.out.println("Total Cost = " + cost);


    }
}
