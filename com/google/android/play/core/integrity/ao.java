package com.google.android.play.core.integrity;
final class ao extends com.google.android.play.core.integrity.IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c;

    public synthetic ao(String p1, Long p2, Object p3, com.google.android.play.core.integrity.an p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = 0;
        return;
    }

    private static boolean a()
    {
        return 1;
    }

    public final Long cloudProjectNumber()
    {
        return this.b;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((!(p6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest)) || (!this.a.equals(((com.google.android.play.core.integrity.IntegrityTokenRequest) p6).nonce()))) {
                int v1_4 = 0;
            } else {
                Long v3_1 = this.b;
                if (v3_1 != null) {
                    if (!v3_1.equals(((com.google.android.play.core.integrity.IntegrityTokenRequest) p6).cloudProjectNumber())) {
                    }
                } else {
                    if (((com.google.android.play.core.integrity.IntegrityTokenRequest) p6).cloudProjectNumber() != null) {
                    }
                }
                v1_4 = 1;
            }
            if ((!(p6 instanceof com.google.android.play.core.integrity.ao)) || (!com.google.android.play.core.integrity.ao.a())) {
                return v1_4;
            } else {
                if (v1_4 == 0) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        boolean v2_2;
        int v0_4 = (this.a.hashCode() ^ 1000003);
        boolean v2_1 = this.b;
        if (v2_1) {
            v2_2 = v2_1.hashCode();
        } else {
            v2_2 = 0;
        }
        int v0_2 = ((v0_4 * 1000003) ^ v2_2);
        if (com.google.android.play.core.integrity.ao.a()) {
            v0_2 *= 1000003;
        }
        return v0_2;
    }

    public final String nonce()
    {
        return this.a;
    }

    public final String toString()
    {
        String v0_3 = new StringBuilder("IntegrityTokenRequest{nonce=");
        v0_3.append(this.a);
        v0_3.append(", cloudProjectNumber=");
        v0_3.append(this.b);
        String v0_1 = v0_3.toString();
        if (com.google.android.play.core.integrity.ao.a()) {
            v0_1 = v0_1.concat(", network=null");
        }
        return v0_1.concat("}");
    }
}
