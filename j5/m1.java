package j5;
public final class m1 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public m1(int p4, int p5, long p6, long p8, boolean p10, int p11)
    {
        this.a = p4;
        if (android.os.Build.MODEL == null) {
            throw new NullPointerException("Null model");
        } else {
            this.b = p5;
            this.c = p6;
            this.d = p8;
            this.e = p10;
            this.f = p11;
            if (android.os.Build.MANUFACTURER == null) {
                throw new NullPointerException("Null manufacturer");
            } else {
                if (android.os.Build.PRODUCT == null) {
                    throw new NullPointerException("Null modelClass");
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object p5)
    {
        if ((p5 != this) && ((!(p5 instanceof j5.m1)) || ((this.a != ((j5.m1) p5).a) || ((!android.os.Build.MODEL.equals(android.os.Build.MODEL)) || ((this.b != ((j5.m1) p5).b) || ((this.c != ((j5.m1) p5).c) || ((this.d != ((j5.m1) p5).d) || ((this.e != ((j5.m1) p5).e) || ((this.f != ((j5.m1) p5).f) || ((!android.os.Build.MANUFACTURER.equals(android.os.Build.MANUFACTURER)) || (!android.os.Build.PRODUCT.equals(android.os.Build.PRODUCT)))))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_7;
        int v1_0 = 1000003;
        int v2_0 = this.c;
        int v0_3 = (((((((this.a ^ 1000003) * 1000003) ^ android.os.Build.MODEL.hashCode()) * v1_0) ^ this.b) * v1_0) ^ ((int) (v2_0 ^ (v2_0 >> 32))));
        int v2_3 = this.d;
        if (!this.e) {
            v2_7 = 1237;
        } else {
            v2_7 = 1231;
        }
        return ((((((((((v0_3 * v1_0) ^ ((int) (v2_3 ^ (v2_3 >> 32)))) * 1000003) ^ v2_7) * 1000003) ^ this.f) * 1000003) ^ android.os.Build.MANUFACTURER.hashCode()) * 1000003) ^ android.os.Build.PRODUCT.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("DeviceData{arch=");
        v0_1.append(this.a);
        v0_1.append(", model=");
        v0_1.append(android.os.Build.MODEL);
        v0_1.append(", availableProcessors=");
        v0_1.append(this.b);
        v0_1.append(", totalRam=");
        v0_1.append(this.c);
        v0_1.append(", diskSpace=");
        v0_1.append(this.d);
        v0_1.append(", isEmulator=");
        v0_1.append(this.e);
        v0_1.append(", state=");
        v0_1.append(this.f);
        v0_1.append(", manufacturer=");
        v0_1.append(android.os.Build.MANUFACTURER);
        v0_1.append(", modelClass=");
        return v1.a.n(v0_1, android.os.Build.PRODUCT, "}");
    }
}
