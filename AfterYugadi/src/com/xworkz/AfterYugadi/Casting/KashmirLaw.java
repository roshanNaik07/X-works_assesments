package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Law;
import com.xworkz.AfterYugadi.Internal.Subject;

public class KashmirLaw {

    public void implement(Subject subject){
        subject.board();
        subject.learn();
        subject.read();
        subject.price();
        subject.write();
        if (subject instanceof Law){
            Law law = (Law) subject;
            law.explain();
        }
    }
}
