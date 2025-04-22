package com.xworkz.external;

import com.xworkz.internal.TrainingInstitute;

public class StartUp {

    TrainingInstitute trainingInstitute;

    public StartUp(TrainingInstitute trainingInstitute) {
        this.trainingInstitute = trainingInstitute;
        System.out.println("Running no arg const of StartUp");
    }

    public void start() {
        if (this.trainingInstitute != null) {
            System.out.println("Running start in StartUp");
            this.trainingInstitute.guide();
        } else {
            System.err.println("TrainingInstitute is null");
        }
    }
}
