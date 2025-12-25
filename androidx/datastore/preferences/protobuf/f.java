package androidx.datastore.preferences.protobuf;
public final class f extends androidx.datastore.preferences.protobuf.g {
    public final int e;
    public final int f;

    public f(byte[] p2, int p3, int p4)
    {
        super(p2);
        androidx.datastore.preferences.protobuf.g.b(p3, (p3 + p4), p2.length);
        super.e = p3;
        super.f = p4;
        return;
    }

    public final byte a(int p5)
    {
        String v1_0 = this.f;
        if (((v1_0 - (p5 + 1)) | p5) >= 0) {
            return this.b[(this.e + p5)];
        } else {
            if (p5 >= null) {
                throw new ArrayIndexOutOfBoundsException(v1.a.i("Index > length: ", p5, v1_0, ", "));
            } else {
                throw new ArrayIndexOutOfBoundsException(g2.g.c(p5, "Index < 0: "));
            }
        }
    }

    public final void d(int p4, byte[] p5)
    {
        System.arraycopy(this.b, this.e, p5, 0, p4);
        return;
    }

    public final int e()
    {
        return this.e;
    }

    public final byte f(int p2)
    {
        return this.b[(this.e + p2)];
    }

    public final int size()
    {
        return this.f;
    }
}
