package com.google.android.gms.measurement.internal;
public final class zzaw {

    public static void zza(com.google.android.gms.measurement.internal.zzgu p10, android.database.sqlite.SQLiteDatabase p11, String p12, String p13, String p14, String[] p15)
    {
        if (p10 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        } else {
            int v1_0 = 0;
            try {
                String v2 = p11;
                try {
                    int v11_4 = p11.query("SQLITE_MASTER", new String[] {"name"}), "name=?", new String[] {p12}), 0, 0, 0);
                    try {
                        StringBuilder v0_7 = v11_4.moveToFirst();
                        v11_4.close();
                    } catch (StringBuilder v0_5) {
                        p10.zze().zzc("Error querying for table", p12, v0_5);
                        if (v11_4 == 0) {
                            v2.execSQL(p13);
                            String v4_2 = new java.util.HashSet();
                            boolean v6_3 = new StringBuilder((p12.length() + 22));
                            v6_3.append("SELECT * FROM ");
                            v6_3.append(p12);
                            v6_3.append(" LIMIT 0");
                            int v1_1 = v2.rawQuery(v6_3.toString(), 0);
                            java.util.Collections.addAll(v4_2, v1_1.getColumnNames());
                            v1_1.close();
                            String v14_3 = p14.split(",");
                            int v1_2 = 0;
                            int v3_0 = 0;
                            while (v3_0 < v14_3.length) {
                                String v5_3 = v14_3[v3_0];
                                if (!v4_2.remove(v5_3)) {
                                    StringBuilder v0_3 = new StringBuilder(((p12.length() + 35) + String.valueOf(v5_3).length()));
                                    v0_3.append("Table ");
                                    v0_3.append(p12);
                                    v0_3.append(" is missing required column: ");
                                    v0_3.append(v5_3);
                                    throw new android.database.sqlite.SQLiteException(v0_3.toString());
                                } else {
                                    v3_0++;
                                }
                            }
                            if (p15 != 0) {
                                while (v1_2 < p15.length) {
                                    if (!v4_2.remove(p15[v1_2])) {
                                        v2.execSQL(p15[(v1_2 + 1)]);
                                    }
                                    v1_2 += 2;
                                }
                            }
                            if (!v4_2.isEmpty()) {
                                p10.zze().zzc("Table has extra columns. table, columns", p12, android.text.TextUtils.join(", ", v4_2));
                            }
                            return;
                        } else {
                            v11_4.close();
                        }
                    }
                    if (v0_7 != null) {
                    } else {
                    }
                } catch (StringBuilder v0_5) {
                    v11_4 = 0;
                }
            } catch (StringBuilder v0_5) {
                v2 = p11;
            } catch (StringBuilder v0_6) {
                com.google.android.gms.measurement.internal.zzgs v10_3 = v0_6;
                if (v1_0 != 0) {
                    v1_0.close();
                }
                throw v10_3;
            } catch (StringBuilder v0_8) {
                v10_3 = v0_8;
                v1_0 = v11_4;
            }
        }
    }

    public static void zzb(com.google.android.gms.measurement.internal.zzgu p3, android.database.sqlite.SQLiteDatabase p4)
    {
        if (p3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        } else {
            com.google.android.gms.internal.measurement.zzbv.zza();
            java.io.File v0_0 = new java.io.File(p4.getPath());
            if (!v0_0.setReadable(0, 0)) {
                p3.zze().zza("Failed to turn off database read permission");
            }
            if (!v0_0.setWritable(0, 0)) {
                p3.zze().zza("Failed to turn off database write permission");
            }
            if (!v0_0.setReadable(1, 1)) {
                p3.zze().zza("Failed to turn on database read permission for owner");
            }
            if (!v0_0.setWritable(1, 1)) {
                p3.zze().zza("Failed to turn on database write permission for owner");
            }
            return;
        }
    }
}
