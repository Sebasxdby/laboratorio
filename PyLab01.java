public class Princial {

    public static void main (String)
        int vida,rp;
        boolean fl = false;
        vida = 0;
        Scanner SC = new Scanner(system.in)
        do {
            vida ++;
            System.out println("Vida:" +vida + "\t Cual es el numero secreto ?");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = True;
        while(vida < 3 && !fl );
        if( fl == true )
            System.out.println("Adivinaste !!!")
        else
            System.out.println("ups, perdiste ....")    
        }
}