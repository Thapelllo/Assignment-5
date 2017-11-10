package za.ac.cput.conf.factory.Impl;

import za.ac.cput.conf.factory.PlanFactory;
import za.ac.cput.domain.BenefitSet;
import za.ac.cput.domain.Deductible;
import za.ac.cput.domain.Payer;
import za.ac.cput.domain.Plan;

/**
 * Created by LILO on 2016/04/08.
 */
public class PlanFactoryImpl  implements PlanFactory{

    private static PlanFactoryImpl planFactory = null;

    private PlanFactoryImpl(){}

    public static PlanFactoryImpl getInstance(){
        if(planFactory == null)
            planFactory = new PlanFactoryImpl();
            return planFactory;
    }

    public Plan createPlan(Deductible deductible, BenefitSet benefitSet, Payer payer) {
        Plan plan = new Plan.Builder().deductible(deductible).benefitSets(benefitSet).payer(payer).build();
        return plan;
    }
}
