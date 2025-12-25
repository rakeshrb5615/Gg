package com.google.android.gms.common.api.internal;
public final class zzd extends androidx.fragment.app.e0 implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza;
    private final com.google.android.gms.common.api.internal.zzc zzb;

    static zzd()
    {
        com.google.android.gms.common.api.internal.zzd.zza = new java.util.WeakHashMap();
        return;
    }

    public zzd()
    {
        this.zzb = new com.google.android.gms.common.api.internal.zzc();
        return;
    }

    public static com.google.android.gms.common.api.internal.zzd zza(androidx.fragment.app.j0 p6)
    {
        int v1_1 = p6.getSupportFragmentManager();
        java.util.WeakHashMap v2 = com.google.android.gms.common.api.internal.zzd.zza;
        com.google.android.gms.common.api.internal.zzd v3_5 = ((ref.WeakReference) v2.get(p6));
        if (v3_5 != null) {
            com.google.android.gms.common.api.internal.zzd v3_0 = ((com.google.android.gms.common.api.internal.zzd) v3_5.get());
            if (v3_0 != null) {
                return v3_0;
            }
        }
        try {
            com.google.android.gms.common.api.internal.zzd v3_2 = ((com.google.android.gms.common.api.internal.zzd) v1_1.B("SLifecycleFragmentImpl"));
        } catch (ClassCastException v6_1) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", v6_1);
        }
        if ((v3_2 == null) || (v3_2.isRemoving())) {
            v3_2 = new com.google.android.gms.common.api.internal.zzd();
            androidx.fragment.app.a v4_2 = new androidx.fragment.app.a(v1_1);
            v4_2.c(0, v3_2, "SLifecycleFragmentImpl", 1);
            v4_2.e(1);
        }
        v2.put(p6, new ref.WeakReference(v3_2));
        return v3_2;
    }

    public final void addCallback(String p2, com.google.android.gms.common.api.internal.LifecycleCallback p3)
    {
        this.zzb.zzb(p2, p3);
        return;
    }

    public final void dump(String p2, java.io.FileDescriptor p3, java.io.PrintWriter p4, String[] p5)
    {
        super.dump(p2, p3, p4, p5);
        this.zzb.zzl(p2, p3, p4, p5);
        return;
    }

    public final com.google.android.gms.common.api.internal.LifecycleCallback getCallbackOrNull(String p2, Class p3)
    {
        return this.zzb.zza(p2, p3);
    }

    public final android.app.Activity getLifecycleActivity()
    {
        return this.getActivity();
    }

    public final boolean isCreated()
    {
        return this.zzb.zzc();
    }

    public final boolean isStarted()
    {
        return this.zzb.zzd();
    }

    public final void onActivityResult(int p2, int p3, android.content.Intent p4)
    {
        super.onActivityResult(p2, p3, p4);
        this.zzb.zzh(p2, p3, p4);
        return;
    }

    public final void onCreate(android.os.Bundle p2)
    {
        super.onCreate(p2);
        this.zzb.zze(p2);
        return;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        this.zzb.zzk();
        return;
    }

    public final void onResume()
    {
        super.onResume();
        this.zzb.zzg();
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p2)
    {
        this.zzb.zzi(p2);
        return;
    }

    public final void onStart()
    {
        super.onStart();
        this.zzb.zzf();
        return;
    }

    public final void onStop()
    {
        super.onStop();
        this.zzb.zzj();
        return;
    }
}
