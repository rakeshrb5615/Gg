package com.google.android.gms.internal.firebase-auth-api;
public final class zzakn$zzd extends java.io.IOException {

    public zzakn$zzd()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        return;
    }

    public zzakn$zzd(int p8, int p9, int p10, Throwable p11)
    {
        this(((long) p8), ((long) p9), p10, p11);
        return;
    }

    private zzakn$zzd(long p3, long p5, int p7, Throwable p8)
    {
        StringBuilder v0_1 = new StringBuilder("Pos: ");
        v0_1.append(p3);
        v0_1.append(", limit: ");
        v0_1.append(p5);
        v0_1.append(", len: ");
        v0_1.append(p7);
        this(v0_1.toString(), p8);
        return;
    }

    private zzakn$zzd(String p2, Throwable p3)
    {
        super(g2.g.l("CodedOutputStream was writing to a flat byte array and ran out of space.: ", p2), p3);
        return;
    }

    public zzakn$zzd(Throwable p2)
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", p2);
        return;
    }
}
