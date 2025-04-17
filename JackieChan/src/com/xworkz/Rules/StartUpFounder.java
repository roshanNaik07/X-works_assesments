package com.xworkz.Rules;

public class StartUpFounder implements StartUp{

    @Override
    public void returnsAndExchanges() {
        System.out.println("Returns and exchanges policy");
    }

    @Override
    public void privacyPolicy(){
        System.out.println("Privacy policy is important");
    }

    @Override
    public void termsAndConditions(){
        System.out.println("Terms and conditions are important");
    }

    @Override
    public void startupCulture(){
        System.out.println("Startup culture is important");
    }
}
