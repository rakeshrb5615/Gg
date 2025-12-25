package q0;
public final class c implements q0.d, q0.f {
    public final synthetic int a;
    public final Object b;

    public c(android.content.ClipData p2, int p3)
    {
        this.a = 0;
        this.b = i2.u0.b(p2, p3);
        return;
    }

    public c(android.view.ContentInfo p2)
    {
        this.a = 1;
        p2.getClass();
        this.b = p2;
        return;
    }

    public int a()
    {
        return ((android.view.ContentInfo) this.b).getSource();
    }

    public android.content.ClipData b()
    {
        return ((android.view.ContentInfo) this.b).getClip();
    }

    public q0.g build()
    {
        return new q0.g(new q0.c(((android.view.ContentInfo$Builder) this.b).build()));
    }

    public int c()
    {
        return ((android.view.ContentInfo) this.b).getFlags();
    }

    public android.view.ContentInfo d()
    {
        return ((android.view.ContentInfo) this.b);
    }

    public void e(android.net.Uri p2)
    {
        ((android.view.ContentInfo$Builder) this.b).setLinkUri(p2);
        return;
    }

    public void f(int p2)
    {
        ((android.view.ContentInfo$Builder) this.b).setFlags(p2);
        return;
    }

    public void setExtras(android.os.Bundle p2)
    {
        ((android.view.ContentInfo$Builder) this.b).setExtras(p2);
        return;
    }

    public String toString()
    {
        switch (this.a) {
            case 1:
                String v0_4 = new StringBuilder("ContentInfoCompat{");
                v0_4.append(((android.view.ContentInfo) this.b));
                v0_4.append("}");
                return v0_4.toString();
            default:
                return super.toString();
        }
    }
}
