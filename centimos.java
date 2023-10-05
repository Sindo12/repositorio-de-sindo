import java.util.Scanner;
    public class centimos{
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int dinero;
            int dos;        //2
            int uno;        //1
            int cero05;     //0.50
            int cero02;     //0.20
            int cero01;     //0.10
            int cero005;    //0.05
            int cero002;    //0.02
            int cero001;    //0.01    
            int resto;
            System.out.println("Di una cantidad de euros");
            dinero = lector.nextInt();
            resto = dinero * 100;
            
            if (resto / 200 >= 1);
            resto=(int)resto/200;
            dos=resto%200;
            
            if (resto / 100 >= 1);
            resto=(int)resto/100;
            uno=resto%100;

            if (resto / 50 >= 1);
            resto=(int)resto/50;
            cero05=resto%50;
            
            if (resto / 20 >= 1);
            resto=(int)resto/20;
            cero02=resto%20;
            
            if (resto / 10 >= 1);
            resto=(int)resto/10;
            cero01=resto%10;

            if (resto / 5 >= 1);
            resto=(int)resto/5;
            cero005=resto%5;

            if (resto / 2 >= 1);
            resto=(int)resto/2;
            cero002=resto%2;

            if (resto / 1 >= 1);
            resto=(int)resto/1;
            cero001=resto%1;

            System.out.println("tienes " + dos + " monedas de 2 euros, " + uno + " monedas de 1 euro, " + cero05 + " monedas de 50 centimos, " + cero02 + " monedas de 20 centimos, " + cero01 + "monedas de 10 centimos, " + cero005 + "monedas de 5 centimos, " + cero002 + "monedas de 2 centimos, " + cero001 + "monedas de 1 centimo.");
            


    }
}