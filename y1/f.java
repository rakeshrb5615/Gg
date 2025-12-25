package y1;
public final class f {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public f(int p1, int p2, long p3, long p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p5;
        return;
    }

    public static y1.f a(java.io.File p9)
    {
        java.io.DataInputStream v1_1 = new java.io.DataInputStream(new java.io.FileInputStream(p9));
        try {
            y1.f v2_0 = new y1.f(v1_1.readInt(), v1_1.readInt(), v1_1.readLong(), v1_1.readLong());
            v1_1.close();
            return v2_0;
        } catch (Throwable v0_1) {
            Throwable v9_1 = v0_1;
            try {
                v1_1.close();
            } catch (Throwable v0_2) {
                v9_1.addSuppressed(v0_2);
            }
            throw v9_1;
        }
    }

    public final void b(java.io.File p4)
    {
        p4.delete();
        Throwable v0_2 = new java.io.DataOutputStream(new java.io.FileOutputStream(p4));
        try {
            v0_2.writeInt(this.a);
            v0_2.writeInt(this.b);
            v0_2.writeLong(this.c);
            v0_2.writeLong(this.d);
            v0_2.close();
            return;
        } catch (Throwable v4_1) {
            try {
                v0_2.close();
            } catch (Throwable v0_1) {
                v4_1.addSuppressed(v0_1);
            }
            throw v4_1;
        }
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 == 0) || ((!(p7 instanceof y1.f)) || ((this.b != ((y1.f) p7).b) || ((this.c != ((y1.f) p7).c) || ((this.a != ((y1.f) p7).a) || (this.d != ((y1.f) p7).d)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d)}));
    }
}
