package q0;
public final class e implements q0.d, q0.f {
    public final synthetic int a;
    public android.content.ClipData b;
    public int c;
    public int d;
    public android.net.Uri e;
    public android.os.Bundle f;

    public synthetic e()
    {
        this.a = 0;
        return;
    }

    public e(q0.e p4)
    {
        this.a = 1;
        String v0_5 = p4.b;
        v0_5.getClass();
        this.b = v0_5;
        String v0_12 = p4.c;
        if (v0_12 < null) {
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else {
            if (v0_12 > 5) {
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            } else {
                this.c = v0_12;
                String v0_3 = p4.d;
                if ((v0_3 & 1) != v0_3) {
                    StringBuilder v1_3 = new StringBuilder("Requested flags 0x");
                    v1_3.append(Integer.toHexString(v0_3));
                    v1_3.append(", but only 0x");
                    v1_3.append(Integer.toHexString(1));
                    v1_3.append(" are allowed");
                    throw new IllegalArgumentException(v1_3.toString());
                } else {
                    this.d = v0_3;
                    this.e = p4.e;
                    this.f = p4.f;
                    return;
                }
            }
        }
    }

    public int a()
    {
        return this.c;
    }

    public android.content.ClipData b()
    {
        return this.b;
    }

    public q0.g build()
    {
        return new q0.g(new q0.e(this));
    }

    public int c()
    {
        return this.d;
    }

    public android.view.ContentInfo d()
    {
        return 0;
    }

    public void e(android.net.Uri p1)
    {
        this.e = p1;
        return;
    }

    public void f(int p1)
    {
        this.d = p1;
        return;
    }

    public void setExtras(android.os.Bundle p1)
    {
        this.f = p1;
        return;
    }

    public String toString()
    {
        switch (this.a) {
            case 1:
                String v2_2;
                String v0_1 = this.e;
                StringBuilder v1_1 = new StringBuilder("ContentInfoCompat{clip=");
                v1_1.append(this.b.getDescription());
                v1_1.append(", source=");
                String v2_1 = this.c;
                if (v2_1 == null) {
                    v2_2 = "SOURCE_APP";
                } else {
                    if (v2_1 == 1) {
                        v2_2 = "SOURCE_CLIPBOARD";
                    } else {
                        if (v2_1 == 2) {
                            v2_2 = "SOURCE_INPUT_METHOD";
                        } else {
                            if (v2_1 == 3) {
                                v2_2 = "SOURCE_DRAG_AND_DROP";
                            } else {
                                if (v2_1 == 4) {
                                    v2_2 = "SOURCE_AUTOFILL";
                                } else {
                                    if (v2_1 == 5) {
                                        v2_2 = "SOURCE_PROCESS_TEXT";
                                    } else {
                                        v2_2 = String.valueOf(v2_1);
                                    }
                                }
                            }
                        }
                    }
                }
                String v2_5;
                v1_1.append(v2_2);
                v1_1.append(", flags=");
                String v2_4 = this.d;
                if ((v2_4 & 1) == 0) {
                    v2_5 = String.valueOf(v2_4);
                } else {
                    v2_5 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                }
                String v0_5;
                v1_1.append(v2_5);
                String v2_7 = "";
                if (v0_1 != null) {
                    StringBuilder v3_7 = new StringBuilder(", hasLinkUri(");
                    v3_7.append(v0_1.toString().length());
                    v3_7.append(")");
                    v0_5 = v3_7.toString();
                } else {
                    v0_5 = "";
                }
                v1_1.append(v0_5);
                if (this.f != null) {
                    v2_7 = ", hasExtras";
                }
                return v1.a.n(v1_1, v2_7, "}");
            default:
                return super.toString();
        }
    }
}
