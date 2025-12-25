package w5;
public final class a implements w5.e {
    public final int a;

    public a(int p1)
    {
        this.a = p1;
        return;
    }

    public final Class annotationType()
    {
        return w5.e;
    }

    public final boolean equals(Object p2)
    {
        if ((this != p2) && ((!(p2 instanceof w5.e)) || ((this.a != ((w5.a) ((w5.e) p2)).a) || (!w5.d.a.equals(w5.d.a))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return ((14552422 ^ this.a) + (w5.d.a.hashCode() ^ 2041407134));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
        v0_2.append(this.a);
        v0_2.append("intEncoding=");
        v0_2.append(w5.d.a);
        v0_2.append(41);
        return v0_2.toString();
    }
}
