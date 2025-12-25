package g5;
public final synthetic class h implements java.io.FilenameFilter {
    public final synthetic int a;

    public synthetic h(int p1)
    {
        this.a = p1;
        return;
    }

    public final boolean accept(java.io.File p1, String p2)
    {
        switch (this.a) {
            case 0:
                return p2.startsWith("aqs.");
            case 1:
                return p2.startsWith(".ae");
            case 2:
                return p2.startsWith("event");
            default:
                int v1_8;
                if (!p2.startsWith("event")) {
                    v1_8 = 0;
                    return v1_8;
                } else {
                    if (p2.endsWith("_")) {
                    } else {
                        v1_8 = 1;
                        return v1_8;
                    }
                }
        }
    }
}
