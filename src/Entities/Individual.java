package Entities;

public class Individual extends TaxPayer{

    protected Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualInCome, Double healthExpenditures) {
        super(name, anualInCome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if(anualInCome < 20000) {
           return anualInCome * 0.15 - healthExpenditures * 0.5;
        }else{
            return anualInCome * 0.25 - healthExpenditures * 0.5;
        }
    }

}
