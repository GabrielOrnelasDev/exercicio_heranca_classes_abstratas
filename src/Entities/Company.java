package Entities;

public class Company extends TaxPayer{

    protected Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualInCome, Integer numberOfEmployees) {
        super(name, anualInCome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(numberOfEmployees > 10){
           return anualInCome * 0.14;
        }else{
            return anualInCome * 0.16;
        }
    }

}
