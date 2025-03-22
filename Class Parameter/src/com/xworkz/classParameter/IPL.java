package com.xworkz.classParameter;

public class IPL {

        public void getDetails(IplTeams iplTeams) {
            System.out.println("Running getDetails in Shop");
            if (iplTeams != null) {
                iplTeams.teamInfo();
            } else
                System.out.println("display is pointing to null");
        }

}
