package com.google.android.recaptcha.internal;
public final class zzei extends android.database.sqlite.SQLiteOpenHelper {
    public static final com.google.android.recaptcha.internal.zzeg zza;
    private static final int zzb;
    private static final String zzc;
    private static com.google.android.recaptcha.internal.zzei zzd;

    static zzei()
    {
        String v0_1 = new com.google.android.recaptcha.internal.zzeg(0);
        com.google.android.recaptcha.internal.zzei.zza = v0_1;
        com.google.android.recaptcha.internal.zzei.zzb = com.google.android.recaptcha.internal.zzeg.zza(v0_1, "18.6.1");
        com.google.android.recaptcha.internal.zzei.zzc = com.google.android.recaptcha.internal.zzeg.zzb(v0_1, "18.6.1");
        return;
    }

    public synthetic zzei(android.content.Context p3, kotlin.jvm.internal.f p4)
    {
        super(p3, com.google.android.recaptcha.internal.zzei.zzc, 0, com.google.android.recaptcha.internal.zzei.zzb);
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzei zzc()
    {
        return com.google.android.recaptcha.internal.zzei.zzd;
    }

    public static final synthetic void zze(com.google.android.recaptcha.internal.zzei p0)
    {
        com.google.android.recaptcha.internal.zzei.zzd = p0;
        return;
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase p2)
    {
        p2.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
        return;
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        p1.execSQL("DROP TABLE IF EXISTS ce");
        p1.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
        return;
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        p1.execSQL("DROP TABLE IF EXISTS ce");
        p1.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
        return;
    }

    public final int zza(java.util.List p7)
    {
        if (!p7.isEmpty()) {
            return this.getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(i7.i.c0(p7, ", ", "(", ")", com.google.android.recaptcha.internal.zzeh.zza, 24))), 0);
        } else {
            return 0;
        }
    }

    public final int zzb()
    {
        android.database.Cursor v0_1 = this.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", 0);
        int v1_1 = -1;
        try {
            if (v0_1.moveToNext()) {
                v1_1 = v0_1.getInt(0);
            }
        } catch (Exception) {
        } catch (int v1_0) {
            v0_1.close();
            throw v1_0;
        }
        v0_1.close();
        return v1_1;
    }

    public final java.util.List zzd()
    {
        android.database.Cursor v1_0 = this.getReadableDatabase().query("ce", 0, 0, 0, 0, 0, "ts ASC");
        Throwable v0_2 = new java.util.ArrayList();
        try {
            while (v1_0.moveToNext()) {
                int v2_3 = v1_0.getInt(v1_0.getColumnIndexOrThrow("id"));
                String v3_2 = v1_0.getString(v1_0.getColumnIndexOrThrow("ss"));
                long v4_2 = v1_0.getLong(v1_0.getColumnIndexOrThrow("ts"));
                kotlin.jvm.internal.j.b(v3_2);
                v0_2.add(new com.google.android.recaptcha.internal.zzej(v3_2, v4_2, v2_3));
            }
        } catch (Throwable v0_3) {
            v1_0.close();
            throw v0_3;
        }
        v1_0.close();
        return v0_2;
    }

    public final boolean zzf(com.google.android.recaptcha.internal.zzej p2)
    {
        if (this.zza(a.a.G(p2)) != 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
