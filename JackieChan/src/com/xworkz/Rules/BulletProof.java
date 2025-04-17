package com.xworkz.Rules;

public class BulletProof implements Bullet {

    @Override
    public void rules() {
        System.out.println("Bullet proof rules");
    }

    @Override
    public void safety() {
        System.out.println("Bullet proof safety");
    }

    @Override
    public void bullet() {
        System.out.println("Bullet proof bullet");
    }

    @Override
    public void material() {
        System.out.println("The material for bullet proof is steel.");
    }

}
