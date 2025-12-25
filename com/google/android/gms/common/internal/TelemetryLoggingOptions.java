package com.google.android.gms.common.internal;
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa;
    private final String zab;

    static TelemetryLoggingOptions()
    {
        com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa = com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().build();
        return;
    }

    public synthetic TelemetryLoggingOptions(String p1, com.google.android.gms.common.internal.zaad p2)
    {
        this.zab = p1;
        return;
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder builder()
    {
        return new com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder(0);
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if ((p2 instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions)) {
                return com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.internal.TelemetryLoggingOptions) p2).zab);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zab}));
    }

    public final android.os.Bundle zaa()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        String v1 = this.zab;
        if (v1 != null) {
            v0_1.putString("api", v1);
        }
        return v0_1;
    }
}
