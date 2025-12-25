package com.google.android.gms.common.internal;
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator {
    private static final com.google.android.gms.common.internal.zaz zaa;

    static zaz()
    {
        com.google.android.gms.common.internal.zaz.zaa = new com.google.android.gms.common.internal.zaz();
        return;
    }

    private zaz()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
        return;
    }

    public static android.view.View zaa(android.content.Context p4, int p5, int p6)
    {
        try {
            return ((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.common.internal.zam) com.google.android.gms.common.internal.zaz.zaa.getRemoteCreatorInstance(p4)).zae(com.google.android.gms.dynamic.ObjectWrapper.wrap(p4), new com.google.android.gms.common.internal.zax(1, p5, p6, 0))));
        } catch (Exception v4_4) {
            throw new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException(v1.a.i("Could not get button with size ", p5, p6, " and color "), v4_4);
        }
    }

    public final synthetic Object getRemoteCreator(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.common.internal.zam v0_1 = p3.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.zam)) {
                return new com.google.android.gms.common.internal.zam(p3);
            } else {
                return ((com.google.android.gms.common.internal.zam) v0_1);
            }
        } else {
            return 0;
        }
    }
}
