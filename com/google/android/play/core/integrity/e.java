package com.google.android.play.core.integrity;
final class e extends com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest {
    private final long a;

    public synthetic e(long p1, int p3, com.google.android.play.core.integrity.d p4)
    {
        this.a = p1;
        return;
    }

    public final int a()
    {
        return 0;
    }

    public final long b()
    {
        return this.a;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest)) || (this.a != ((com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest) p8).b())) {
                return 0;
            } else {
                ((com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest) p8).a();
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        return ((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        v0_1.append(this.a);
        v0_1.append(", webViewRequestMode=0}");
        return v0_1.toString();
    }
}
