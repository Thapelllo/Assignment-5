package za.ac.cput.domain;


import java.io.Serializable;


public class Plan implements Serializable{
    private Deductible deductible;
    private BenefitSet benefitSets;
    private Payer payer;

    private Plan(){}

    public Plan(Builder builder) {
        deductible = builder.deductible;
        benefitSets = builder.benefitSets;
        payer = builder.payer;
    }

    public Deductible getDeductible() {
        return deductible;
    }

    public BenefitSet getBenefitSets() {
        return benefitSets;
    }

    public Payer getPayer() {
        return payer;
    }

    public void checkDeduction(Deductible deductible){
        if(deductible.isDeductible()){
            System.out.print("Plan: Valid claim. Currently processing claim for approval...");
        }
    }
    public static class Builder{
        private Deductible deductible;
        private BenefitSet benefitSets;
        private Payer payer;

        public Builder deductible(Deductible value){
            this.deductible = value;
            return this;
        }
        public Builder benefitSets(BenefitSet value){
            this.benefitSets = value;
            return this;
        }
        public Builder payer(Payer value){
            this.payer = value;
            return this;
        }
        public Builder copy(Plan value)
        {
            this.deductible = value.getDeductible();
            this.benefitSets = value.getBenefitSets();
            this.payer = value.getPayer();
            return this;
        }

        public Plan build(){return new Plan(this);}
    }

}
