package com.google.android.gms.common.api.internal;
public final class zza extends android.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza;
    private final com.google.android.gms.common.api.internal.zzc zzb;

    static zza()
    {
        com.google.android.gms.common.api.internal.zza.zza = new java.util.WeakHashMap();
        return;
    }

    public zza()
    {
        this.zzb = new com.google.android.gms.common.api.internal.zzc();
        return;
    }

    public static com.google.android.gms.common.api.internal.zza zza(android.app.Activity p4)
    {
        String v1_0 = com.google.android.gms.common.api.internal.zza.zza;
        com.google.android.gms.common.api.internal.zza v2_5 = ((ref.WeakReference) v1_0.get(p4));
        if (v2_5 != null) {
            com.google.android.gms.common.api.internal.zza v2_7 = ((com.google.android.gms.common.api.internal.zza) v2_5.get());
            if (v2_7 != null) {
                return v2_7;
            }
        }
        try {
            com.google.android.gms.common.api.internal.zza v2_2 = ((com.google.android.gms.common.api.internal.zza) p4.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl"));
        } catch (ClassCastException v4_1) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", v4_1);
        }
        if ((v2_2 == null) || (v2_2.isRemoving())) {
            v2_2 = new com.google.android.gms.common.api.internal.zza();
            p4.getFragmentManager().beginTransaction().add(v2_2, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        v1_0.put(p4, new ref.WeakReference(v2_2));
        return v2_2;
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
        super.onSaveInstanceState(p2);
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
