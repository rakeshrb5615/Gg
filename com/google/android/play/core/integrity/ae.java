package com.google.android.play.core.integrity;
public final synthetic class ae implements k4.c0 {
    public static final synthetic com.google.android.play.core.integrity.ae a;

    static synthetic ae()
    {
        com.google.android.play.core.integrity.ae.a = new com.google.android.play.core.integrity.ae();
        return;
    }

    private synthetic ae()
    {
        return;
    }

    public final Object a(android.os.IBinder p4)
    {
        if (p4 != 0) {
            k4.s v1_1 = p4.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            if (!(v1_1 instanceof k4.u)) {
                return new k4.s(p4, "com.google.android.play.core.integrity.protocol.IIntegrityService");
            } else {
                return ((k4.u) v1_1);
            }
        } else {
            return 0;
        }
    }
}
