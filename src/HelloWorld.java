public class HelloWorld {

    public static void main(String[] args) {
        // Kommentar
        /*
        Kommentar
        Mehrzeilig
         */

        System.out.println("Hello to PR0-World!");

        byte wunschNotePR1 = 1;
        wunschNotePR1 = 2;
        System.out.println("Wunschnote:" + wunschNotePR1);
        wunschNotePR1 = 4;
        System.out.println("Wunschnote:" + wunschNotePR1);

        boolean istMittwoch = true;
        System.out.println("Ist heute Mittwoch?" + istMittwoch);

        istMittwoch = false;
        System.out.println("Ist heute Mittwoch?" + istMittwoch);

        if (istMittwoch == true)
        {
            System.out.println("Juhu, es ist PR0");
        }
        else
        {
            System.out.println("auweh, aber ich übe trotzdem");
        }

    }
}
