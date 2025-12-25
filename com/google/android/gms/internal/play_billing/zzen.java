package com.google.android.gms.internal.play_billing;
public final class zzen extends java.io.IOException {

    public zzen()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        return;
    }

    public zzen(long p3, long p5, int p7, Throwable p8)
    {
        StringBuilder v0_1 = new StringBuilder("Pos: ");
        v0_1.append(p3);
        v0_1.append(", limit: ");
        v0_1.append(p5);
        v0_1.append(", len: ");
        v0_1.append(p7);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(v0_1.toString()), p8);
        return;
    }

    public zzen(Throwable p2)
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", p2);
        return;
    }
}
