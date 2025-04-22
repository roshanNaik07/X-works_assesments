package com.xworkz.external;

import com.xworkz.internal.Speaker;

public class JBL {

    Speaker speaker;

    public JBL(Speaker speaker) {
        System.out.println("Running no arg const of JBL");
        this.speaker = speaker;
    }

    public void play() {
        if (this.speaker != null) {
            System.out.println("Running play in JBL");
            this.speaker.onSpeaker();
        } else {
            System.err.println("Speaker is null");
        }
    }

}

