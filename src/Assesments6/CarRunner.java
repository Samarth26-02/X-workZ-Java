package Assesment6;

import Assesment5.Dealer;

public class CarRunner {
    public static void main(String[] args) {
        Dealer dealer=new Dealer();
        Buyer buyer=new Buyer();
        dealer.carDetails();
        buyer.accessCarDetail();
    }
}
