package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money additionalArray) {
        int jaunieCenti = cents + additionalArray.cents;
        int jaunieEiro = euros + additionalArray.euros;
        if (jaunieCenti > 99) {
            jaunieCenti -= 100;
            jaunieEiro++;
        }

        Money newMoneyObject = new Money(jaunieEiro, jaunieCenti);

        return newMoneyObject;
    }

    public boolean lessThan(Money comparedObject) {
        double izsauktaObjektaNauda = euros + (cents/100.0); // objekta
        double salidzinamaObjektaNauda = comparedObject.euros + (comparedObject.cents / 100.0); // parametra.
        // System.out.println(String.valueOf(izsauktaObjektaNauda) + String.valueOf(salidzinamaObjektaNauda));
        if (izsauktaObjektaNauda < salidzinamaObjektaNauda) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int jaunaObjektaEiro = euros - decreaser.euros;
        int jaunaObjektaCenti = cents - decreaser.cents;
        
        if (jaunaObjektaCenti < 0) { // Aprēķina centus.
            jaunaObjektaCenti = 100 + jaunaObjektaCenti;
            jaunaObjektaEiro--;
        }

        if (jaunaObjektaEiro < 0) { // Pārbauda vai nauda jau ir mazāka par 0 (negatīvs balans).
            jaunaObjektaEiro = 0;
            jaunaObjektaCenti = 0;
        } else if (jaunaObjektaEiro < 1) { // Pārbauda vai nauda jau ir mazāka par 1.
            jaunaObjektaEiro = 0;
        }

        Money jaunaisObjekts = new Money(jaunaObjektaEiro, jaunaObjektaCenti); // Izveido objektu ar apstrādātajiem datiem.
        return jaunaisObjekts;
    }
}

    

