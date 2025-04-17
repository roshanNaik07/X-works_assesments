package com.xworkz.Rules;

public class KungFuStudent implements kungFu{

    @Override
    public void rules() {
        System.out.println("Kung Fu students must follow the rules of the dojo.");
    }

    @Override
    public void students() {
        System.out.println("Kung Fu students must respect their fellow students.");
    }

    @Override
    public void teachers() {
        System.out.println("Kung Fu students must respect their teachers.");
    }

    @Override
    public void learn() {
        System.out.println("Kung Fu students must learn the techniques and forms of Kung Fu.");
    }

}
