import java.util.Scanner;

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int giri, i, iMin;
        float sommaHamilton, sommaVerstappen, veloceHamilton, veloceVerstappen;
        do {
            System.out.println("Da quanti giri è composta la gara?");
            giri = in.nextInt();
        } while (giri<3);
        float [] tempiHamilton = new float [giri];
        float [] tempiVerstappen = new float [giri];
        sommaHamilton = 0;
        sommaVerstappen = 0;
        i = 0;
        while (i<tempiHamilton.length) {
            System.out.println("In quanto tempo ha Hamilton completato il giro n°" + i+1 + "?");
            tempiHamilton[i] = in.nextFloat();
            sommaHamilton += tempiHamilton[i];
            System.out.println("In quanto tempo ha Verstappen completato il giro n°" + i+1 + "?");
            tempiVerstappen[i] = in.nextFloat();
            sommaVerstappen += tempiVerstappen[i];
            i++;
        }
        if (sommaHamilton<sommaVerstappen) {
            System.out.println("Il vincitore della gara è Hamilton, che ha finito la gara in " + sommaHamilton);
        } else {
            System.out.println("Il vincitore della gara è Verstappen, che ha finito la gara in " + sommaVerstappen);
        }
        i = 0;
        iMin = 0;
        while (i<tempiHamilton.length) {
            if (tempiHamilton[i]<tempiHamilton[iMin]) {
                iMin = i;
            }
            i++;
        }
        veloceHamilton = tempiHamilton[iMin];
        System.out.println("Il giro più veloce di Hamilton è stato il giro n°" + iMin+1 + " ed ha totalizzato un tempo di " + veloceHamilton);
        i = 0;
        iMin = 0;
        while (i<tempiVerstappen.length) {
            if (tempiVerstappen[i]<tempiVerstappen[iMin]) {
                iMin = i;
            }
            i++;
        }
        veloceVerstappen = tempiVerstappen[iMin];
        System.out.println("Il giro più veloce di Verstappen è stato il giro n°" + iMin+1 + " ed ha totalizzato un tempo di " + veloceVerstappen);
        if (veloceVerstappen<veloceHamilton) {
            System.out.println("Il giro più veloce è stato quello di Verstappen");
        } else {
            System.out.println("Il giro più veloce è stato quello di Hamilton");
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md