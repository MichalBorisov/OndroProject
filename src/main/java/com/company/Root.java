package com.company;

public class Root {

   private  Last_updated last_updated;
   private  Disclaimer disclaimer;
   private  Rates rates;

    public Root(Last_updated last_updated, Disclaimer disclaimer, Rates rates) {
        this.last_updated = last_updated;
        this.disclaimer = disclaimer;
        this.rates = rates;
    }

    public Last_updated getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Last_updated last_updated) {
        this.last_updated = last_updated;
    }

    public Disclaimer getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(Disclaimer disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public Root() {
    }
}