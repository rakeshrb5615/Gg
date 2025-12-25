package com.google.android.gms.common.api.internal;
public class LifecycleCallback {
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment p1)
    {
        this.mLifecycleFragment = p1;
        return;
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity p1)
    {
        return com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(new com.google.android.gms.common.api.internal.LifecycleActivity(p1));
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper p0)
    {
        throw new UnsupportedOperationException();
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity p1)
    {
        if (!p1.zza()) {
            if (!p1.zzb()) {
                throw new IllegalArgumentException("Can\'t get fragment for unexpected activity.");
            } else {
                return com.google.android.gms.common.api.internal.zza.zza(p1.zzc());
            }
        } else {
            return com.google.android.gms.common.api.internal.zzd.zza(p1.zzd());
        }
    }

    public void dump(String p1, java.io.FileDescriptor p2, java.io.PrintWriter p3, String[] p4)
    {
        return;
    }

    public android.app.Activity getActivity()
    {
        android.app.Activity v0_1 = this.mLifecycleFragment.getLifecycleActivity();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        return v0_1;
    }

    public void onActivityResult(int p1, int p2, android.content.Intent p3)
    {
        return;
    }

    public void onCreate(android.os.Bundle p1)
    {
        return;
    }

    public void onDestroy()
    {
        return;
    }

    public void onResume()
    {
        return;
    }

    public void onSaveInstanceState(android.os.Bundle p1)
    {
        return;
    }

    public void onStart()
    {
        return;
    }

    public void onStop()
    {
        return;
    }
}
