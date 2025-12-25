package com.google.android.gms.common.api.internal;
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment p2)
    {
        super(p2, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        super.zad = new android.util.SparseArray();
        super.mLifecycleFragment.addCallback("AutoManageHelper", super);
        return;
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity p2)
    {
        com.google.android.gms.common.api.internal.LifecycleFragment v2_1 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(p2);
        com.google.android.gms.common.api.internal.zak v0_2 = ((com.google.android.gms.common.api.internal.zak) v2_1.getCallbackOrNull("AutoManageHelper", com.google.android.gms.common.api.internal.zak));
        if (v0_2 == null) {
            return new com.google.android.gms.common.api.internal.zak(v2_1);
        } else {
            return v0_2;
        }
    }

    private final com.google.android.gms.common.api.internal.zaj zai(int p2)
    {
        if (this.zad.size() > p2) {
            android.util.SparseArray v0_2 = this.zad;
            return ((com.google.android.gms.common.api.internal.zaj) v0_2.get(v0_2.keyAt(p2)));
        } else {
            return 0;
        }
    }

    public final void dump(String p5, java.io.FileDescriptor p6, java.io.PrintWriter p7, String[] p8)
    {
        int v0 = 0;
        while (v0 < this.zad.size()) {
            com.google.android.gms.common.api.GoogleApiClient v1_3 = this.zai(v0);
            if (v1_3 != null) {
                p7.append(p5).append("GoogleApiClient #").print(v1_3.zaa);
                p7.println(":");
                v1_3.zab.dump(String.valueOf(p5).concat("  "), p6, p7, p8);
            }
            v0++;
        }
        return;
    }

    public final void onStart()
    {
        super.onStart();
        com.google.android.gms.common.api.GoogleApiClient v1_1 = this.zaa;
        int v0_5 = String.valueOf(this.zad);
        StringBuilder v2_1 = new StringBuilder("onStart ");
        v2_1.append(v1_1);
        v2_1.append(" ");
        v2_1.append(v0_5);
        android.util.Log.d("AutoManageHelper", v2_1.toString());
        if (this.zab.get() == null) {
            int v0_4 = 0;
            while (v0_4 < this.zad.size()) {
                com.google.android.gms.common.api.GoogleApiClient v1_4 = this.zai(v0_4);
                if (v1_4 != null) {
                    v1_4.zab.connect();
                }
                v0_4++;
            }
        }
        return;
    }

    public final void onStop()
    {
        super.onStop();
        int v0 = 0;
        while (v0 < this.zad.size()) {
            com.google.android.gms.common.api.GoogleApiClient v1_3 = this.zai(v0);
            if (v1_3 != null) {
                v1_3.zab.disconnect();
            }
            v0++;
        }
        return;
    }

    public final void zab(com.google.android.gms.common.ConnectionResult p3, int p4)
    {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (p4 >= null) {
            com.google.android.gms.common.api.internal.zaj v0_3 = ((com.google.android.gms.common.api.internal.zaj) this.zad.get(p4));
            if (v0_3 != null) {
                this.zae(p4);
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener v4_1 = v0_3.zac;
                if (v4_1 != null) {
                    v4_1.onConnectionFailed(p3);
                }
            }
            return;
        } else {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
    }

    public final void zac()
    {
        int v0 = 0;
        while (v0 < this.zad.size()) {
            com.google.android.gms.common.api.GoogleApiClient v1_2 = this.zai(v0);
            if (v1_2 != null) {
                v1_2.zab.connect();
            }
            v0++;
        }
        return;
    }

    public final void zad(int p6, com.google.android.gms.common.api.GoogleApiClient p7, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p8)
    {
        com.google.android.gms.common.api.internal.zam v0_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.api.internal.zam v0_6 = this.zad.indexOfKey(p6);
        String vtmp3 = g2.g.c(p6, "Already managing a GoogleApiClient with id ");
        if (v0_6 >= null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_1, vtmp3);
        com.google.android.gms.common.api.internal.zam v0_4 = ((com.google.android.gms.common.api.internal.zam) this.zab.get());
        com.google.android.gms.common.api.internal.zaj v1_0 = this.zaa;
        String v2_0 = String.valueOf(v0_4);
        StringBuilder v3_1 = new StringBuilder("starting AutoManage for client ");
        v3_1.append(p6);
        v3_1.append(" ");
        v3_1.append(v1_0);
        v3_1.append(" ");
        v3_1.append(v2_0);
        android.util.Log.d("AutoManageHelper", v3_1.toString());
        com.google.android.gms.common.api.internal.zaj v1_3 = new com.google.android.gms.common.api.internal.zaj(this, p6, p7, p8);
        p7.registerConnectionFailedListener(v1_3);
        this.zad.put(p6, v1_3);
        if ((this.zaa) && (v0_4 == null)) {
            android.util.Log.d("AutoManageHelper", "connecting ".concat(p7.toString()));
            p7.connect();
        }
        return;
    }

    public final void zae(int p3)
    {
        com.google.android.gms.common.api.internal.zaj v0_2 = ((com.google.android.gms.common.api.internal.zaj) this.zad.get(p3));
        this.zad.remove(p3);
        if (v0_2 != null) {
            v0_2.zab.unregisterConnectionFailedListener(v0_2);
            v0_2.zab.disconnect();
        }
        return;
    }
}
