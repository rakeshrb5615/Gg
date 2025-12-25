package com.google.android.gms.measurement.internal;
public final class zzgl extends com.google.android.gms.measurement.internal.zzg {
    private static final String[] zza;
    private final com.google.android.gms.measurement.internal.zzgj zzb;
    private boolean zzc;

    static zzgl()
    {
        com.google.android.gms.measurement.internal.zzgl.zza = new String[] {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"});
        return;
    }

    public zzgl(com.google.android.gms.measurement.internal.zzic p3)
    {
        super(p3);
        android.content.Context v0_1 = super.zzu.zzaY();
        super.zzu.zzc();
        super.zzb = new com.google.android.gms.measurement.internal.zzgj(super, v0_1, "google_app_measurement_local.db");
        return;
    }

    public static synthetic String[] zzr()
    {
        return com.google.android.gms.measurement.internal.zzgl.zza;
    }

    private final boolean zzs(int p19, byte[] p20)
    {
        int v8_0;
        this.zzg();
        String v2_6 = 0;
        try {
            if (!this.zzc) {
                android.database.sqlite.SQLiteException v0_9;
                com.google.android.gms.measurement.internal.zzic v3 = this.zzu;
                Long v4_7 = com.google.android.gms.measurement.internal.zzfy.zzbb;
                int v5 = 0;
                if (!v3.zzc().zzp(0, v4_7)) {
                    v0_9 = 0;
                } else {
                    v0_9 = this.zzu.zzv().zzh(0);
                }
                android.content.ContentValues v6_1 = new android.content.ContentValues();
                v6_1.put("type", Integer.valueOf(p19));
                v6_1.put("entry", p20);
                if ((v3.zzc().zzp(0, v4_7)) && (v0_9 != null)) {
                    v6_1.put("app_version", v0_9.zzc);
                    v6_1.put("app_version_int", Long.valueOf(v0_9.zzj));
                }
                v3.zzc();
                Long v4_5 = 5;
                int v7_5 = 0;
                v8_0 = 5;
                while (v7_5 < v4_5) {
                    try {
                        int v10 = this.zzp();
                    } catch (android.database.sqlite.SQLiteException v0_10) {
                        unknownType v17_0 = v2_6;
                        v10 = 0;
                        android.database.Cursor v11 = 0;
                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", v0_10);
                        this.zzc = 1;
                        if (v11 != null) {
                            v11.close();
                        }
                        if (v10 != 0) {
                            v10.close();
                        }
                    } catch (android.database.sqlite.SQLiteFullException) {
                        v17_0 = v2_6;
                        v10 = 0;
                        v11 = 0;
                        android.os.SystemClock.sleep(((long) v8_0));
                        v8_0 += 20;
                        if (v11 != null) {
                            v11.close();
                        }
                        if (v10 != 0) {
                        }
                    } catch (android.database.sqlite.SQLiteException v0_8) {
                        v17_0 = v2_6;
                        int v20_1 = 1;
                        v10 = 0;
                        v11 = 0;
                        if (v10 != 0) {
                            if (v10.inTransaction()) {
                                v10.endTransaction();
                            }
                        }
                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", v0_8);
                        this.zzc = v20_1;
                        if (v11 != null) {
                            v11.close();
                        }
                        if (v10 != 0) {
                        }
                    } catch (android.database.sqlite.SQLiteException v0_15) {
                        v10 = 0;
                        if (v5 != 0) {
                            v5.close();
                        }
                        if (v10 != 0) {
                            v10.close();
                        }
                        throw v0_15;
                    }
                    if (v10 != 0) {
                        v10.beginTransaction();
                        v11 = v10.rawQuery("select count(1) from messages", 0);
                        Long v12_0 = 0;
                        try {
                            if ((v11 == null) || (!v11.moveToFirst())) {
                                if (v12_0 < 100000) {
                                    v17_0 = v2_6;
                                    v20_1 = 1;
                                } else {
                                    v3.zzaV().zzb().zza("Data loss, local db full");
                                    long v15_2 = (100001 - v12_0);
                                    Long v12_3 = ((long) v10.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[] {Long.toString(v15_2)})));
                                    if (v12_3 == v15_2) {
                                    } else {
                                        v17_0 = v2_6;
                                        v20_1 = 1;
                                        v3.zzaV().zzb().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(v15_2), Long.valueOf(v12_3), Long.valueOf((v15_2 - v12_3)));
                                    }
                                }
                                v10.insertOrThrow("messages", 0, v6_1);
                                v10.setTransactionSuccessful();
                                v10.endTransaction();
                                if (v11 != null) {
                                    v11.close();
                                }
                                v10.close();
                                return v20_1;
                            } else {
                                v12_0 = v11.getLong(v2_6);
                            }
                            v20_1 = 1;
                        } catch (android.database.sqlite.SQLiteException v0_10) {
                            v17_0 = v2_6;
                        } catch (android.database.sqlite.SQLiteFullException) {
                            v17_0 = v2_6;
                        } catch (android.database.sqlite.SQLiteException v0_8) {
                            v17_0 = v2_6;
                        }
                    } else {
                        this.zzc = 1;
                        return v2_6;
                    }
                }
                unknownType v17_1 = v2_6;
                this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
                return v17_1;
            }
        } catch (android.database.sqlite.SQLiteException v0_15) {
            v5 = v11;
        }
        v7_5++;
        v2_6 = v17_0;
        v4_5 = 5;
    }

    public final boolean zze()
    {
        return 0;
    }

    public final void zzh()
    {
        this.zzg();
        try {
            Integer v0_0 = this.zzp();
        } catch (Integer v0_3) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", v0_3);
            return;
        }
        if (v0_0 != null) {
            Integer v0_2 = v0_0.delete("messages", 0, 0);
            if (v0_2 > null) {
                this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(v0_2));
                return;
            }
        }
        return;
    }

    public final boolean zzi(com.google.android.gms.measurement.internal.zzbg p4)
    {
        String v0_0 = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzbh.zza(p4, v0_0, 0);
        boolean v4_5 = v0_0.marshall();
        v0_0.recycle();
        if (v4_5.length <= 131072) {
            return this.zzs(0, v4_5);
        } else {
            this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
            return 0;
        }
    }

    public final boolean zzj(com.google.android.gms.measurement.internal.zzpl p4)
    {
        int v0_0 = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzpm.zza(p4, v0_0, 0);
        boolean v4_5 = v0_0.marshall();
        v0_0.recycle();
        if (v4_5.length <= 131072) {
            return this.zzs(1, v4_5);
        } else {
            this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
            return 0;
        }
    }

    public final boolean zzk(com.google.android.gms.measurement.internal.zzah p4)
    {
        int v0_0 = this.zzu;
        boolean v4_5 = v0_0.zzk().zzae(p4);
        if (v4_5.length <= 131072) {
            return this.zzs(2, v4_5);
        } else {
            v0_0.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
            return 0;
        }
    }

    public final boolean zzl(com.google.android.gms.measurement.internal.zzbe p5)
    {
        int v0_0 = this.zzu;
        boolean v5_6 = v0_0.zzk().zzae(p5);
        if (v5_6) {
            if (v5_6.length <= 131072) {
                return this.zzs(4, v5_6);
            } else {
                v0_0.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
                return 0;
            }
        } else {
            v0_0.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return 0;
        }
    }

    public final java.util.List zzm(int p30)
    {
        int v3_3 = "entry";
        String[] v4_8 = "type";
        com.google.android.gms.measurement.internal.zzgk v5_15 = "rowid";
        this.zzg();
        int v6_15 = 0;
        if (!this.zzc) {
            java.util.ArrayList v7_0 = new java.util.ArrayList();
            if (!this.zzq()) {
                return v7_0;
            } else {
                int v8_0 = 5;
                int v9_0 = 0;
                int v11 = 5;
                int v10 = 0;
                while (v10 < v8_0) {
                    try {
                        int v13 = this.zzp();
                    } catch (Throwable v0_4) {
                        int v17_0 = v3_3;
                        String[] v19_1 = v4_8;
                        android.os.Parcel v21_1 = v5_15;
                        int v6_0 = v9_0;
                        v13 = 0;
                        android.database.Cursor v14_2 = 0;
                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", v0_4);
                        this.zzc = 1;
                        if (v14_2 != null) {
                            v14_2.close();
                        }
                        if (v13 == 0) {
                            v10++;
                            v9_0 = v6_0;
                            v3_3 = v17_0;
                            v4_8 = v19_1;
                            v5_15 = v21_1;
                            v6_15 = 0;
                            v8_0 = 5;
                        } else {
                            v13.close();
                        }
                    } catch (android.database.sqlite.SQLiteFullException) {
                        v17_0 = v3_3;
                        v19_1 = v4_8;
                        v21_1 = v5_15;
                        v6_0 = v9_0;
                        v13 = 0;
                        v14_2 = 0;
                        android.os.SystemClock.sleep(((long) v11));
                        v11 += 20;
                        if (v14_2 != null) {
                            v14_2.close();
                        }
                        if (v13 == 0) {
                        }
                    } catch (Throwable v0_3) {
                        v17_0 = v3_3;
                        v19_1 = v4_8;
                        v21_1 = v5_15;
                        v6_0 = v9_0;
                        v13 = 0;
                        v14_2 = 0;
                        if (v13 != 0) {
                            if (v13.inTransaction()) {
                                v13.endTransaction();
                            }
                        }
                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", v0_3);
                        this.zzc = 1;
                        if (v14_2 != null) {
                            v14_2.close();
                        }
                        if (v13 == 0) {
                        }
                    } catch (Throwable v0_14) {
                        int v6_14 = 0;
                        v13 = 0;
                        if (v6_14 != 0) {
                            v6_14.close();
                        }
                        if (v13 != 0) {
                            v13.close();
                        }
                        throw v0_14;
                    } catch (Throwable v0_14) {
                        v6_14 = v14_2;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException) {
                    }
                    if (v13 != 0) {
                        v13.beginTransaction();
                        try {
                            android.database.Cursor v14_4 = v13.query("messages", new String[] {v5_15}), "type=?", new String[] {"3"}), 0, 0, "rowid desc", "1");
                        } catch (Throwable v0_33) {
                            v17_0 = v3_3;
                            v19_1 = v4_8;
                            v21_1 = v5_15;
                            v6_0 = v9_0;
                            v14_4 = 0;
                            if (v14_4 != null) {
                                v14_4.close();
                            }
                            throw v0_33;
                        }
                        String v15_12;
                        long v22 = -1;
                        if (!v14_4.moveToFirst()) {
                            v14_4.close();
                            v15_12 = -1;
                        } else {
                            v15_12 = v14_4.getLong(v9_0);
                            v14_4.close();
                        }
                        int v16_1;
                        int v17_2;
                        if (v15_12 == -1) {
                            v16_1 = v6_15;
                            v17_2 = v16_1;
                        } else {
                            android.database.Cursor v14_5 = new String[1];
                            v14_5[v9_0] = String.valueOf(v15_12);
                            v16_1 = "rowid<?";
                            v17_2 = v14_5;
                        }
                        Throwable v0_0 = new String[] {v5_15, v4_8, v3_3});
                        android.database.Cursor v14_0 = this.zzu;
                        p30 = 1;
                        com.google.android.gms.measurement.internal.zzfx v12_0 = com.google.android.gms.measurement.internal.zzfy.zzbb;
                        int v25 = 4;
                        int v26 = 3;
                        v6_0 = 2;
                        if (v14_0.zzc().zzp(v6_15, v12_0)) {
                            v0_0 = new String[v8_0];
                            v0_0[v9_0] = v5_15;
                            v0_0[1] = v4_8;
                            v0_0[2] = v3_3;
                            v0_0[3] = "app_version";
                            v0_0[4] = "app_version_int";
                        }
                        Throwable v0_2 = v14_0;
                        v14_2 = v13.query("messages", v0_0, v16_1, v17_2, 0, 0, "rowid asc", Integer.toString(100));
                        try {
                            while (v14_2.moveToNext()) {
                                v22 = v14_2.getLong(v9_0);
                                int v8_1 = v14_2.getInt(p30);
                                String v15_7 = v14_2.getBlob(v6_0);
                                try {
                                    int v9_2;
                                    String[] v19_2;
                                    if (!v0_2.zzc().zzp(0, v12_0)) {
                                        v19_2 = 0;
                                        v9_2 = 0;
                                        int v6_5 = v3_3;
                                        v19_1 = v4_8;
                                        int v3_4 = v19_2;
                                        try {
                                            int v3_5;
                                            android.database.sqlite.SQLiteException v20_1;
                                            Throwable v0_11;
                                            if (v8_1 != 0) {
                                                v20_1 = v0_2;
                                                v21_1 = v5_15;
                                                if (v8_1 != 1) {
                                                    v0_11 = 2;
                                                    try {
                                                        if (v8_1 != 2) {
                                                            v17_0 = v6_5;
                                                            if (v8_1 != 4) {
                                                                v3_5 = 3;
                                                                v6_0 = 0;
                                                                if (v8_1 != 3) {
                                                                    this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                                } else {
                                                                    this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                                }
                                                            } else {
                                                                com.google.android.gms.measurement.internal.zzgk v5_3 = android.os.Parcel.obtain();
                                                                try {
                                                                    int v8_5;
                                                                    v6_0 = 0;
                                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException) {
                                                                    v6_0 = 0;
                                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                    v5_3.recycle();
                                                                    v8_5 = 0;
                                                                    if (v8_5 != 0) {
                                                                        v7_0.add(new com.google.android.gms.measurement.internal.zzgk(v8_5, v9_2, v3_4));
                                                                    }
                                                                    v3_5 = 3;
                                                                } catch (Throwable v0_12) {
                                                                    v6_0 = 0;
                                                                    v5_3.recycle();
                                                                    throw v0_12;
                                                                } catch (Throwable v0_12) {
                                                                }
                                                                v5_3.unmarshall(v15_7, 0, v15_7.length);
                                                                v5_3.setDataPosition(0);
                                                                v8_5 = ((com.google.android.gms.measurement.internal.zzbe) com.google.android.gms.measurement.internal.zzbe.CREATOR.createFromParcel(v5_3));
                                                                v5_3.recycle();
                                                            }
                                                        } else {
                                                            com.google.android.gms.measurement.internal.zzgk v5_6 = android.os.Parcel.obtain();
                                                            try {
                                                                int v6_10;
                                                                v17_0 = v6_5;
                                                            } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException) {
                                                                v17_0 = 0;
                                                                this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                v5_6.recycle();
                                                                v6_10 = 0;
                                                                if (v6_10 == 0) {
                                                                    v3_5 = 3;
                                                                    v6_0 = 0;
                                                                } else {
                                                                    v7_0.add(new com.google.android.gms.measurement.internal.zzgk(v6_10, v9_2, v3_4));
                                                                }
                                                            } catch (Throwable v0_13) {
                                                                v17_0 = 0;
                                                                v5_6.recycle();
                                                                throw v0_13;
                                                            } catch (Throwable v0_13) {
                                                            }
                                                            v5_6.unmarshall(v15_7, 0, v15_7.length);
                                                            v5_6.setDataPosition(0);
                                                            v6_10 = ((com.google.android.gms.measurement.internal.zzah) com.google.android.gms.measurement.internal.zzah.CREATOR.createFromParcel(v5_6));
                                                            v5_6.recycle();
                                                        }
                                                    } catch (Throwable v0_4) {
                                                        v6_0 = 0;
                                                    } catch (Throwable v0_3) {
                                                        v6_0 = 0;
                                                    }
                                                } else {
                                                    com.google.android.gms.measurement.internal.zzgk v5_9 = android.os.Parcel.obtain();
                                                    try {
                                                        v5_9.unmarshall(v15_7, 0, v15_7.length);
                                                        v5_9.setDataPosition(0);
                                                        Throwable v0_18 = ((com.google.android.gms.measurement.internal.zzpl) com.google.android.gms.measurement.internal.zzpl.CREATOR.createFromParcel(v5_9));
                                                    } catch (Throwable v0_22) {
                                                        v5_9.recycle();
                                                        throw v0_22;
                                                    }
                                                    v5_9.recycle();
                                                    if (v0_18 == null) {
                                                        v17_0 = v6_5;
                                                        v0_11 = 2;
                                                    } else {
                                                        v7_0.add(new com.google.android.gms.measurement.internal.zzgk(v0_18, v9_2, v3_4));
                                                    }
                                                }
                                            } else {
                                                int v8_13 = android.os.Parcel.obtain();
                                                v20_1 = v0_2;
                                                try {
                                                    v21_1 = v5_15;
                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException) {
                                                    v21_1 = 0;
                                                    this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                    v8_13.recycle();
                                                } catch (Throwable v0_24) {
                                                    v21_1 = 0;
                                                    v8_13.recycle();
                                                    throw v0_24;
                                                } catch (Throwable v0_24) {
                                                }
                                                v8_13.unmarshall(v15_7, 0, v15_7.length);
                                                v8_13.setDataPosition(0);
                                                Throwable v0_27 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.measurement.internal.zzbg.CREATOR.createFromParcel(v8_13));
                                                v8_13.recycle();
                                                if (v0_27 == null) {
                                                } else {
                                                    v7_0.add(new com.google.android.gms.measurement.internal.zzgk(v0_27, v9_2, v3_4));
                                                }
                                            }
                                            v26 = v3_5;
                                            v9_0 = v6_0;
                                            v3_3 = v17_0;
                                            v4_8 = v19_1;
                                            v5_15 = v21_1;
                                            p30 = 1;
                                            v25 = 4;
                                            v6_0 = v0_11;
                                            v0_2 = v20_1;
                                        } catch (Throwable v0_4) {
                                            v17_0 = v6_5;
                                        } catch (android.database.sqlite.SQLiteFullException) {
                                            v17_0 = v6_5;
                                            v6_0 = 0;
                                        } catch (Throwable v0_3) {
                                            v17_0 = v6_5;
                                        }
                                    } else {
                                        v9_2 = v14_2.getString(v26);
                                        v19_2 = v14_2.getLong(v25);
                                    }
                                } catch (Throwable v0_4) {
                                    v17_0 = v3_3;
                                    v19_1 = v4_8;
                                    v21_1 = v5_15;
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException) {
                                    v17_0 = v3_3;
                                    v19_1 = v4_8;
                                    v21_1 = v5_15;
                                } catch (Throwable v0_3) {
                                    v17_0 = v3_3;
                                    v19_1 = v4_8;
                                    v21_1 = v5_15;
                                } catch (android.database.sqlite.SQLiteFullException) {
                                }
                            }
                        } catch (Throwable v0_4) {
                        } catch (Throwable v0_3) {
                        }
                        v17_0 = v3_3;
                        v19_1 = v4_8;
                        v21_1 = v5_15;
                        v6_0 = v9_0;
                        if (v13.delete("messages", "rowid <= ?", new String[] {Long.toString(v22)})) < v7_0.size()) {
                            this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                        }
                        v13.setTransactionSuccessful();
                        v13.endTransaction();
                        v14_2.close();
                        v13.close();
                        return v7_0;
                    } else {
                        this.zzc = 1;
                        return v6_15;
                    }
                }
                v1.a.v(this.zzu, "Failed to read events from database in reasonable time");
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final boolean zzn()
    {
        boolean v0_1 = new byte[0];
        return this.zzs(3, v0_1);
    }

    public final boolean zzo()
    {
        this.zzg();
        if ((!this.zzc) && (this.zzq())) {
            int v4 = 5;
            int v3 = 0;
            while (v3 < 5) {
                try {
                    android.database.sqlite.SQLiteDatabase v5 = this.zzp();
                } catch (String v7_2) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", v7_2);
                    this.zzc = 1;
                    if (v5 == null) {
                        v3++;
                    } else {
                        v5.close();
                    }
                } catch (Throwable v0_2) {
                    if (v5 != null) {
                        v5.close();
                    }
                    throw v0_2;
                } catch (android.database.sqlite.SQLiteFullException) {
                    android.os.SystemClock.sleep(((long) v4));
                    v4 += 20;
                    if (v5 == null) {
                    }
                } catch (String v7_1) {
                    if (v5 != null) {
                        if (v5.inTransaction()) {
                            v5.endTransaction();
                        }
                    }
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", v7_1);
                    this.zzc = 1;
                    if (v5 == null) {
                    } else {
                    }
                }
                if (v5 != null) {
                    v5.beginTransaction();
                    v5.delete("messages", "type == ?", new String[] {Integer.toString(3)}));
                    v5.setTransactionSuccessful();
                    v5.endTransaction();
                    v5.close();
                    return 1;
                } else {
                    this.zzc = 1;
                }
            }
            v1.a.v(this.zzu, "Error deleting app launch break from local database in reasonable time");
        }
        return 0;
    }

    public final android.database.sqlite.SQLiteDatabase zzp()
    {
        if (!this.zzc) {
            int v0_2 = this.zzb.getWritableDatabase();
            if (v0_2 != 0) {
                return v0_2;
            } else {
                this.zzc = 1;
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final boolean zzq()
    {
        boolean v0_0 = this.zzu;
        android.content.Context v1 = v0_0.zzaY();
        v0_0.zzc();
        return v1.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
