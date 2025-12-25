package com.google.android.play.core.integrity;
public final synthetic class bd implements k4.c0 {
    public static final synthetic com.google.android.play.core.integrity.bd a;

    static synthetic bd()
    {
        com.google.android.play.core.integrity.bd.a = new com.google.android.play.core.integrity.bd();
        return;
    }

    private synthetic bd()
    {
        return;
    }

    public final Object a(android.os.IBinder p4)
    {
        if (p4 != 0) {
            k4.n v1_1 = p4.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            if (!(v1_1 instanceof k4.p)) {
                return new k4.n(p4, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            } else {
                return ((k4.p) v1_1);
            }
        } else {
            return 0;
        }
    }
}
