package com.xworkz.Rules;

public class FaceWash implements SkinCare{

    @Override
    public void skinCareHydration() {
        System.out.println("skinCareHydration is important");
    }

    @Override
    public void skinCareDiet() {
        System.out.println("skinCareDiet is important");
    }

    @Override
    public void skinCareLifestyle() {
        System.out.println("Moisturizer is important");
    }

    @Override
    public void skinCareRoutine() {
        System.out.println("Skin care routine is important");
    }
}
