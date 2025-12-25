package com.google.android.gms.cloudmessaging;
interface IMessengerCompat implements android.os.IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    public abstract void send();
}
