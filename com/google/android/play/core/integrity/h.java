package com.google.android.play.core.integrity;
final class h extends com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest {
    private final String a;

    public synthetic h(String p1, com.google.android.play.core.integrity.g p2)
    {
        this.a = p1;
        return;
    }

    public final String a()
    {
        return this.a;
    }

    public final boolean equals(Object p4)
    {
        if (p4 != this) {
            if (!(p4 instanceof com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest)) {
                return 0;
            } else {
                String v1_1 = this.a;
                if (v1_1 != null) {
                    return v1_1.equals(((com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest) p4).a());
                } else {
                    if (((com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest) p4).a() == null) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_1;
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_1 = v0_0.hashCode();
        } else {
            v0_1 = 0;
        }
        return (v0_1 ^ 1000003);
    }

    public final String toString()
    {
        return v1.a.n(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.a, "}");
    }
}
