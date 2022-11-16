package org.example.urls;

public class Url {

    private String loginUrl = "https://dashboard.stripe.com/login";

    private String paymentUrl100 = "https://buy.stripe.com/test_5kA3di3fq2In4Wk4gg";


    public String getPaymentUrl100() {
        return paymentUrl100;
    }

    public String getLoginUrl() {
        return loginUrl;
    }
}

