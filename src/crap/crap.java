package crap;

public class crap {

    private void firstCrap(){

        String tile = " □ ";

        // ------------ TOP -------------//
        System.out.println("                     North");
        System.out.println("      ╔═══════════════════════════════════╗");
        // -----------------------------//


        // ------------ MIDDLE  -------------//

        for (int i = 0; i < 5; i++) {
            System.out.print("      ║");
            for (int j = 0; j < 10; j++) {
                System.out.print(tile);
            }
            System.out.println("║");
        }
        System.out.print("West  ║");
        for (int j = 0; j < 10; j++) {
            System.out.print(tile);
        }
        System.out.println("║  East");

        for (int i = 0; i < 4; i++) {
            System.out.print("      ║");
            for (int j = 0; j < 10; j++) {
                System.out.print(tile);
            }
            System.out.println("║");
        }

        // -----------------------------//


        // ------------ BOTTOM ------------ //
        System.out.println("      ╚═══════════════════════════════════╝");
        System.out.println("                     South");
        // -------------------------------- //

    }



}
