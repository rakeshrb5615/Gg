package okhttp3.internal.ws;
public final class WebSocketExtensions {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    static WebSocketExtensions()
    {
        new okhttp3.internal.ws.WebSocketExtensions$Companion(0);
        return;
    }

    public WebSocketExtensions()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof okhttp3.internal.ws.WebSocketExtensions)) {
                if (this.a == ((okhttp3.internal.ws.WebSocketExtensions) p5).a) {
                    if (kotlin.jvm.internal.j.a(this.b, ((okhttp3.internal.ws.WebSocketExtensions) p5).b)) {
                        if (this.c == ((okhttp3.internal.ws.WebSocketExtensions) p5).c) {
                            if (kotlin.jvm.internal.j.a(this.d, ((okhttp3.internal.ws.WebSocketExtensions) p5).d)) {
                                if (this.e == ((okhttp3.internal.ws.WebSocketExtensions) p5).e) {
                                    if (this.f == ((okhttp3.internal.ws.WebSocketExtensions) p5).f) {
                                        return 1;
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_7;
        int v0_9 = (Boolean.hashCode(this.a) * 31);
        int v1_0 = 0;
        int v2_6 = this.b;
        if (v2_6 != 0) {
            v2_7 = v2_6.hashCode();
        } else {
            v2_7 = 0;
        }
        int v2_3 = ((Boolean.hashCode(this.c) + ((v0_9 + v2_7) * 31)) * 31);
        int v0_3 = this.d;
        if (v0_3 != 0) {
            v1_0 = v0_3.hashCode();
        }
        return (Boolean.hashCode(this.f) + ((Boolean.hashCode(this.e) + ((v2_3 + v1_0) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        v0_1.append(this.a);
        v0_1.append(", clientMaxWindowBits=");
        v0_1.append(this.b);
        v0_1.append(", clientNoContextTakeover=");
        v0_1.append(this.c);
        v0_1.append(", serverMaxWindowBits=");
        v0_1.append(this.d);
        v0_1.append(", serverNoContextTakeover=");
        v0_1.append(this.e);
        v0_1.append(", unknownValues=");
        v0_1.append(this.f);
        v0_1.append(41);
        return v0_1.toString();
    }
}
