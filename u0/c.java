package u0;
public final class c extends kotlin.jvm.internal.k implements u7.l {
    public final synthetic int a;
    public final synthetic androidx.credentials.playservices.HiddenActivity b;
    public final synthetic int c;

    public synthetic c(androidx.credentials.playservices.HiddenActivity p1, int p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        super(1);
        return;
    }

    public final Object invoke(Object p10)
    {
        switch (this.a) {
            case 0:
                androidx.credentials.playservices.HiddenActivity v1_2 = this.b;
                try {
                    v1_2.b = 1;
                    v1_2.startIntentSenderForResult(((com.google.android.gms.auth.api.identity.BeginSignInResult) p10).getPendingIntent().getIntentSender(), this.c, 0, 0, 0, 0, 0);
                } catch (android.os.ResultReceiver v0_11) {
                    h7.l v10_18 = v0_11;
                    android.os.ResultReceiver v0_12 = v1_2.a;
                    kotlin.jvm.internal.j.b(v0_12);
                    String v2_13 = new StringBuilder("During begin sign in, one tap ui intent sender failure: ");
                    v2_13.append(v10_18.getMessage());
                    v1_2.a(v0_12, "GET_UNKNOWN", v2_13.toString());
                }
                return h7.l.a;
            case 1:
                androidx.credentials.playservices.HiddenActivity v1_1 = this.b;
                try {
                    v1_1.b = 1;
                    v1_1.startIntentSenderForResult(((com.google.android.gms.auth.api.identity.SavePasswordResult) p10).getPendingIntent().getIntentSender(), this.c, 0, 0, 0, 0, 0);
                } catch (android.os.ResultReceiver v0_7) {
                    h7.l v10_12 = v0_7;
                    android.os.ResultReceiver v0_8 = v1_1.a;
                    kotlin.jvm.internal.j.b(v0_8);
                    String v2_9 = new StringBuilder("During save password, found UI intent sender failure: ");
                    v2_9.append(v10_12.getMessage());
                    v1_1.a(v0_8, "CREATE_UNKNOWN", v2_9.toString());
                }
                return h7.l.a;
            case 2:
                androidx.credentials.playservices.HiddenActivity v1_0 = this.b;
                kotlin.jvm.internal.j.e(((android.app.PendingIntent) p10), "result");
                try {
                    v1_0.b = 1;
                    v1_0.startIntentSenderForResult(((android.app.PendingIntent) p10).getIntentSender(), this.c, 0, 0, 0, 0, 0);
                } catch (android.os.ResultReceiver v0_3) {
                    h7.l v10_5 = v0_3;
                    android.os.ResultReceiver v0_4 = v1_0.a;
                    kotlin.jvm.internal.j.b(v0_4);
                    String v2_5 = new StringBuilder("During public key credential, found IntentSender failure on public key creation: ");
                    v2_5.append(v10_5.getMessage());
                    v1_0.a(v0_4, "CREATE_UNKNOWN", v2_5.toString());
                }
                return h7.l.a;
            default:
                androidx.credentials.playservices.HiddenActivity v1_3 = this.b;
                try {
                    v1_3.b = 1;
                    v1_3.startIntentSenderForResult(((android.app.PendingIntent) p10).getIntentSender(), this.c, 0, 0, 0, 0, 0);
                } catch (android.os.ResultReceiver v0_1) {
                    h7.l v10_1 = v0_1;
                    android.os.ResultReceiver v0_2 = v1_3.a;
                    kotlin.jvm.internal.j.b(v0_2);
                    String v2_2 = new StringBuilder("During get sign-in intent, one tap ui intent sender failure: ");
                    v2_2.append(v10_1.getMessage());
                    v1_3.a(v0_2, "GET_UNKNOWN", v2_2.toString());
                }
                return h7.l.a;
        }
    }
}
