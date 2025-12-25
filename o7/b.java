package o7;
public final class b extends i7.d implements o7.a, java.io.Serializable {
    public final Enum[] a;

    public b(Enum[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "entries");
        this.a = p2;
        return;
    }

    public final int b()
    {
        return this.a.length;
    }

    public final boolean contains(Object p4)
    {
        if ((p4 instanceof Enum)) {
            if (((Enum) i7.h.f0(((Enum) p4).ordinal(), this.a)) != ((Enum) p4)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final Object get(int p5)
    {
        IndexOutOfBoundsException v0_0 = this.a;
        int v1 = v0_0.length;
        if ((p5 < null) || (p5 >= v1)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v1, ", size: "));
        } else {
            return v0_0[p5];
        }
    }

    public final int indexOf(Object p4)
    {
        if ((p4 instanceof Enum)) {
            int v0_1 = ((Enum) p4).ordinal();
            if (((Enum) i7.h.f0(v0_1, this.a)) != ((Enum) p4)) {
                return -1;
            } else {
                return v0_1;
            }
        } else {
            return -1;
        }
    }

    public final int lastIndexOf(Object p4)
    {
        if ((p4 instanceof Enum)) {
            int v0_1 = ((Enum) p4).ordinal();
            if (((Enum) i7.h.f0(v0_1, this.a)) != ((Enum) p4)) {
                return -1;
            } else {
                return v0_1;
            }
        } else {
            return -1;
        }
    }
}
