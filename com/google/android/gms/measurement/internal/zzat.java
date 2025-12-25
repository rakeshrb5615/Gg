package com.google.android.gms.measurement.internal;
public final class zzat {
    final synthetic com.google.android.gms.measurement.internal.zzav zza;
    private final String zzb;
    private long zzc;

    public zzat(com.google.android.gms.measurement.internal.zzav p1, String p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p2;
        this.zzc = -1;
        return;
    }

    public zzat(com.google.android.gms.measurement.internal.zzav p3, String p4, long p5)
    {
        java.util.Objects.requireNonNull(p3);
        this.zza = p3;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        this.zzb = p4;
        this.zzc = p3.zzah("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[] {p4, String.valueOf(p5)}), -1);
        return;
    }

    public final java.util.List zza()
    {
        java.util.List v2_1 = new java.util.ArrayList();
        try {
            String v15 = "timestamp";
            String v17 = "data";
            android.database.Cursor v3_0 = this.zza.zze().query("raw_events", new String[] {"rowid", "realtime"}), "app_id = ? and rowid > ?", new String[] {this.zzb, String.valueOf(this.zzc)}), 0, 0, "rowid", "1000");
        } catch (boolean v0_7) {
            this.zza.zzu.zzaV().zzb().zzc("Data loss. Error querying raw events batch. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zzb), v0_7);
            if (v3_0 != null) {
                v3_0.close();
            }
            return v2_1;
        } catch (boolean v0_0) {
            if (v3_0 != null) {
                v3_0.close();
            }
            throw v0_0;
        }
        if (!v3_0.moveToFirst()) {
            v2_1 = java.util.Collections.EMPTY_LIST;
        }
        do {
            boolean v0_4 = 0;
            String v5_1 = v3_0.getLong(0);
            long v7_0 = v3_0.getLong(3);
            if (v3_0.getLong(5) == 1) {
                v0_4 = 1;
            }
            com.google.android.gms.measurement.internal.zzas v4_5 = v3_0.getBlob(4);
            if (v5_1 > this.zzc) {
                this.zzc = v5_1;
            }
            com.google.android.gms.measurement.internal.zzas v4_7 = ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), v4_5));
            boolean v9_3 = v3_0.getString(1);
            if (!v9_3) {
                v9_3 = "";
            }
            v4_7.zzl(v9_3);
            v4_7.zzo(v3_0.getLong(2));
            v2_1.add(new com.google.android.gms.measurement.internal.zzas(v5_1, v7_0, v0_4, ((com.google.android.gms.internal.measurement.zzhs) v4_7.zzbc())));
        } while(v3_0.moveToNext());
    }
}
