package com.google.android.gms.auth.api.signin.internal;
public class SignInHubActivity extends androidx.fragment.app.j0 {
    private static boolean zba = False;
    private boolean zbb;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private android.content.Intent zbf;

    public SignInHubActivity()
    {
        this.zbb = 0;
        return;
    }

    public static bridge synthetic int zba(com.google.android.gms.auth.api.signin.internal.SignInHubActivity p0)
    {
        return p0.zbe;
    }

    public static bridge synthetic android.content.Intent zbb(com.google.android.gms.auth.api.signin.internal.SignInHubActivity p0)
    {
        return p0.zbf;
    }

    private final void zbc()
    {
        q1.d v0_0 = this.getSupportLoaderManager();
        IllegalArgumentException v1_4 = new com.google.android.gms.auth.api.signin.internal.zbw(this, 0);
        q1.d v0_7 = ((q1.f) v0_0);
        StringBuilder v3_0 = v0_7.a;
        q1.d v0_8 = v0_7.b;
        r.k v5 = v0_8.b;
        if (v0_8.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else {
            if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
                throw new IllegalStateException("initLoader must be called on the main thread");
            } else {
                q1.c v6_2 = ((q1.c) v5.b(0));
                if (v6_2 != null) {
                    q1.d v0_6 = new q1.d(v6_2.l, v1_4);
                    v6_2.d(v3_0, v0_6);
                    IllegalArgumentException v1_3 = v6_2.n;
                    if (v1_3 != null) {
                        v6_2.g(v1_3);
                    }
                    v6_2.m = v3_0;
                    v6_2.n = v0_6;
                } else {
                    v0_8.c = 1;
                    String v2_2 = v1_4.onCreateLoader(0, 0);
                    if (v2_2 == null) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } else {
                        if (v2_2.getClass().isMemberClass()) {
                            if (!reflect.Modifier.isStatic(v2_2.getClass().getModifiers())) {
                                StringBuilder v3_2 = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                                v3_2.append(v2_2);
                                throw new IllegalArgumentException(v3_2.toString());
                            } else {
                            }
                        }
                        q1.c v6_5 = new q1.c(v2_2);
                        v5.d(0, v6_5);
                        v0_8.c = 0;
                        q1.d v0_10 = new q1.d(v6_5.l, v1_4);
                        v6_5.d(v3_0, v0_10);
                        IllegalArgumentException v1_10 = v6_5.n;
                        if (v1_10 != null) {
                            v6_5.g(v1_10);
                        }
                        v6_5.m = v3_0;
                        v6_5.n = v0_10;
                    }
                }
                com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = 0;
                return;
            }
        }
    }

    private final void zbd(int p3)
    {
        int v0_1 = new com.google.android.gms.common.api.Status(p3);
        android.content.Intent v3_2 = new android.content.Intent();
        v3_2.putExtra("googleSignInStatus", v0_1);
        this.setResult(0, v3_2);
        this.finish();
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = 0;
        return;
    }

    private final void zbe(String p3)
    {
        String v0_1 = new android.content.Intent(p3);
        if (!p3.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            v0_1.setPackage(this.getPackageName());
        } else {
            v0_1.setPackage("com.google.android.gms");
        }
        v0_1.putExtra("config", this.zbc);
        try {
            this.startActivityForResult(v0_1, 40962);
            return;
        } catch (android.content.ActivityNotFoundException) {
            this.zbb = 1;
            android.util.Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            this.zbd(17);
            return;
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p1)
    {
        return 1;
    }

    public final void onActivityResult(int p4, int p5, android.content.Intent p6)
    {
        if (!this.zbb) {
            this.setResult(0);
            if (p4 == 40962) {
                if (p6 != null) {
                    com.google.android.gms.auth.api.signin.internal.zbn v1_1 = ((com.google.android.gms.auth.api.signin.SignInAccount) p6.getParcelableExtra("signInAccount"));
                    if ((v1_1 == null) || (v1_1.zba() == null)) {
                        if (p6.hasExtra("errorCode")) {
                            int v4_1 = p6.getIntExtra("errorCode", 8);
                            if (v4_1 == 13) {
                                v4_1 = 12501;
                            }
                            this.zbd(v4_1);
                            return;
                        }
                    } else {
                        int v4_2 = v1_1.zba();
                        com.google.android.gms.auth.api.signin.internal.zbn v1_2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(this);
                        com.google.android.gms.auth.api.signin.GoogleSignInOptions v2_2 = this.zbc.zba();
                        v4_2.getClass();
                        v1_2.zbe(v2_2, v4_2);
                        p6.removeExtra("signInAccount");
                        p6.putExtra("googleSignInAccount", v4_2);
                        this.zbd = 1;
                        this.zbe = p5;
                        this.zbf = p6;
                        this.zbc();
                        return;
                    }
                }
                this.zbd(8);
                return;
            }
        }
        return;
    }

    public final void onCreate(android.os.Bundle p5)
    {
        super.onCreate(p5);
        String v0_0 = this.getIntent();
        String v1 = v0_0.getAction();
        v1.getClass();
        if (!"com.google.android.gms.auth.NO_IMPL".equals(v1)) {
            if ((!v1.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) && (!v1.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN"))) {
                android.util.Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(v0_0.getAction())));
                this.finish();
                return;
            } else {
                String v0_2 = v0_0.getBundleExtra("config");
                v0_2.getClass();
                String v0_4 = ((com.google.android.gms.auth.api.signin.internal.SignInConfiguration) v0_2.getParcelable("config"));
                if (v0_4 != null) {
                    this.zbc = v0_4;
                    if (p5 != null) {
                        String v0_6 = p5.getBoolean("signingInGoogleApiClients");
                        this.zbd = v0_6;
                        if (v0_6 != null) {
                            this.zbe = p5.getInt("signInResultCode");
                            android.content.Intent v5_5 = ((android.content.Intent) p5.getParcelable("signInResultData"));
                            v5_5.getClass();
                            this.zbf = v5_5;
                            this.zbc();
                        }
                        return;
                    } else {
                        if (!com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba) {
                            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = 1;
                            this.zbe(v1);
                            return;
                        } else {
                            this.setResult(0);
                            this.zbd(12502);
                            return;
                        }
                    }
                } else {
                    android.util.Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    this.setResult(0);
                    this.finish();
                    return;
                }
            }
        } else {
            this.zbd(12500);
            return;
        }
    }

    public final void onDestroy()
    {
        super.onDestroy();
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = 0;
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        super.onSaveInstanceState(p3);
        p3.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            p3.putInt("signInResultCode", this.zbe);
            p3.putParcelable("signInResultData", this.zbf);
        }
        return;
    }
}
