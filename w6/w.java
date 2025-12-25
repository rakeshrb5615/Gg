package w6;
public final enum class w extends w6.x {

    public w()
    {
        super("BIG_DECIMAL", 3);
        return;
    }

    public final Number a(e7.a p6)
    {
        StringBuilder v0_0 = p6.M();
        try {
            String v6_3 = y6.i.i(v0_0);
            return v6_3;
        } catch (NumberFormatException v1) {
            StringBuilder v0_1 = v1.a.q("Cannot parse ", v0_0, "; at path ");
            v0_1.append(v6_3.A(1));
            throw new a5.o(v0_1.toString(), v1);
        }
    }
}
