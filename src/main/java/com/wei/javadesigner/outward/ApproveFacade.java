package com.wei.javadesigner.outward;

class ApproveFacade {

    public ApproveFacade() {

    }

    public void wholeApprove() {
        new HealthOffice().approve();;
        new RevenueOffice().approve();
        new SaicOffice().approve();
    }

}