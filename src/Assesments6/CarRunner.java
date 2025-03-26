package Assesments6;

import Assesments5.Dealer;

public class CarRunner {
    public static void main(String[] args) {
        Dealer dealer=new Dealer();
        Assesment6.Buyer buyer=new Assesment6.Buyer();
        dealer.carDetails();
        buyer.accessCarDetail();
    }
}
