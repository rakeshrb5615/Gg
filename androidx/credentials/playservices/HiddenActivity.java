package androidx.credentials.playservices;
public class HiddenActivity extends android.app.Activity {
    public static final synthetic int c;
    public android.os.ResultReceiver a;
    public boolean b;

    public HiddenActivity()
    {
        return;
    }

    public final void a(android.os.ResultReceiver p4, String p5, String p6)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putBoolean("FAILURE_RESPONSE", 1);
        v0_1.putString("EXCEPTION_TYPE", p5);
        v0_1.putString("EXCEPTION_MESSAGE", p6);
        p4.send(2147483647, v0_1);
        this.finish();
        return;
    }

    public final void onActivityResult(int p4, int p5, android.content.Intent p6)
    {
        super.onActivityResult(p4, p5, p6);
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putBoolean("FAILURE_RESPONSE", 0);
        v0_1.putInt("ACTIVITY_REQUEST_CODE", p4);
        v0_1.putParcelable("RESULT_DATA", p6);
        android.os.ResultReceiver v4_1 = this.a;
        if (v4_1 != null) {
            v4_1.send(p5, v0_1);
        }
        this.b = 0;
        this.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p7)
    {
        super.onCreate(p7);
        this.overridePendingTransition(0, 0);
        u0.b v1_19 = this.getIntent().getStringExtra("TYPE");
        com.google.android.gms.tasks.Task v2_4 = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("RESULT_RECEIVER"));
        this.a = v2_4;
        if (v2_4 == null) {
            this.finish();
        }
        if (p7 != null) {
            this.b = p7.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", 0);
        }
        if (!this.b) {
            if (v1_19 != null) {
                com.google.android.gms.tasks.Task v2_6 = 0;
                switch (v1_19.hashCode()) {
                    case -441061071:
                        if (v1_19.equals("BEGIN_SIGN_IN")) {
                            String v0_14 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest) this.getIntent().getParcelableExtra("REQUEST_TYPE"));
                            u0.b v1_7 = this.getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (v0_14 != null) {
                                v2_6 = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this).beginSignIn(v0_14).addOnSuccessListener(new a5.a(new u0.c(this, v1_7, 0), 21)).addOnFailureListener(new u0.b(this, 3));
                            }
                            if (v2_6 != null) {
                                return;
                            } else {
                                android.util.Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                                this.finish();
                                return;
                            }
                        }
                    case 15545322:
                        if (v1_19.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            String v0_6 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) this.getIntent().getParcelableExtra("REQUEST_TYPE"));
                            u0.b v1_1 = this.getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (v0_6 != null) {
                                v2_6 = com.google.android.gms.fido.Fido.getFido2ApiClient(this).getRegisterPendingIntent(v0_6).addOnSuccessListener(new a5.a(new u0.c(this, v1_1, 2), 18)).addOnFailureListener(new u0.b(this, 0));
                            }
                            if (v2_6 != null) {
                                return;
                            } else {
                                android.util.Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                                this.finish();
                                return;
                            }
                        }
                    case 1246634622:
                        if (v1_19.equals("CREATE_PASSWORD")) {
                            String v0_32 = ((com.google.android.gms.auth.api.identity.SavePasswordRequest) this.getIntent().getParcelableExtra("REQUEST_TYPE"));
                            u0.b v1_21 = this.getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (v0_32 != null) {
                                v2_6 = com.google.android.gms.auth.api.identity.Identity.getCredentialSavingClient(this).savePassword(v0_32).addOnSuccessListener(new a5.a(new u0.c(this, v1_21, 1), 19)).addOnFailureListener(new u0.b(this, 1));
                            }
                            if (v2_6 != null) {
                                return;
                            } else {
                                android.util.Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                                this.finish();
                                return;
                            }
                        }
                    case 1980564212:
                        if (v1_19.equals("SIGN_IN_INTENT")) {
                            String v0_24 = ((com.google.android.gms.auth.api.identity.GetSignInIntentRequest) this.getIntent().getParcelableExtra("REQUEST_TYPE"));
                            u0.b v1_14 = this.getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (v0_24 != null) {
                                v2_6 = com.google.android.gms.auth.api.identity.Identity.getSignInClient(this).getSignInIntent(v0_24).addOnSuccessListener(new a5.a(new u0.c(this, v1_14, 3), 20)).addOnFailureListener(new u0.b(this, 2));
                            }
                            if (v2_6 != null) {
                                return;
                            } else {
                                android.util.Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                                this.finish();
                                return;
                            }
                        }
                    default:
                }
            }
            android.util.Log.w("HiddenActivity", "Activity handed an unsupported type");
            this.finish();
            return;
        }
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p3, "outState");
        p3.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(p3);
        return;
    }
}
