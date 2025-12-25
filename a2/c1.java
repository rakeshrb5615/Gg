package a2;
public final class c1 implements android.os.Parcelable$ClassLoaderCreator {
    public final synthetic int a;

    public synthetic c1(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object createFromParcel(android.os.Parcel p3)
    {
        switch (this.a) {
            case 0:
                return new a2.d1(p3, 0);
            case 1:
                return new androidx.fragment.app.d0(p3, 0);
            case 2:
                return new b0.f(p3, 0);
            case 3:
                return new h3.d(p3, 0);
            case 4:
                return new i3.c(p3, 0);
            case 5:
                return new n.d3(p3, 0);
            case 6:
                return new q3.a(p3, 0);
            case 7:
                return new w3.d(p3, 0);
            case 8:
                if (p3.readParcelable(0) != null) {
                    throw new IllegalStateException("superState must be null");
                } else {
                    return x0.b.b;
                }
            default:
                return new z3.a0(p3, 0);
        }
    }

    public final Object createFromParcel(android.os.Parcel p2, ClassLoader p3)
    {
        switch (this.a) {
            case 0:
                return new a2.d1(p2, p3);
            case 1:
                return new androidx.fragment.app.d0(p2, p3);
            case 2:
                return new b0.f(p2, p3);
            case 3:
                return new h3.d(p2, p3);
            case 4:
                return new i3.c(p2, p3);
            case 5:
                return new n.d3(p2, p3);
            case 6:
                return new q3.a(p2, p3);
            case 7:
                return new w3.d(p2, p3);
            case 8:
                if (p2.readParcelable(p3) != null) {
                    throw new IllegalStateException("superState must be null");
                } else {
                    return x0.b.b;
                }
            default:
                return new z3.a0(p2, p3);
        }
    }

    public final Object[] newArray(int p2)
    {
        switch (this.a) {
            case 0:
                x0.b[] v2_5 = new a2.d1[p2];
                return v2_5;
            case 1:
                x0.b[] v2_4 = new androidx.fragment.app.d0[p2];
                return v2_4;
            case 2:
                x0.b[] v2_3 = new b0.f[p2];
                return v2_3;
            case 3:
                x0.b[] v2_2 = new h3.d[p2];
                return v2_2;
            case 4:
                x0.b[] v2_1 = new i3.c[p2];
                return v2_1;
            case 5:
                x0.b[] v2_10 = new n.d3[p2];
                return v2_10;
            case 6:
                x0.b[] v2_9 = new q3.a[p2];
                return v2_9;
            case 7:
                x0.b[] v2_8 = new w3.d[p2];
                return v2_8;
            case 8:
                x0.b[] v2_6 = new x0.b[p2];
                return v2_6;
            default:
                x0.b[] v2_7 = new z3.a0[p2];
                return v2_7;
        }
    }
}
