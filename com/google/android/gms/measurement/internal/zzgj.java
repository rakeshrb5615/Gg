package com.google.android.gms.measurement.internal;
final class zzgj extends com.google.android.gms.internal.measurement.zzby {
    final synthetic com.google.android.gms.measurement.internal.zzgl zza;

    public zzgj(com.google.android.gms.measurement.internal.zzgl p2, android.content.Context p3, String p4)
    {
        java.util.Objects.requireNonNull(p2);
        this.zza = p2;
        super(p3, "google_app_measurement_local.db", 0, 1);
        return;
    }

    public final android.database.sqlite.SQLiteDatabase getWritableDatabase()
    {
        try {
            return super.getWritableDatabase();
        } catch (int v0_8) {
            throw v0_8;
        } catch (android.database.sqlite.SQLiteException) {
            int v0_7 = this.zza.zzu;
            v0_7.zzaV().zzb().zza("Opening the local database failed, dropping and recreating it");
            v0_7.zzc();
            if (!v0_7.zzaY().getDatabasePath("google_app_measurement_local.db").delete()) {
                v0_7.zzaV().zzb().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (int v0_4) {
                this.zza.zzu.zzaV().zzb().zzb("Failed to open local database. Events will bypass local storage", v0_4);
                return 0;
            }
        }
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase p2)
    {
        com.google.android.gms.measurement.internal.zzaw.zzb(this.zza.zzu.zzaV(), p2);
        return;
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        return;
    }

    public final void onOpen(android.database.sqlite.SQLiteDatabase p7)
    {
        com.google.android.gms.measurement.internal.zzaw.zza(this.zza.zzu.zzaV(), p7, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", com.google.android.gms.measurement.internal.zzgl.zzr());
        return;
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        return;
    }
}
