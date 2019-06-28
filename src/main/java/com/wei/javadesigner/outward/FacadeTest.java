package com.wei.javadesigner.outward;

public class FacadeTest {

    public static void main(String[] args) {
        System.out.println("开始办理行政手续...");
        ApproveFacade approveFacade = new ApproveFacade();
        approveFacade.wholeApprove();
//        HealthOffice ho = new HealthOffice();
//        RevenueOffice ro = new RevenueOffice();
//        SaicOffice so = new SaicOffice();
//
//        ho.approve();
//        ro.approve();
//        so.approve();

        System.out.println("行政手续终于办完了");
    }

}