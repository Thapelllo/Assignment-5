package za.ac.cput.domain;

import java.io.Serializable;


public class Payer implements Serializable {
    private Plan plan;

    private Payer(){}

    public Payer(Plan plan) {
        this.plan = plan;
    }
    /* public Payer(Builder builder) {
        plan = builder.plan;
    }*/

    public Plan getPlan() {
        return plan;
    }

   /* public class Builder{
        private Plan plan;

        public Builder plan(Plan value){
            this.plan = value;
            return this;
        }
        public Builder copy(Payer value){
            this.plan = value.getPlan();
            return this;
        }
        public Payer bulid(){return new Payer(this);}
    }*/
}
