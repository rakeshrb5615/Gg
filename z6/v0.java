package z6;
public class v0 extends w6.z {

    public v0()
    {
        return;
    }

    public final Object b(e7.a p5)
    {
        if (p5.O() != 9) {
            try {
                StringBuilder v0_3 = p5.G();
            } catch (Byte v5_6) {
                throw new w6.p(v5_6);
            }
            if ((v0_3 > 255) || (v0_3 < -128)) {
                StringBuilder v0_2 = v1.a.p("Lossy conversion from ", v0_3, " to byte; at path ");
                v0_2.append(p5.A(1));
                throw new w6.p(v0_2.toString());
            } else {
                return Byte.valueOf(((byte) v0_3));
            }
        } else {
            p5.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (((Number) p4) != null) {
            p3.G(((long) ((Number) p4).byteValue()));
            return;
        } else {
            p3.B();
            return;
        }
    }
}
