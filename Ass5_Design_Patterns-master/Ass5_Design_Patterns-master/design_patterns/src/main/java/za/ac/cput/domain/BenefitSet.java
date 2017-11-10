package za.ac.cput.domain;

import java.io.Serializable;

/**
 * Created by IT on 2017/05/30.
 */
public class BenefitSet implements Serializable{
    private Service service;

    private BenefitSet(){

    }

    public BenefitSet(Service service) {
        this.service = service;
    }
    /* public BenefitSet(Builder builder) {
        service = builder.service;
    }*/

    public Service getService() {
        return service;
    }
    /*public class Builder{
        private Service service;

        public Builder service(Service value){
            this.service = value;
            return this;
        }
        public Builder copy(BenefitSet value){
            this.service = value.getService();
            return this;
        }
        public BenefitSet build(){
            return new BenefitSet(this);
        }
    }*/

}
