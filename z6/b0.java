package z6;
public class b0 extends w6.z {

    public b0()
    {
        return;
    }

    public final Object b(e7.a p6)
    {
        if (p6.O() != 9) {
            StringBuilder v0_2 = p6.M();
            if (v0_2.length() != 1) {
                StringBuilder v0_1 = v1.a.q("Expecting character, got: ", v0_2, "; at ");
                v0_1.append(p6.A(1));
                throw new w6.p(v0_1.toString());
            } else {
                return Character.valueOf(v0_2.charAt(0));
            }
        } else {
            p6.K();
            return 0;
        }
    }

    public final void c(e7.b p1, Object p2)
    {
        String v2_2;
        if (((Character) p2) != null) {
            v2_2 = String.valueOf(((Character) p2));
        } else {
            v2_2 = 0;
        }
        p1.I(v2_2);
        return;
    }
}
