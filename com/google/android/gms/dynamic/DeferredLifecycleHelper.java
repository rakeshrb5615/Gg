package com.google.android.gms.dynamic;
public abstract class DeferredLifecycleHelper {
    private com.google.android.gms.dynamic.LifecycleDelegate zaa;
    private android.os.Bundle zab;
    private java.util.LinkedList zac;
    private final com.google.android.gms.dynamic.OnDelegateCreatedListener zad;

    public DeferredLifecycleHelper()
    {
        this.zad = new com.google.android.gms.dynamic.zaa(this);
        return;
    }

    public static void showGooglePlayUnavailableMessage(android.widget.FrameLayout p8)
    {
        android.widget.Button v0_0 = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        android.content.Context v1 = p8.getContext();
        com.google.android.gms.dynamic.zae v2_5 = v0_0.isGooglePlayServicesAvailable(v1);
        String v3 = com.google.android.gms.common.internal.zac.zac(v1, v2_5);
        String v4 = com.google.android.gms.common.internal.zac.zab(v1, v2_5);
        android.widget.LinearLayout v5_1 = new android.widget.LinearLayout(p8.getContext());
        v5_1.setOrientation(1);
        v5_1.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-2, -2));
        p8.addView(v5_1);
        android.widget.TextView v6_5 = new android.widget.TextView(p8.getContext());
        v6_5.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-2, -2));
        v6_5.setText(v3);
        v5_1.addView(v6_5);
        android.content.Intent v8_5 = v0_0.getErrorResolutionIntent(v1, v2_5, 0);
        if (v8_5 != null) {
            android.widget.Button v0_2 = new android.widget.Button(v1);
            v0_2.setId(16908313);
            v0_2.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-2, -2));
            v0_2.setText(v4);
            v5_1.addView(v0_2);
            v0_2.setOnClickListener(new com.google.android.gms.dynamic.zae(v1, v8_5));
        }
        return;
    }

    public static bridge synthetic com.google.android.gms.dynamic.LifecycleDelegate zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper p0)
    {
        return p0.zaa;
    }

    public static bridge synthetic java.util.LinkedList zab(com.google.android.gms.dynamic.DeferredLifecycleHelper p0)
    {
        return p0.zac;
    }

    public static bridge synthetic void zac(com.google.android.gms.dynamic.DeferredLifecycleHelper p0, com.google.android.gms.dynamic.LifecycleDelegate p1)
    {
        p0.zaa = p1;
        return;
    }

    public static bridge synthetic void zad(com.google.android.gms.dynamic.DeferredLifecycleHelper p0, android.os.Bundle p1)
    {
        p0.zab = 0;
        return;
    }

    private final void zae(int p2)
    {
        while ((!this.zac.isEmpty()) && (((com.google.android.gms.dynamic.zah) this.zac.getLast()).zaa() >= p2)) {
            this.zac.removeLast();
        }
        return;
    }

    private final void zaf(android.os.Bundle p2, com.google.android.gms.dynamic.zah p3)
    {
        java.util.LinkedList v0_0 = this.zaa;
        if (v0_0 == null) {
            if (this.zac == null) {
                this.zac = new java.util.LinkedList();
            }
            this.zac.add(p3);
            if (p2 != null) {
                android.os.Bundle v3_1 = this.zab;
                if (v3_1 != null) {
                    v3_1.putAll(p2);
                } else {
                    this.zab = ((android.os.Bundle) p2.clone());
                }
            }
            this.createDelegate(this.zad);
            return;
        } else {
            p3.zab(v0_0);
            return;
        }
    }

    public abstract void createDelegate();

    public com.google.android.gms.dynamic.LifecycleDelegate getDelegate()
    {
        return this.zaa;
    }

    public void handleGooglePlayUnavailable(android.widget.FrameLayout p1)
    {
        com.google.android.gms.dynamic.DeferredLifecycleHelper.showGooglePlayUnavailableMessage(p1);
        return;
    }

    public void onCreate(android.os.Bundle p2)
    {
        this.zaf(p2, new com.google.android.gms.dynamic.zac(this, p2));
        return;
    }

    public android.view.View onCreateView(android.view.LayoutInflater p7, android.view.ViewGroup p8, android.os.Bundle p9)
    {
        android.widget.FrameLayout v2_1 = new android.widget.FrameLayout(p7.getContext());
        this.zaf(p9, new com.google.android.gms.dynamic.zad(this, v2_1, p7, p8, p9));
        if (this.zaa == null) {
            this.handleGooglePlayUnavailable(v2_1);
        }
        return v2_1;
    }

    public void onDestroy()
    {
        int v0_0 = this.zaa;
        if (v0_0 == 0) {
            this.zae(1);
            return;
        } else {
            v0_0.onDestroy();
            return;
        }
    }

    public void onDestroyView()
    {
        int v0_0 = this.zaa;
        if (v0_0 == 0) {
            this.zae(2);
            return;
        } else {
            v0_0.onDestroyView();
            return;
        }
    }

    public void onInflate(android.app.Activity p2, android.os.Bundle p3, android.os.Bundle p4)
    {
        this.zaf(p4, new com.google.android.gms.dynamic.zab(this, p2, p3, p4));
        return;
    }

    public void onLowMemory()
    {
        com.google.android.gms.dynamic.LifecycleDelegate v0 = this.zaa;
        if (v0 != null) {
            v0.onLowMemory();
        }
        return;
    }

    public void onPause()
    {
        int v0_0 = this.zaa;
        if (v0_0 == 0) {
            this.zae(5);
            return;
        } else {
            v0_0.onPause();
            return;
        }
    }

    public void onResume()
    {
        this.zaf(0, new com.google.android.gms.dynamic.zag(this));
        return;
    }

    public void onSaveInstanceState(android.os.Bundle p2)
    {
        android.os.Bundle v0_0 = this.zaa;
        if (v0_0 == null) {
            android.os.Bundle v0_1 = this.zab;
            if (v0_1 != null) {
                p2.putAll(v0_1);
            }
            return;
        } else {
            v0_0.onSaveInstanceState(p2);
            return;
        }
    }

    public void onStart()
    {
        this.zaf(0, new com.google.android.gms.dynamic.zaf(this));
        return;
    }

    public void onStop()
    {
        int v0_0 = this.zaa;
        if (v0_0 == 0) {
            this.zae(4);
            return;
        } else {
            v0_0.onStop();
            return;
        }
    }
}
