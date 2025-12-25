package y6;
public final class k extends java.lang.Number {
    public final String a;

    public k(String p1)
    {
        this.a = p1;
        return;
    }

    public final double doubleValue()
    {
        return Double.parseDouble(this.a);
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if (!(p2 instanceof y6.k)) {
                return 0;
            } else {
                return this.a.equals(((y6.k) p2).a);
            }
        } else {
            return 1;
        }
    }

    public final float floatValue()
    {
        return Float.parseFloat(this.a);
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final int intValue()
    {
        int v0_2 = Integer.parseInt(this.a);
        return v0_2;
    }

    public final long longValue()
    {
        try {
            long v0_1 = Long.parseLong(this.a);
            return v0_1;
        } catch (NumberFormatException) {
            return y6.i.i(v0_1).longValue();
        }
    }

    public final String toString()
    {
        return this.a;
    }
}
