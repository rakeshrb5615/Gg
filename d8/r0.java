package d8;
public final class r0 implements d8.b1 {
    public final boolean a;

    public r0(boolean p1)
    {
        this.a = p1;
        return;
    }

    public final d8.s1 c()
    {
        return 0;
    }

    public final boolean isActive()
    {
        return this.a;
    }

    public final String toString()
    {
        int v1_2;
        String v0_2 = new StringBuilder("Empty{");
        if (!this.a) {
            v1_2 = "New";
        } else {
            v1_2 = "Active";
        }
        v0_2.append(v1_2);
        v0_2.append(125);
        return v0_2.toString();
    }
}
