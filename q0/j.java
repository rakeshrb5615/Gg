package q0;
public final class j {
    public final android.view.DisplayCutout a;

    public j(android.view.DisplayCutout p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3) && (q0.j == p3.getClass())) {
                return java.util.Objects.equals(this.a, ((q0.j) p3).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.hashCode();
        } else {
            return 0;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("DisplayCutoutCompat{");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
