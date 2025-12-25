package y4;
public abstract class u {
    private static final com.google.android.gms.common.logging.Logger zza;

    static u()
    {
        String[] v1_1 = new String[0];
        y4.u.zza = new com.google.android.gms.common.logging.Logger("PhoneAuthProvider", v1_1);
        return;
    }

    public abstract void onCodeAutoRetrievalTimeOut();

    public abstract void onCodeSent();

    public abstract void onVerificationCompleted();

    public abstract void onVerificationFailed();
}
