package a1;
public final class k0 extends kotlin.jvm.internal.k implements u7.a {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic k0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        super(0);
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                try {
                    a1.l0.d.remove(((java.io.File) this.b).getAbsolutePath());
                    return h7.l.a;
                } catch (IllegalStateException v1_1) {
                    throw v1_1;
                }
            case 1:
                ((d8.p0) this.b).a();
                return h7.l.a;
            default:
                String v0_6 = ((java.io.File) ((c1.a) this.b).invoke());
                IllegalStateException v1_2 = v0_6.getName();
                kotlin.jvm.internal.j.d(v1_2, "getName(...)");
                String v2_2 = "";
                int v3_1 = b8.i.z0(v1_2, 46, 0, 6);
                if (v3_1 != -1) {
                    v2_2 = v1_2.substring((v3_1 + 1), v1_2.length());
                    kotlin.jvm.internal.j.d(v2_2, "substring(...)");
                }
                if (!v2_2.equals("preferences_pb")) {
                    IllegalStateException v1_7 = new StringBuilder("File extension for file: ");
                    v1_7.append(v0_6);
                    v1_7.append(" does not match required extension for Preferences file: preferences_pb");
                    throw new IllegalStateException(v1_7.toString().toString());
                } else {
                    String v0_12 = v0_6.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(v0_12, "file.absoluteFile");
                    return v0_12;
                }
        }
    }
}
