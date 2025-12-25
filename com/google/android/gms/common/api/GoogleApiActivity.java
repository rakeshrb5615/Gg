package com.google.android.gms.common.api;
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface$OnCancelListener {
    protected int zaa;

    public GoogleApiActivity()
    {
        this.zaa = 0;
        return;
    }

    public static android.content.Intent zaa(android.content.Context p2, android.app.PendingIntent p3, int p4, boolean p5)
    {
        android.content.Intent v0_1 = new android.content.Intent(p2, com.google.android.gms.common.api.GoogleApiActivity);
        v0_1.putExtra("pending_intent", p3);
        v0_1.putExtra("failing_client_id", p4);
        v0_1.putExtra("notify_manager", p5);
        return v0_1;
    }

    private final void zab()
    {
        String v1_0 = this.getIntent().getExtras();
        if (v1_0 != null) {
            String v3_0 = ((android.app.PendingIntent) v1_0.get("pending_intent"));
            com.google.android.gms.common.api.internal.GoogleApiManager v0_3 = ((Integer) v1_0.get("error_code"));
            if ((v3_0 == null) && (v0_3 == null)) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                this.finish();
                return;
            } else {
                if (v3_0 == null) {
                    com.google.android.gms.common.GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3)).intValue(), 2, this);
                    this.zaa = 1;
                    return;
                } else {
                    try {
                        com.google.android.gms.common.api.GoogleApiActivity v5_1 = this;
                        try {
                            this.startIntentSenderForResult(v3_0.getIntentSender(), 1, 0, 0, 0, 0);
                            this.zaa = 1;
                            return;
                        } catch (com.google.android.gms.common.api.internal.GoogleApiManager v0_9) {
                            if (!v1_0.getBoolean("notify_manager", 1)) {
                                String v1_5 = v1.a.l("Activity not found while launching ", v3_0.toString(), ".");
                                if (android.os.Build.FINGERPRINT.contains("generic")) {
                                    v1_5 = v1_5.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                                }
                                android.util.Log.e("GoogleApiActivity", v1_5, v0_9);
                            } else {
                                com.google.android.gms.common.api.internal.GoogleApiManager.zak(this).zax(new com.google.android.gms.common.ConnectionResult(22, 0), this.getIntent().getIntExtra("failing_client_id", -1));
                            }
                            v5_1.zaa = 1;
                            this.finish();
                            return;
                        } catch (com.google.android.gms.common.api.internal.GoogleApiManager v0_8) {
                            android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", v0_8);
                            this.finish();
                            return;
                        }
                    } catch (com.google.android.gms.common.api.internal.GoogleApiManager v0_9) {
                        v5_1 = this;
                    } catch (com.google.android.gms.common.api.internal.GoogleApiManager v0_8) {
                        android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", v0_8);
                        this.finish();
                        return;
                    }
                    this.startIntentSenderForResult(v3_0.getIntentSender(), 1, 0, 0, 0, 0);
                    this.zaa = 1;
                    return;
                }
            }
        } else {
            android.util.Log.e("GoogleApiActivity", "Activity started without extras");
            this.finish();
            return;
        }
    }

    public final void onActivityResult(int p4, int p5, android.content.Intent p6)
    {
        super.onActivityResult(p4, p5, p6);
        if (p4 != 1) {
            if (p4 == 2) {
                this.zaa = 0;
                this.setResult(p5, p6);
            }
        } else {
            com.google.android.gms.common.api.internal.GoogleApiManager v4_1 = this.getIntent().getBooleanExtra("notify_manager", 1);
            this.zaa = 0;
            this.setResult(p5, p6);
            if (v4_1 != null) {
                com.google.android.gms.common.api.internal.GoogleApiManager v4_2 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(this);
                if (p5 == -1) {
                    v4_2.zay();
                } else {
                    if (p5 == null) {
                        v4_2.zax(new com.google.android.gms.common.ConnectionResult(13, 0), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
            }
        }
        this.finish();
        return;
    }

    public final void onCancel(android.content.DialogInterface p1)
    {
        this.zaa = 0;
        this.setResult(0);
        this.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p2)
    {
        super.onCreate(p2);
        if (p2 != 0) {
            this.zaa = p2.getInt("resolution");
        }
        if (this.zaa != 1) {
            this.zab();
        }
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        p3.putInt("resolution", this.zaa);
        super.onSaveInstanceState(p3);
        return;
    }
}
