package za.ac.cput.conf.factory;

import za.ac.cput.domain.BenefitSet;
import za.ac.cput.domain.Deductible;
import za.ac.cput.domain.Payer;
import za.ac.cput.domain.Plan;

/**
 * Created by LILO on 2016/04/08.
 */
public interface PlanFactory {
    Plan createPlan(Deductible deductible, BenefitSet benefitSet, Payer payer);
}
