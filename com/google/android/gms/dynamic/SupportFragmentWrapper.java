package com.google.android.gms.dynamic;
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper$Stub {
    private final androidx.fragment.app.e0 zza;

    private SupportFragmentWrapper(androidx.fragment.app.e0 p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(androidx.fragment.app.e0 p1)
    {
        if (p1 == 0) {
            return 0;
        } else {
            return new com.google.android.gms.dynamic.SupportFragmentWrapper(p1);
        }
    }

    public final void zzA(com.google.android.gms.dynamic.IObjectWrapper p2)
    {
        android.view.View v2_2 = ((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p2));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_2);
        this.zza.unregisterForContextMenu(v2_2);
        return;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzb()
    {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getActivity());
    }

    public final android.os.Bundle zzc()
    {
        return this.zza.getArguments();
    }

    public final int zzd()
    {
        return this.zza.getId();
    }

    public final com.google.android.gms.dynamic.IFragmentWrapper zze()
    {
        return com.google.android.gms.dynamic.SupportFragmentWrapper.wrap(this.zza.getParentFragment());
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzf()
    {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getResources());
    }

    public final boolean zzg()
    {
        return this.zza.getRetainInstance();
    }

    public final String zzh()
    {
        return this.zza.getTag();
    }

    public final com.google.android.gms.dynamic.IFragmentWrapper zzi()
    {
        return com.google.android.gms.dynamic.SupportFragmentWrapper.wrap(this.zza.getTargetFragment());
    }

    public final int zzj()
    {
        return this.zza.getTargetRequestCode();
    }

    public final boolean zzk()
    {
        return this.zza.getUserVisibleHint();
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzl()
    {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    public final boolean zzm()
    {
        return this.zza.isAdded();
    }

    public final boolean zzn()
    {
        return this.zza.isDetached();
    }

    public final boolean zzo()
    {
        return this.zza.isHidden();
    }

    public final boolean zzp()
    {
        return this.zza.isInLayout();
    }

    public final boolean zzq()
    {
        return this.zza.isRemoving();
    }

    public final boolean zzr()
    {
        return this.zza.isResumed();
    }

    public final boolean zzs()
    {
        return this.zza.isVisible();
    }

    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper p2)
    {
        android.view.View v2_2 = ((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p2));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_2);
        this.zza.registerForContextMenu(v2_2);
        return;
    }

    public final void zzu(boolean p2)
    {
        this.zza.setHasOptionsMenu(p2);
        return;
    }

    public final void zzv(boolean p2)
    {
        this.zza.setMenuVisibility(p2);
        return;
    }

    public final void zzw(boolean p2)
    {
        this.zza.setRetainInstance(p2);
        return;
    }

    public final void zzx(boolean p2)
    {
        this.zza.setUserVisibleHint(p2);
        return;
    }

    public final void zzy(android.content.Intent p2)
    {
        this.zza.startActivity(p2);
        return;
    }

    public final void zzz(android.content.Intent p2, int p3)
    {
        this.zza.startActivityForResult(p2, p3);
        return;
    }
}
