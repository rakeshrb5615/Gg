package m5;
public final synthetic class b implements java.io.FilenameFilter {
    public final synthetic String a;

    public synthetic b(String p1)
    {
        this.a = p1;
        return;
    }

    public final boolean accept(java.io.File p1, String p2)
    {
        return p2.startsWith(this.a);
    }
}
