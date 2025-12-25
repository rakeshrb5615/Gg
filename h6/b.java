package h6;
public final class b {
    public String a;

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof h6.b)) {
            return com.google.android.gms.common.internal.Objects.equal(this.a, ((h6.b) p2).a);
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.a}));
    }

    public final String toString()
    {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("token", this.a).toString();
    }
}
