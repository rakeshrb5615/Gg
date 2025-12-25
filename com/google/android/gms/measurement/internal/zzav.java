package com.google.android.gms.measurement.internal;
final class zzav extends com.google.android.gms.measurement.internal.zzos {
    static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private static final String[] zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private static final String[] zzl;
    private final com.google.android.gms.measurement.internal.zzau zzm;
    private final com.google.android.gms.measurement.internal.zzog zzn;

    static zzav()
    {
        String v2 = "last_bundled_day";
        String v4 = "last_sampled_complex_event_id";
        String v6 = "last_sampling_rate";
        String v8 = "last_exempt_from_sampling";
        com.google.android.gms.measurement.internal.zzav.zzb = new String[] {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"});
        com.google.android.gms.measurement.internal.zzav.zza = new String[] {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"});
        com.google.android.gms.measurement.internal.zzav.zzc = new String[] {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"});
        String v3 = "app_store";
        String v5 = "gmp_version";
        String v7 = "dev_cert_hash";
        String v9 = "measurement_enabled";
        String v11 = "last_bundle_start_timestamp";
        String v13 = "day";
        String v15 = "daily_public_events_count";
        String v17 = "daily_events_count";
        String v19 = "daily_conversions_count";
        String v21 = "remote_config";
        String v23 = "config_fetched_time";
        String v25 = "failed_config_fetch_time";
        String v27 = "app_version_int";
        String v29 = "firebase_instance_id";
        String v31 = "daily_error_events_count";
        String v33 = "daily_realtime_events_count";
        String v35 = "health_monitor_sample";
        String v37 = "android_id";
        String v39 = "adid_reporting_enabled";
        String v41 = "ssaid_reporting_enabled";
        String v43 = "admob_app_id";
        String v45 = "linked_admob_app_id";
        String v47 = "dynamite_version";
        String v49 = "safelisted_events";
        String v51 = "ga_app_id";
        String v53 = "config_last_modified_time";
        String v55 = "e_tag";
        String v57 = "session_stitching_token";
        String v59 = "sgtm_upload_enabled";
        String v61 = "target_os_version";
        String v63 = "session_stitching_token_hash";
        String v65 = "ad_services_version";
        String v67 = "unmatched_first_open_without_ad_id";
        String v69 = "npa_metadata_value";
        String v71 = "attribution_eligibility_status";
        String v73 = "sgtm_preview_key";
        String v75 = "dma_consent_state";
        String v77 = "daily_realtime_dcu_count";
        String v79 = "bundle_delivery_index";
        String v81 = "serialized_npa_metadata";
        String v83 = "unmatched_pfo";
        String v85 = "unmatched_uwa";
        String v87 = "ad_campaign_info";
        String v89 = "daily_registered_triggers_count";
        String v91 = "client_upload_eligibility";
        com.google.android.gms.measurement.internal.zzav.zzd = new String[] {"app_version", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"});
        com.google.android.gms.measurement.internal.zzav.zze = new String[] {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"});
        com.google.android.gms.measurement.internal.zzav.zzf = new String[] {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"});
        com.google.android.gms.measurement.internal.zzav.zzh = new String[] {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"});
        com.google.android.gms.measurement.internal.zzav.zzi = new String[] {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"});
        com.google.android.gms.measurement.internal.zzav.zzj = new String[] {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"});
        v3 = "dma_consent_settings";
        com.google.android.gms.measurement.internal.zzav.zzk = new String[] {"consent_source", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"});
        com.google.android.gms.measurement.internal.zzav.zzl = new String[] {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"});
        return;
    }

    public zzav(com.google.android.gms.measurement.internal.zzpg p3)
    {
        super(p3);
        super.zzn = new com.google.android.gms.measurement.internal.zzog(super.zzu.zzaZ());
        super.zzu.zzc();
        super.zzm = new com.google.android.gms.measurement.internal.zzau(super, super.zzu.zzaY(), "google_app_measurement.db");
        return;
    }

    private final String zzaA(String p3, String[] p4, String p5)
    {
        try {
            android.database.Cursor v0 = this.zze().rawQuery(p3, p4);
        } catch (int v4_3) {
            this.zzu.zzaV().zzb().zzc("Database error", p3, v4_3);
            throw v4_3;
        } catch (String v3_1) {
            if (v0 != null) {
                v0.close();
            }
            throw v3_1;
        }
        if (!v0.moveToFirst()) {
            v0.close();
            return "";
        } else {
            String v3_3 = v0.getString(0);
            v0.close();
            return v3_3;
        }
    }

    private final void zzaB(String p7, String p8, android.content.ContentValues p9)
    {
        Object v1_2 = this.zze();
        Object v2_4 = p9.getAsString("app_id");
        if (v2_4 != null) {
            long v3_0 = new StringBuilder(10);
            v3_0.append("app_id = ?");
            if ((((long) v1_2.update("consent_settings", p9, v3_0.toString(), new String[] {v2_4}))) == 0) && (v1_2.insertWithOnConflict("consent_settings", 0, p9, 5) == -1)) {
                this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", com.google.android.gms.measurement.internal.zzgu.zzl("consent_settings"), com.google.android.gms.measurement.internal.zzgu.zzl("app_id"));
            }
            return;
        } else {
            this.zzu.zzaV().zzd().zzb("Value of the primary key is not set.", com.google.android.gms.measurement.internal.zzgu.zzl("app_id"));
            return;
        }
    }

    private final com.google.android.gms.measurement.internal.zzbc zzaC(String p30, String p31, String p32)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p31);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p32);
        this.zzg();
        this.zzaw();
        String v4 = "last_fire_timestamp";
        long v6 = "last_bundled_day";
        long v8 = "last_sampling_rate";
        int v2_0 = 0;
        try {
            int v11 = 0;
            String v4_5 = new String[0];
            int v3_1 = this.zze().query(p30, ((String[]) new java.util.ArrayList(java.util.Arrays.asList(new String[] {"lifetime_count", "current_session_count"}))).toArray(v4_5)), "app_id=? and name=?", new String[] {p31, p32}), 0, 0, 0);
        } catch (com.google.android.gms.measurement.internal.zzgs v0_6) {
            v3_1 = 0;
            String v4_2 = this.zzu;
            v4_2.zzaV().zzb().zzd("Error querying events. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p31), v4_2.zzl().zza(p32), v0_6);
            if (v3_1 != 0) {
                v3_1.close();
            }
            return 0;
        } catch (com.google.android.gms.measurement.internal.zzgs v0_7) {
            if (v2_0 != 0) {
                v2_0.close();
            }
            throw v0_7;
        }
        if (v3_1.moveToFirst()) {
            long v23;
            long v15 = v3_1.getLong(0);
            long v17 = v3_1.getLong(1);
            long v21 = v3_1.getLong(2);
            long v6_0 = 0;
            if (!v3_1.isNull(3)) {
                v23 = v3_1.getLong(3);
            } else {
                v23 = 0;
            }
            Long v25;
            if (!v3_1.isNull(4)) {
                v25 = Long.valueOf(v3_1.getLong(4));
            } else {
                v25 = 0;
            }
            Long v26;
            if (!v3_1.isNull(5)) {
                v26 = Long.valueOf(v3_1.getLong(5));
            } else {
                v26 = 0;
            }
            Long v27;
            if (!v3_1.isNull(6)) {
                v27 = Long.valueOf(v3_1.getLong(6));
            } else {
                v27 = 0;
            }
            Boolean v28;
            if (v3_1.isNull(7)) {
                v28 = 0;
            } else {
                if (v3_1.getLong(7) == 1) {
                    v11 = 1;
                }
                v28 = Boolean.valueOf(v11);
            }
            if (!v3_1.isNull(8)) {
                v6_0 = v3_1.getLong(8);
            }
            com.google.android.gms.measurement.internal.zzbc v12_1 = new com.google.android.gms.measurement.internal.zzbc(p31, p32, v15, v17, v6_0, v21, v23, v25, v26, v27, v28);
            if (v3_1.moveToNext()) {
                this.zzu.zzaV().zzb().zzb("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p31));
            }
            v3_1.close();
            return v12_1;
        } else {
        }
    }

    private final void zzaD(String p7, com.google.android.gms.measurement.internal.zzbc p8)
    {
        long v2_15;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        this.zzg();
        this.zzaw();
        com.google.android.gms.measurement.internal.zzgs v0_1 = new android.content.ContentValues();
        String v1_0 = p8.zza;
        v0_1.put("app_id", v1_0);
        v0_1.put("name", p8.zzb);
        v0_1.put("lifetime_count", Long.valueOf(p8.zzc));
        v0_1.put("current_bundle_count", Long.valueOf(p8.zzd));
        v0_1.put("last_fire_timestamp", Long.valueOf(p8.zzf));
        v0_1.put("last_bundled_timestamp", Long.valueOf(p8.zzg));
        v0_1.put("last_bundled_day", p8.zzh);
        v0_1.put("last_sampled_complex_event_id", p8.zzi);
        v0_1.put("last_sampling_rate", p8.zzj);
        v0_1.put("current_session_count", Long.valueOf(p8.zze));
        long v2_13 = p8.zzk;
        if ((v2_13 == 0) || (!v2_13.booleanValue())) {
            v2_15 = 0;
        } else {
            v2_15 = Long.valueOf(1);
        }
        v0_1.put("last_exempt_from_sampling", v2_15);
        try {
            if (this.zze().insertWithOnConflict(p7, 0, v0_1, 5) != -1) {
                return;
            } else {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(v1_0));
                return;
            }
        } catch (com.google.android.gms.measurement.internal.zzgs v7_2) {
            this.zzu.zzaV().zzb().zzc("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p8.zza), v7_2);
            return;
        }
    }

    private final void zzaE(String p4, String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        this.zzg();
        this.zzaw();
        try {
            this.zze().delete(p4, "app_id=?", new String[] {p5}));
            return;
        } catch (android.database.sqlite.SQLiteException v4_1) {
            this.zzu.zzaV().zzb().zzc("Error deleting snapshot. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5), v4_1);
            return;
        }
    }

    private final com.google.android.gms.measurement.internal.zzpj zzaF(String p14, long p15, byte[] p17, String p18, String p19, int p20, int p21, long p22, long p24, long p26)
    {
        if (!android.text.TextUtils.isEmpty(p18)) {
            String v2_2 = ((com.google.android.gms.internal.measurement.zzhz) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), p17));
            long v4_0 = com.google.android.gms.measurement.internal.zzls.zzb(p20);
            if ((v4_0 != com.google.android.gms.measurement.internal.zzls.zzb) && ((v4_0 != com.google.android.gms.measurement.internal.zzls.zze) && (p21 > 0))) {
                java.util.ArrayList v5_3 = new java.util.ArrayList();
                String v6_1 = v2_2.zza().iterator();
                while (v6_1.hasNext()) {
                    com.google.android.gms.internal.measurement.zzid v7_5 = ((com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) v6_1.next()).zzcl());
                    v7_5.zzao(p21);
                    v5_3.add(((com.google.android.gms.internal.measurement.zzid) v7_5.zzbc()));
                }
                v2_2.zzg();
                v2_2.zzf(v5_3);
            }
            java.util.ArrayList v5_5 = new java.util.HashMap();
            if (p19 != null) {
                com.google.android.gms.measurement.internal.zzgs v0_2 = p19.split("\r\n");
                String v6_3 = v0_2.length;
                int v8 = 0;
                while (v8 < v6_3) {
                    String v9_0 = v0_2[v8];
                    if (!v9_0.isEmpty()) {
                        String v10_2 = v9_0.split("=", 2);
                        if (v10_2.length == 2) {
                            v5_5.put(v10_2[0], v10_2[1]);
                            v8++;
                        } else {
                            this.zzu.zzaV().zzb().zzb("Invalid upload header: ", v9_0);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            com.google.android.gms.measurement.internal.zzgs v0_7 = new com.google.android.gms.measurement.internal.zzpi();
            v0_7.zzb(p15);
            v0_7.zzc(((com.google.android.gms.internal.measurement.zzib) v2_2.zzbc()));
            v0_7.zzd(p18);
            v0_7.zze(v5_5);
            v0_7.zzf(v4_0);
            v0_7.zzg(p22);
            v0_7.zzh(p24);
            v0_7.zzi(p26);
            v0_7.zzj(p21);
            return v0_7.zza();
        } else {
            this.zzu.zzaV().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return 0;
        }
    }

    private final String zzaG()
    {
        String v0_0 = this.zzu;
        String v1_1 = v0_0.zzaZ().currentTimeMillis();
        StringBuilder v3_3 = com.google.android.gms.measurement.internal.zzls.zzb;
        String v4_1 = v3_3.zza();
        v0_0.zzc();
        String v5_2 = ((Long) com.google.android.gms.measurement.internal.zzfy.zzS.zzb(0));
        v5_2.longValue();
        String v6_2 = new StringBuilder("(upload_type = ");
        v6_2.append(v4_1);
        v6_2.append(" AND ABS(creation_timestamp - ");
        v6_2.append(v1_1);
        v6_2.append(") > ");
        v6_2.append(v5_2);
        v6_2.append(")");
        String v6_3 = v6_2.toString();
        StringBuilder v3_0 = v3_3.zza();
        v0_0.zzc();
        long v8 = com.google.android.gms.measurement.internal.zzal.zzI();
        String v0_2 = new StringBuilder("(upload_type != ");
        v0_2.append(v3_0);
        v0_2.append(" AND ABS(creation_timestamp - ");
        v0_2.append(v1_1);
        v0_2.append(") > ");
        v0_2.append(v8);
        v0_2.append(")");
        String v0_3 = v0_2.toString();
        StringBuilder v3_2 = new StringBuilder((((v6_3.length() + 5) + v0_3.length()) + 1));
        v3_2.append("(");
        v3_2.append(v6_3);
        v3_2.append(" OR ");
        v3_2.append(v0_3);
        v3_2.append(")");
        return v3_2.toString();
    }

    private static final String zzaH(java.util.List p2)
    {
        if (!p2.isEmpty()) {
            return v1.a.l(" AND (upload_type IN (", android.text.TextUtils.join(", ", p2), "))");
        } else {
            return "";
        }
    }

    public static synthetic String[] zzai()
    {
        return com.google.android.gms.measurement.internal.zzav.zzb;
    }

    public static synthetic String[] zzaj()
    {
        return com.google.android.gms.measurement.internal.zzav.zzc;
    }

    public static synthetic String[] zzak()
    {
        return com.google.android.gms.measurement.internal.zzav.zzd;
    }

    public static synthetic String[] zzal()
    {
        return com.google.android.gms.measurement.internal.zzav.zze;
    }

    public static synthetic String[] zzam()
    {
        return com.google.android.gms.measurement.internal.zzav.zzf;
    }

    public static synthetic String[] zzan()
    {
        return com.google.android.gms.measurement.internal.zzav.zzh;
    }

    public static synthetic String[] zzao()
    {
        return com.google.android.gms.measurement.internal.zzav.zzi;
    }

    public static synthetic String[] zzap()
    {
        return com.google.android.gms.measurement.internal.zzav.zzj;
    }

    public static synthetic String[] zzaq()
    {
        return com.google.android.gms.measurement.internal.zzav.zzk;
    }

    public static synthetic String[] zzar()
    {
        return com.google.android.gms.measurement.internal.zzav.zzl;
    }

    public static final void zzau(android.content.ContentValues p1, String p2, Object p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("value");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        if (!(p3 instanceof String)) {
            if (!(p3 instanceof Long)) {
                if (!(p3 instanceof Double)) {
                    throw new IllegalArgumentException("Invalid value type");
                } else {
                    p1.put("value", ((Double) p3));
                    return;
                }
            } else {
                p1.put("value", ((Long) p3));
                return;
            }
        } else {
            p1.put("value", ((String) p3));
            return;
        }
    }

    private final long zzay(String p4, String[] p5)
    {
        try {
            android.database.Cursor v1 = this.zze().rawQuery(p4, p5);
        } catch (android.database.sqlite.SQLiteException v5_2) {
            this.zzu.zzaV().zzb().zzc("Database error", p4, v5_2);
            throw v5_2;
        } catch (long v4_1) {
            if (v1 != null) {
                v1.close();
            }
            throw v4_1;
        }
        if (!v1.moveToFirst()) {
            throw new android.database.sqlite.SQLiteException("Database returned empty set");
        } else {
            long v4_2 = v1.getLong(0);
            v1.close();
            return v4_2;
        }
    }

    private final long zzaz(String p3, String[] p4, long p5)
    {
        try {
            android.database.Cursor v1 = this.zze().rawQuery(p3, p4);
        } catch (int v4_1) {
            this.zzu.zzaV().zzb().zzc("Database error", p3, v4_1);
            throw v4_1;
        } catch (Throwable v3_1) {
            if (v1 != null) {
                v1.close();
            }
            throw v3_1;
        }
        if (v1.moveToFirst()) {
            p5 = v1.getLong(0);
        }
        v1.close();
        return p5;
    }

    public final long zzA(String p12, com.google.android.gms.internal.measurement.zzib p13, String p14, java.util.Map p15, com.google.android.gms.measurement.internal.zzls p16, Long p17)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p13);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p12);
        this.zzg();
        this.zzaw();
        if (this.zzag()) {
            android.database.sqlite.SQLiteException v0_0 = this.zzg;
            android.database.sqlite.SQLiteDatabase v4_7 = v0_0.zzq().zzb.zza();
            String v6_4 = this.zzu;
            int v7_3 = v6_4.zzaZ().elapsedRealtime();
            android.database.sqlite.SQLiteDatabase v4_10 = Math.abs((v7_3 - v4_7));
            v6_4.zzc();
            if (v4_10 > com.google.android.gms.measurement.internal.zzal.zzJ()) {
                v0_0.zzq().zzb.zzb(v7_3);
                this.zzg();
                this.zzaw();
                if (this.zzag()) {
                    String v5_3 = new String[0];
                    android.database.sqlite.SQLiteException v0_10 = this.zze().delete("upload_queue", this.zzaG(), v5_3);
                    if (v0_10 > null) {
                        v6_4.zzaV().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(v0_10));
                    }
                }
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p12);
                this.zzg();
                this.zzaw();
                try {
                    android.database.sqlite.SQLiteException v0_13 = v6_4.zzc().zzm(p12, com.google.android.gms.measurement.internal.zzfy.zzz);
                } catch (android.database.sqlite.SQLiteException v0_14) {
                    this.zzu.zzaV().zzb().zzc("Error deleting over the limit queued batches. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p12), v0_14);
                }
                if (v0_13 > null) {
                    this.zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[] {p12, String.valueOf(v0_13)}));
                }
            }
        }
        android.database.sqlite.SQLiteException v0_19 = new java.util.ArrayList();
        String v15_3 = p15.entrySet().iterator();
        while (v15_3.hasNext()) {
            android.database.sqlite.SQLiteDatabase v4_4 = ((java.util.Map$Entry) v15_3.next());
            String v5_1 = ((String) v4_4.getKey());
            android.database.sqlite.SQLiteDatabase v4_6 = ((String) v4_4.getValue());
            StringBuilder v8_1 = new StringBuilder(((String.valueOf(v5_1).length() + 1) + String.valueOf(v4_6).length()));
            v8_1.append(v5_1);
            v8_1.append("=");
            v8_1.append(v4_6);
            v0_19.add(v8_1.toString());
        }
        com.google.android.gms.measurement.internal.zzgs v13_10 = p13.zzcc();
        String v15_5 = new android.content.ContentValues();
        v15_5.put("app_id", p12);
        v15_5.put("measurement_batch", v13_10);
        v15_5.put("upload_uri", p14);
        v15_5.put("upload_headers", String.join("\r\n", v0_19));
        v15_5.put("upload_type", Integer.valueOf(p16.zza()));
        com.google.android.gms.measurement.internal.zzgs v13_6 = this.zzu;
        v15_5.put("creation_timestamp", Long.valueOf(v13_6.zzaZ().currentTimeMillis()));
        v15_5.put("retry_count", Integer.valueOf(0));
        if (p17 != null) {
            v15_5.put("associated_row_id", p17);
        }
        String v1_1 = -1;
        try {
            com.google.android.gms.measurement.internal.zzgs v14_8 = this.zze().insert("upload_queue", 0, v15_5);
        } catch (android.database.sqlite.SQLiteException v0_5) {
            this.zzu.zzaV().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", p12, v0_5);
            return -1;
        }
        if (v14_8 != -1) {
            v1_1 = v14_8;
        } else {
            v13_6.zzaV().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", p12);
        }
        return v1_1;
    }

    public final com.google.android.gms.measurement.internal.zzpj zzB(long p19)
    {
        this.zzg();
        this.zzaw();
        int v1 = 0;
        try {
            Long v6 = "measurement_batch";
            String v8 = "upload_headers";
            int v10 = "retry_count";
            long v12 = "associated_row_id";
            int v2_0 = this.zze().query("upload_queue", new String[] {"rowId", "last_upload_timestamp"}), "rowId=?", new String[] {String.valueOf(p19)}), 0, 0, 0, "1");
            try {
                if (v2_0.moveToFirst()) {
                    Throwable v0_15 = this.zzaF(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_0.getString(1))), p19, v2_0.getBlob(2), v2_0.getString(3), v2_0.getString(4), v2_0.getInt(5), v2_0.getInt(6), v2_0.getLong(7), v2_0.getLong(8), v2_0.getLong(9));
                    v2_0.close();
                    return v0_15;
                } else {
                    if (v2_0 != 0) {
                        v2_0.close();
                    }
                    return 0;
                }
            } catch (Throwable v0_2) {
                try {
                    this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(p19), v0_2);
                } catch (Throwable v0_1) {
                    v1 = v2_0;
                    if (v1 != 0) {
                        v1.close();
                    }
                    throw v0_1;
                }
            } catch (Throwable v0_1) {
            }
        } catch (Throwable v0_2) {
            v2_0 = 0;
        } catch (Throwable v0_1) {
        }
    }

    public final java.util.List zzC(String p19, com.google.android.gms.measurement.internal.zzoo p20, int p21)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p19);
        this.zzg();
        this.zzaw();
        android.database.Cursor v2 = 0;
        try {
            int v11_0;
            com.google.android.gms.measurement.internal.zzav v3_0 = this.zze();
            byte[] v7 = "measurement_batch";
            String v9 = "upload_headers";
            int v11 = "retry_count";
            String v13 = "associated_row_id";
            String v6_2 = com.google.android.gms.measurement.internal.zzav.zzaH(p20.zza);
            byte[] v7_0 = this.zzaG();
            String v9_2 = new StringBuilder(((String.valueOf(v6_2).length() + 17) + v7_0.length()));
            v9_2.append("app_id=?");
            v9_2.append(v6_2);
            v9_2.append(" AND NOT ");
            v9_2.append(v7_0);
            String v6_3 = v9_2.toString();
        } catch (Throwable v0_5) {
            try {
                this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", p19, v0_5);
                Throwable v0_0 = java.util.Collections.EMPTY_LIST;
            } catch (Throwable v0_1) {
                if (v2 != null) {
                    v2.close();
                }
                throw v0_1;
            }
            if (v2 != null) {
                v2.close();
            }
            return v0_0;
        } catch (Throwable v0_1) {
        }
        if (p21 <= 0) {
            v11_0 = 0;
        } else {
            v11_0 = String.valueOf(p21);
        }
        v2 = v3_0.query("upload_queue", new String[] {"rowId", "last_upload_timestamp"}), v6_3, new String[] {p19, p19}), 0, 0, "creation_timestamp ASC", v11_0);
        v0_0 = new java.util.ArrayList();
        while (v2.moveToNext()) {
            com.google.android.gms.measurement.internal.zzpj v1_12 = this.zzaF(p19, v2.getLong(0), v2.getBlob(2), v2.getString(3), v2.getString(4), v2.getInt(5), v2.getInt(6), v2.getLong(7), v2.getLong(8), v2.getLong(9));
            if (v1_12 != null) {
                v0_0.add(v1_12);
            }
        }
    }

    public final boolean zzD(String p8)
    {
        String v1_2 = new java.util.ArrayList(1);
        v1_2.add(Integer.valueOf(new com.google.android.gms.measurement.internal.zzls[] {com.google.android.gms.measurement.internal.zzls.zzb})[0].zza()));
        long v0_2 = com.google.android.gms.measurement.internal.zzav.zzaH(v1_2);
        String v1_0 = this.zzaG();
        StringBuilder v6_1 = new StringBuilder(((String.valueOf(v0_2).length() + 61) + v1_0.length()));
        v6_1.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        v6_1.append(v0_2);
        v6_1.append(" AND NOT ");
        v6_1.append(v1_0);
        if (this.zzay(v6_1.toString(), new String[] {p8})) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzE(Long p4)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        try {
            if (this.zze().delete("upload_queue", "rowid=?", new String[] {p4.toString()})) == 1) {
                return;
            } else {
                this.zzu.zzaV().zze().zza("Deleted fewer rows from upload_queue than expected");
                return;
            }
        } catch (com.google.android.gms.measurement.internal.zzgs v4_2) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", v4_2);
            throw v4_2;
        }
    }

    public final String zzF()
    {
        Throwable v1_0 = 0;
        try {
            String v0_2 = this.zze().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", 0);
            try {
                if (!v0_2.moveToFirst()) {
                    if (v0_2 != null) {
                        v0_2.close();
                    }
                    return 0;
                } else {
                    Throwable v1_2 = v0_2.getString(0);
                    v0_2.close();
                    return v1_2;
                }
            } catch (int v2_1) {
                this.zzu.zzaV().zzb().zzb("Database error getting next bundle app id", v2_1);
            }
        } catch (String v0_3) {
            v2_1 = v0_3;
            v0_2 = 0;
        } catch (String v0_1) {
            if (v1_0 != null) {
                v1_0.close();
            }
            throw v0_1;
        } catch (Throwable v1_1) {
            v1_0 = v0_2;
            v0_1 = v1_1;
        }
    }

    public final boolean zzG()
    {
        if (this.zzay("select count(1) > 0 from queue where has_realtime = 1", 0) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzH(long p3)
    {
        this.zzg();
        this.zzaw();
        try {
            if (this.zze().delete("queue", "rowid=?", new String[] {String.valueOf(p3)})) != 1) {
                throw new android.database.sqlite.SQLiteException("Deleted fewer rows from queue than expected");
            } else {
                return;
            }
        } catch (android.database.sqlite.SQLiteException v3_4) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a bundle in a queue table", v3_4);
            throw v3_4;
        }
    }

    public final void zzI()
    {
        this.zzg();
        this.zzaw();
        if (this.zzag()) {
            Integer v0_5 = this.zzg;
            com.google.android.gms.measurement.internal.zzgs v1_0 = v0_5.zzq().zza.zza();
            com.google.android.gms.measurement.internal.zzic v3 = this.zzu;
            String v4_1 = v3.zzaZ().elapsedRealtime();
            com.google.android.gms.measurement.internal.zzgs v1_2 = Math.abs((v4_1 - v1_0));
            v3.zzc();
            if (v1_2 > com.google.android.gms.measurement.internal.zzal.zzJ()) {
                v0_5.zzq().zza.zzb(v4_1);
                this.zzg();
                this.zzaw();
                if (this.zzag()) {
                    Integer v0_4 = this.zze();
                    com.google.android.gms.measurement.internal.zzgs v1_6 = String.valueOf(v3.zzaZ().currentTimeMillis());
                    v3.zzc();
                    Integer v0_6 = v0_4.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] {v1_6, String.valueOf(com.google.android.gms.measurement.internal.zzal.zzI())}));
                    if (v0_6 > null) {
                        v3.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(v0_6));
                    }
                }
            }
        }
        return;
    }

    public final void zzJ(java.util.List p7)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.common.internal.Preconditions.checkNotZero(p7.size());
        if (this.zzag()) {
            android.database.sqlite.SQLiteException v7_1 = android.text.TextUtils.join(",", p7);
            android.database.sqlite.SQLiteException v7_2 = v1.a.o(new StringBuilder((String.valueOf(v7_1).length() + 2)), "(", v7_1, ")");
            if (this.zzay(v1.a.o(new StringBuilder((v7_2.length() + 80)), "SELECT COUNT(1) FROM queue WHERE rowid IN ", v7_2, " AND retry_count =  2147483647 LIMIT 1"), 0) > 0) {
                v1.a.v(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase v2_12 = this.zze();
                StringBuilder v4_4 = new StringBuilder((v7_2.length() + 127));
                v4_4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                v4_4.append(v7_2);
                v4_4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v2_12.execSQL(v4_4.toString());
                return;
            } catch (android.database.sqlite.SQLiteException v7_4) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", v7_4);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzK(Long p10)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        if (this.zzag()) {
            int v5_1 = new StringBuilder((p10.toString().length() + 86));
            v5_1.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            v5_1.append(p10);
            v5_1.append(" AND retry_count =  2147483647 LIMIT 1");
            if (this.zzay(v5_1.toString(), 0) > 0) {
                v1.a.v(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase v4_9 = this.zze();
                int v5_6 = this.zzu.zzaZ().currentTimeMillis();
                StringBuilder v8_1 = new StringBuilder((String.valueOf(v5_6).length() + 60));
                v8_1.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                v8_1.append(v5_6);
                com.google.android.gms.measurement.internal.zzgs v0_1 = v8_1.toString();
                StringBuilder v6_4 = new StringBuilder((((v0_1.length() + 34) + p10.toString().length()) + 29));
                v6_4.append("UPDATE upload_queue");
                v6_4.append(v0_1);
                v6_4.append(" WHERE rowid = ");
                v6_4.append(p10);
                v6_4.append(" AND retry_count < 2147483647");
                v4_9.execSQL(v6_4.toString());
                return;
            } catch (android.database.sqlite.SQLiteException v10_2) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", v10_2);
                return;
            }
        } else {
            return;
        }
    }

    public final Object zzL(android.database.Cursor p4, int p5)
    {
        String v0_0 = p4.getType(p5);
        if (v0_0 == null) {
            v1.a.s(this.zzu, "Loaded invalid null value from database");
            return 0;
        } else {
            if (v0_0 == 1) {
                return Long.valueOf(p4.getLong(p5));
            } else {
                if (v0_0 == 2) {
                    return Double.valueOf(p4.getDouble(p5));
                } else {
                    if (v0_0 == 3) {
                        return p4.getString(p5);
                    } else {
                        if (v0_0 == 4) {
                            v1.a.s(this.zzu, "Loaded invalid blob type value, ignoring it");
                            return 0;
                        } else {
                            this.zzu.zzaV().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(v0_0));
                            return 0;
                        }
                    }
                }
            }
        }
    }

    public final long zzM()
    {
        return this.zzaz("select max(bundle_end_timestamp) from queue", 0, 0);
    }

    public final long zzN(String p12, String p13)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p12);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("first_open_count");
        this.zzg();
        this.zzaw();
        android.database.sqlite.SQLiteDatabase v1 = this.zze();
        v1.beginTransaction();
        long v2_1 = 0;
        try {
            String v4_1 = new StringBuilder(48);
            v4_1.append("select first_open_count from app2 where app_id=?");
            long v5_1 = -1;
            long v7_0 = this.zzaz(v4_1.toString(), new String[] {p12}), -1);
        } catch (com.google.android.gms.measurement.internal.zzgs v13_6) {
            this.zzu.zzaV().zzb().zzd("Error inserting column. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p12), "first_open_count", v13_6);
            v5_1 = v2_1;
            v1.endTransaction();
            return v5_1;
        } catch (Object v12_2) {
            v1.endTransaction();
            throw v12_2;
        }
        if (v7_0 == -1) {
            com.google.android.gms.measurement.internal.zzgs v13_4 = new android.content.ContentValues();
            v13_4.put("app_id", p12);
            long v7_2 = Integer.valueOf(0);
            v13_4.put("first_open_count", v7_2);
            v13_4.put("previous_install_count", v7_2);
            if (v1.insertWithOnConflict("app2", 0, v13_4, 5) != -1) {
                v7_0 = 0;
            } else {
                this.zzu.zzaV().zzb().zzc("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p12), "first_open_count");
                v1.endTransaction();
                return v5_1;
            }
        }
        com.google.android.gms.measurement.internal.zzgs v13_8 = new android.content.ContentValues();
        v13_8.put("app_id", p12);
        v13_8.put("first_open_count", Long.valueOf((1 + v7_0)));
        if (((long) v1.update("app2", v13_8, "app_id = ?", new String[] {p12}))) != 0) {
            v1.setTransactionSuccessful();
            v5_1 = v7_0;
            v1.endTransaction();
            return v5_1;
        } else {
            this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p12), "first_open_count");
            v1.endTransaction();
            return v5_1;
        }
    }

    public final long zzO()
    {
        return this.zzaz("select max(timestamp) from raw_events", 0, 0);
    }

    public final boolean zzP()
    {
        if (this.zzay("select count(1) > 0 from raw_events", 0) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzQ(String p3, String p4)
    {
        if (this.zzay("select count(1) from raw_events where app_id = ? and name = ?", new String[] {p3, p4})) <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzR()
    {
        if (this.zzay("select count(1) > 0 from raw_events where realtime = 1", 0) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzS(String p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        return this.zzaz("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[] {p4}), 0);
    }

    public final boolean zzT(String p6, Long p7, long p8, com.google.android.gms.internal.measurement.zzhs p10)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.measurement.internal.zzic v0 = this.zzu;
        String v10_4 = p10.zzcc();
        v0.zzaV().zzk().zzc("Saving complex main event, appId, data size", v0.zzl().zza(p6), Integer.valueOf(v10_4.length));
        long v1_2 = new android.content.ContentValues();
        v1_2.put("app_id", p6);
        v1_2.put("event_id", p7);
        v1_2.put("children_to_process", Long.valueOf(p8));
        v1_2.put("main_event", v10_4);
        try {
            if (this.zze().insertWithOnConflict("main_event_params", 0, v1_2, 5) != -1) {
                return 1;
            } else {
                v0.zzaV().zzb().zzb("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6));
                return 0;
            }
        } catch (com.google.android.gms.measurement.internal.zzgs v8_5) {
            this.zzu.zzaV().zzb().zzc("Error storing complex main event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6), v8_5);
            return 0;
        }
    }

    public final android.os.Bundle zzU(String p6)
    {
        this.zzg();
        this.zzaw();
        int v0 = 0;
        try {
            int v1_0 = this.zze().rawQuery("select parameters from default_event_params where app_id=?", new String[] {p6}));
        } catch (Object v6_2) {
            v1_0 = 0;
            this.zzu.zzaV().zzb().zzb("Error selecting default event parameters", v6_2);
            if (v1_0 != 0) {
                v1_0.close();
            }
            return 0;
        } catch (Object v6_1) {
            if (v0 != 0) {
                v0.close();
            }
            throw v6_1;
        }
        if (v1_0.moveToFirst()) {
            try {
                java.io.IOException v2_6 = ((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), v1_0.getBlob(0))).zzbc());
            } catch (java.io.IOException v2_7) {
                this.zzu.zzaV().zzb().zzc("Failed to retrieve default event parameters. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6), v2_7);
            }
            this.zzg.zzp();
            Object v6_6 = com.google.android.gms.measurement.internal.zzpk.zzE(v2_6.zza());
            v1_0.close();
            return v6_6;
        } else {
            this.zzu.zzaV().zzk().zza("Default event parameters not found");
        }
    }

    public final boolean zzV(String p6, long p7)
    {
        try {
            long v3 = 0;
        } catch (int v6_5) {
            this.zzu.zzaV().zzb().zzb("Error checking backfill conditions", v6_5);
            return 0;
        }
        if (this.zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;", new String[] {p6, String.valueOf(p7)}), 0) <= 0) {
            if (this.zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;", new String[] {p6, String.valueOf(p7)}), v3) <= v3) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final void zzW(String p25, Long p26, String p27, android.os.Bundle p28)
    {
        com.google.android.gms.measurement.internal.zzgs v0_3;
        String v5_0 = p25;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p28);
        this.zzg();
        this.zzaw();
        if (p26 == null) {
            v0_3 = new com.google.android.gms.measurement.internal.zzat(this, p25);
        } else {
            v0_3 = new com.google.android.gms.measurement.internal.zzat(this, p25, p26.longValue());
        }
        com.google.android.gms.measurement.internal.zzat v12 = v0_3;
        com.google.android.gms.measurement.internal.zzgs v0_7 = v12.zza();
        while (!v0_7.isEmpty()) {
            java.util.Iterator v13 = v0_7.iterator();
            while (v13.hasNext()) {
                String v14_2 = ((com.google.android.gms.measurement.internal.zzas) v13.next());
                if (!android.text.TextUtils.isEmpty(p27)) {
                    String v4_0 = 0;
                    try {
                        Object v2_18 = this.zze().query("raw_events_metadata", new String[] {"metadata"}), "app_id = ? and metadata_fingerprint = ?", new String[] {v5_0, Long.toString(v14_2.zzb)}), 0, 0, "rowid", "2");
                        try {
                            if (v2_18.moveToFirst()) {
                                try {
                                    Long v3_1 = ((com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), v2_18.getBlob(0))).zzbc());
                                } catch (com.google.android.gms.measurement.internal.zzgs v0_27) {
                                    this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v5_0), v0_27);
                                }
                                if (v2_18.moveToNext()) {
                                    this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v5_0));
                                }
                                v2_18.close();
                                v2_18.close();
                                v4_0 = v3_1;
                                if (v4_0 != null) {
                                    com.google.android.gms.measurement.internal.zzgs v0_5 = v4_0.zzf().iterator();
                                    while (v0_5.hasNext()) {
                                        if (((com.google.android.gms.internal.measurement.zziu) v0_5.next()).zzc().equals(p27)) {
                                        }
                                    }
                                }
                                com.google.android.gms.measurement.internal.zzgs v0_6 = this.zzg;
                                Object v2_5 = v0_6.zzp();
                                Long v3_2 = v14_2.zzd;
                                byte[] v9_1 = new android.os.Bundle();
                                String v4_2 = v3_2.zza().iterator();
                                while (v4_2.hasNext()) {
                                    Object v6_11 = ((com.google.android.gms.internal.measurement.zzhw) v4_2.next());
                                    if (!v6_11.zzi()) {
                                        if (!v6_11.zzg()) {
                                            if (!v6_11.zze()) {
                                                if (!v6_11.zzc()) {
                                                    if (v6_11.zzk().isEmpty()) {
                                                        v2_5.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", v6_11);
                                                    } else {
                                                        v9_1.putParcelableArray(v6_11.zzb(), com.google.android.gms.measurement.internal.zzpk.zzy(v6_11.zzk()));
                                                    }
                                                } else {
                                                    v9_1.putString(v6_11.zzb(), v6_11.zzd());
                                                }
                                            } else {
                                                v9_1.putLong(v6_11.zzb(), v6_11.zzf());
                                            }
                                        } else {
                                            v9_1.putFloat(v6_11.zzb(), v6_11.zzh());
                                        }
                                    } else {
                                        v9_1.putDouble(v6_11.zzb(), v6_11.zzj());
                                    }
                                }
                                String v4_3 = v9_1.getString("_o");
                                v9_1.remove("_o");
                                com.google.android.gms.measurement.internal.zzgs v7_1 = v3_2.zzd();
                                if (v4_3 == null) {
                                    v4_3 = "";
                                }
                                String v4_7;
                                Object v6_4 = new com.google.android.gms.measurement.internal.zzgv(v7_1, v4_3, v9_1, v3_2.zzf());
                                Object v2_8 = this.zzu;
                                String v11_0 = v6_4.zzd;
                                String v4_4 = v6_4.zza;
                                com.google.android.gms.measurement.internal.zzgs v7_2 = v2_8.zzk();
                                if (v4_4.equals("_cmp")) {
                                    v4_7 = new android.os.Bundle(p28);
                                    byte[] v9_3 = p28.keySet().iterator();
                                    while (v9_3.hasNext()) {
                                        String v10_3 = ((String) v9_3.next());
                                        boolean v16_0 = v0_6;
                                        if (v10_3.startsWith("gad_")) {
                                            v4_7.remove(v10_3);
                                        }
                                        v0_6 = v16_0;
                                    }
                                } else {
                                    v4_7 = p28;
                                }
                                boolean v16_1 = v0_6;
                                v7_2.zzI(v11_0, v4_7);
                                com.google.android.gms.measurement.internal.zzgs v0_10 = v3_2;
                                com.google.android.gms.measurement.internal.zzgs v0_11 = v2_8;
                                Object v2_10 = new com.google.android.gms.measurement.internal.zzbb(this.zzu, v6_4.zzb, v5_0, v0_10.zzd(), v0_10.zzf(), v0_10.zzh(), v11_0);
                                Long v3_4 = v14_2.zza;
                                String v5_1 = v14_2.zzb;
                                com.google.android.gms.measurement.internal.zzgs v7_5 = v14_2.zzc;
                                this.zzg();
                                this.zzaw();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_10);
                                String v8_3 = v2_10.zza;
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v8_3);
                                byte[] v9_8 = v16_1.zzp().zzh(v2_10).zzcc();
                                String v10_5 = new android.content.ContentValues();
                                v10_5.put("app_id", v8_3);
                                v10_5.put("name", v2_10.zzb);
                                boolean v16_2 = v3_4;
                                v10_5.put("timestamp", Long.valueOf(v2_10.zzd));
                                v10_5.put("metadata_fingerprint", Long.valueOf(v5_1));
                                v10_5.put("data", v9_8);
                                v10_5.put("realtime", Integer.valueOf(v7_5));
                                try {
                                    Long v3_12 = ((long) this.zze().update("raw_events", v10_5, "rowid = ?", new String[] {String.valueOf(v16_2)})));
                                } catch (com.google.android.gms.measurement.internal.zzgs v0_15) {
                                    this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v2_10.zza), v0_15);
                                    v5_0 = p25;
                                }
                                if (v3_12 == 1) {
                                } else {
                                    v0_11.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", com.google.android.gms.measurement.internal.zzgu.zzl(v8_3), Long.valueOf(v3_12));
                                }
                            } else {
                                this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v5_0));
                            }
                            v2_18.close();
                        } catch (com.google.android.gms.measurement.internal.zzgs v0_2) {
                            v3_1 = 0;
                            v4_0 = v2_18;
                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v5_0), v0_2);
                            if (v4_0 == null) {
                            } else {
                                v4_0.close();
                            }
                        } catch (com.google.android.gms.measurement.internal.zzgs v0_1) {
                            v4_0 = v2_18;
                            if (v4_0 != null) {
                                v4_0.close();
                            }
                            throw v0_1;
                        }
                    } catch (com.google.android.gms.measurement.internal.zzgs v0_2) {
                        v3_1 = 0;
                    } catch (com.google.android.gms.measurement.internal.zzgs v0_1) {
                    }
                }
            }
            v0_7 = v12.zza();
            v5_0 = p25;
        }
        return;
    }

    public final com.google.android.gms.measurement.internal.zzjl zzX(String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzg();
        this.zzaw();
        com.google.android.gms.measurement.internal.zzjl v1 = 0;
        try {
            com.google.android.gms.measurement.internal.zzjl v5_1 = this.zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[] {p5}));
            try {
                if (v5_1.moveToFirst()) {
                    v1 = com.google.android.gms.measurement.internal.zzjl.zzf(v5_1.getString(0), v5_1.getInt(1));
                    v5_1.close();
                    if (v1 != null) {
                        return v1;
                    } else {
                        return com.google.android.gms.measurement.internal.zzjl.zza;
                    }
                } else {
                    this.zzu.zzaV().zzk().zza("No data found");
                }
            } catch (String v0_1) {
                this.zzu.zzaV().zzb().zzb("Error querying database.", v0_1);
                if (v5_1 == null) {
                } else {
                }
            }
        } catch (com.google.android.gms.measurement.internal.zzjl v5_3) {
            v0_1 = v5_3;
            v5_1 = 0;
        } catch (com.google.android.gms.measurement.internal.zzjl v5_2) {
            String v0_0 = v5_2;
            if (v1 != null) {
                v1.close();
            }
            throw v0_0;
        } catch (String v0_0) {
            v1 = v5_1;
        }
    }

    public final boolean zzY(String p10, com.google.android.gms.measurement.internal.zzoh p11)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        com.google.android.gms.measurement.internal.zzgs v1_11 = v0_0.zzaZ().currentTimeMillis();
        long v3_8 = com.google.android.gms.measurement.internal.zzfy.zzav;
        long v7 = p11.zzb;
        if ((v7 < (v1_11 - ((Long) v3_8.zzb(0)).longValue())) || (v7 > (((Long) v3_8.zzb(0)).longValue() + v1_11))) {
            v0_0.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzgu.zzl(p10), Long.valueOf(v1_11), Long.valueOf(v7));
        }
        v0_0.zzaV().zzk().zza("Saving trigger URI");
        com.google.android.gms.measurement.internal.zzgs v1_4 = new android.content.ContentValues();
        v1_4.put("app_id", p10);
        v1_4.put("trigger_uri", p11.zza);
        v1_4.put("source", Integer.valueOf(p11.zzc));
        v1_4.put("timestamp_millis", Long.valueOf(v7));
        try {
            if (this.zze().insert("trigger_uris", 0, v1_4) != -1) {
                return 1;
            } else {
                v0_0.zzaV().zzb().zzb("Failed to insert trigger URI (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p10));
                return 0;
            }
        } catch (com.google.android.gms.measurement.internal.zzgs v0_1) {
            this.zzu.zzaV().zzb().zzc("Error storing trigger URI. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p10), v0_1);
            return 0;
        }
    }

    public final void zzZ(String p4, com.google.android.gms.measurement.internal.zzjl p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzg();
        this.zzaw();
        android.content.ContentValues v0_1 = new android.content.ContentValues();
        v0_1.put("app_id", p4);
        v0_1.put("consent_state", p5.zzl());
        v0_1.put("consent_source", Integer.valueOf(p5.zzb()));
        this.zzaB("consent_settings", "app_id", v0_1);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzaz zzaa(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zzg();
        this.zzaw();
        return com.google.android.gms.measurement.internal.zzaz.zzg(this.zzaA("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[] {p3}), ""));
    }

    public final void zzab(String p3, com.google.android.gms.measurement.internal.zzaz p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzg();
        this.zzaw();
        String v1_1 = com.google.android.gms.measurement.internal.zzjl.zza;
        if (this.zzX(p3) == v1_1) {
            this.zzZ(p3, v1_1);
        }
        android.content.ContentValues v0_0 = new android.content.ContentValues();
        v0_0.put("app_id", p3);
        v0_0.put("dma_consent_settings", p4.zze());
        this.zzaB("consent_settings", "app_id", v0_0);
        return;
    }

    public final void zzac(String p3, com.google.android.gms.measurement.internal.zzjl p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzg();
        this.zzaw();
        this.zzZ(p3, this.zzX(p3));
        android.content.ContentValues v0_2 = new android.content.ContentValues();
        v0_2.put("app_id", p3);
        v0_2.put("storage_consent_at_bundling", p4.zzl());
        this.zzaB("consent_settings", "app_id", v0_2);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzjl zzad(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zzg();
        this.zzaw();
        return com.google.android.gms.measurement.internal.zzjl.zzf(this.zzaA("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[] {p3}), ""), 100);
    }

    public final void zzae(String p23, java.util.List p24)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p24);
        StringBuilder v8_4 = 0;
        while (v8_4 < p24.size()) {
            Object v9_21 = ((com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) p24.get(v8_4)).zzcl());
            if (v9_21.zzd() != 0) {
                Integer v10_6 = 0;
                while (v10_6 < v9_21.zzd()) {
                    Integer v13_5;
                    long v11_20 = ((com.google.android.gms.internal.measurement.zzfe) v9_21.zze(v10_6).zzcl());
                    long v12_20 = ((com.google.android.gms.internal.measurement.zzfe) v11_20.zzba());
                    Integer v13_4 = com.google.android.gms.measurement.internal.zzjm.zzb(v11_20.zza());
                    if (v13_4 == null) {
                        v13_5 = 0;
                    } else {
                        v12_20.zzb(v13_4);
                        v13_5 = 1;
                    }
                    String v15_1 = 0;
                    while (v15_1 < v11_20.zzc()) {
                        boolean v14_3 = v11_20.zzd(v15_1);
                        long v17_1 = v11_20;
                        String[] v18_1 = v13_5;
                        String v7_20 = com.google.android.gms.measurement.internal.zzlt.zzc(v14_3.zzh(), com.google.android.gms.measurement.internal.zzjn.zza, com.google.android.gms.measurement.internal.zzjn.zzb);
                        if (v7_20 == null) {
                            v13_5 = v18_1;
                        } else {
                            long v11_23 = ((com.google.android.gms.internal.measurement.zzfg) v14_3.zzcl());
                            v11_23.zza(v7_20);
                            v12_20.zze(v15_1, ((com.google.android.gms.internal.measurement.zzfh) v11_23.zzbc()));
                            v13_5 = 1;
                        }
                        v15_1++;
                        v11_20 = v17_1;
                    }
                    if (v13_5 != null) {
                        v9_21.zzf(v10_6, v12_20);
                        p24.set(v8_4, ((com.google.android.gms.internal.measurement.zzfd) v9_21.zzbc()));
                    }
                    v10_6++;
                }
            }
            if (v9_21.zza() != 0) {
                String v7_15 = 0;
                while (v7_15 < v9_21.zza()) {
                    Integer v10_8 = v9_21.zzb(v7_15);
                    long v11_17 = com.google.android.gms.measurement.internal.zzlt.zzc(v10_8.zzc(), com.google.android.gms.measurement.internal.zzjo.zza, com.google.android.gms.measurement.internal.zzjo.zzb);
                    if (v11_17 != 0) {
                        Integer v10_10 = ((com.google.android.gms.internal.measurement.zzfm) v10_8.zzcl());
                        v10_10.zza(v11_17);
                        v9_21.zzc(v7_15, v10_10);
                        p24.set(v8_4, ((com.google.android.gms.internal.measurement.zzfd) v9_21.zzbc()));
                    }
                    v7_15++;
                }
            }
            v8_4++;
        }
        this.zzaw();
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p24);
        String v7_0 = this.zze();
        v7_0.beginTransaction();
        this.zzaw();
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
        StringBuilder v8_2 = this.zze();
        v8_2.delete("property_filters", "app_id=?", new String[] {p23}));
        v8_2.delete("event_filters", "app_id=?", new String[] {p23}));
        StringBuilder v8_3 = p24.iterator();
        while (v8_3.hasNext()) {
            com.google.android.gms.measurement.internal.zzgs v0_3 = ((com.google.android.gms.internal.measurement.zzfd) v8_3.next());
            this.zzaw();
            this.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3);
            if (v0_3.zza()) {
                Integer v10_1 = v0_3.zzb();
                long v11_2 = v0_3.zzf().iterator();
                while (v11_2.hasNext()) {
                    if (!((com.google.android.gms.internal.measurement.zzff) v11_2.next()).zza()) {
                        this.zzu.zzaV().zze().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgu.zzl(p23), Integer.valueOf(v10_1));
                    }
                }
                long v11_4 = v0_3.zzc().iterator();
                while (v11_4.hasNext()) {
                    if (!((com.google.android.gms.internal.measurement.zzfn) v11_4.next()).zza()) {
                        this.zzu.zzaV().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgu.zzl(p23), Integer.valueOf(v10_1));
                    }
                }
                long v11_6 = v0_3.zzf().iterator();
                while(true) {
                    com.google.android.gms.internal.measurement.zzfd v20_0;
                    com.google.android.gms.measurement.internal.zzgs v19_0 = v0_3;
                    com.google.android.gms.measurement.internal.zzgs v0_4 = "app_id";
                    if (!v11_6.hasNext()) {
                        v20_0 = v7_0;
                        com.google.android.gms.measurement.internal.zzgs v3_2 = v19_0.zzc().iterator();
                        while (v3_2.hasNext()) {
                            String v7_3 = ((com.google.android.gms.internal.measurement.zzfn) v3_2.next());
                            this.zzaw();
                            this.zzg();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v7_3);
                            if (!v7_3.zzc().isEmpty()) {
                                com.google.android.gms.measurement.internal.zzgs v0_7;
                                long v11_9 = v7_3.zzcc();
                                long v12_4 = new android.content.ContentValues();
                                v12_4.put(v0_4, p23);
                                com.google.android.gms.measurement.internal.zzgs v19_1 = v0_4;
                                v12_4.put("audience_id", Integer.valueOf(v10_1));
                                if (!v7_3.zza()) {
                                    v0_7 = 0;
                                } else {
                                    v0_7 = Integer.valueOf(v7_3.zzb());
                                }
                                com.google.android.gms.measurement.internal.zzgs v0_11;
                                v12_4.put("filter_id", v0_7);
                                String[] v21 = v3_2;
                                v12_4.put("property_name", v7_3.zzc());
                                if (!v7_3.zzg()) {
                                    v0_11 = 0;
                                } else {
                                    v0_11 = Boolean.valueOf(v7_3.zzh());
                                }
                                v12_4.put("session_scoped", v0_11);
                                v12_4.put("data", v11_9);
                                try {
                                    if (this.zze().insertWithOnConflict("property_filters", 0, v12_4, 5) != -1) {
                                        v0_4 = v19_1;
                                        v3_2 = v21;
                                    } else {
                                        this.zzu.zzaV().zzb().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p23));
                                        this.zzaw();
                                        this.zzg();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
                                        com.google.android.gms.measurement.internal.zzgs v0_42 = this.zze();
                                        v0_42.delete("property_filters", "app_id=? and audience_id=?", new String[] {p23, String.valueOf(v10_1)}));
                                        v0_42.delete("event_filters", "app_id=? and audience_id=?", new String[] {p23, String.valueOf(v10_1)}));
                                        break;
                                    }
                                } catch (com.google.android.gms.measurement.internal.zzgs v0_15) {
                                    this.zzu.zzaV().zzb().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p23), v0_15);
                                }
                            } else {
                                int v16_0;
                                com.google.android.gms.measurement.internal.zzgs v0_21 = this.zzu.zzaV().zze();
                                Object v9_9 = com.google.android.gms.measurement.internal.zzgu.zzl(p23);
                                long v11_11 = Integer.valueOf(v10_1);
                                if (!v7_3.zza()) {
                                    v16_0 = 0;
                                } else {
                                    v16_0 = Integer.valueOf(v7_3.zzb());
                                }
                                v0_21.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v9_9, v11_11, String.valueOf(v16_0));
                            }
                        }
                    } else {
                        long v12_7 = ((com.google.android.gms.internal.measurement.zzff) v11_6.next());
                        this.zzaw();
                        this.zzg();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v12_7);
                        if (v12_7.zzc().isEmpty()) {
                            break;
                        }
                        com.google.android.gms.measurement.internal.zzgs v3_11 = v12_7.zzcc();
                        v20_0 = v7_0;
                        com.google.android.gms.measurement.internal.zzgs v0_24;
                        String v7_11 = new android.content.ContentValues();
                        v7_11.put("app_id", p23);
                        v7_11.put("audience_id", Integer.valueOf(v10_1));
                        if (!v12_7.zza()) {
                            v0_24 = 0;
                        } else {
                            v0_24 = Integer.valueOf(v12_7.zzb());
                        }
                        com.google.android.gms.measurement.internal.zzgs v0_28;
                        v7_11.put("filter_id", v0_24);
                        v7_11.put("event_name", v12_7.zzc());
                        if (!v12_7.zzk()) {
                            v0_28 = 0;
                        } else {
                            v0_28 = Boolean.valueOf(v12_7.zzm());
                        }
                        v7_11.put("session_scoped", v0_28);
                        v7_11.put("data", v3_11);
                        try {
                            if (this.zze().insertWithOnConflict("event_filters", 0, v7_11, 5) == -1) {
                                this.zzu.zzaV().zzb().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p23));
                            }
                            v0_3 = v19_0;
                            v7_0 = v20_0;
                        } catch (com.google.android.gms.measurement.internal.zzgs v0_36) {
                            this.zzu.zzaV().zzb().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p23), v0_36);
                        }
                    }
                    v7_0 = v20_0;
                }
                int v16_1;
                com.google.android.gms.measurement.internal.zzgs v0_39 = this.zzu.zzaV().zze();
                long v11_12 = com.google.android.gms.measurement.internal.zzgu.zzl(p23);
                Integer v13_1 = Integer.valueOf(v10_1);
                if (!v12_7.zza()) {
                    v16_1 = 0;
                } else {
                    v16_1 = Integer.valueOf(v12_7.zzb());
                }
                v0_39.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v11_12, v13_1, String.valueOf(v16_1));
                v20_0 = v7_0;
            } else {
                this.zzu.zzaV().zze().zzb("Audience with no ID. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p23));
            }
        }
        v20_0 = v7_0;
        com.google.android.gms.measurement.internal.zzgs v0_41 = new java.util.ArrayList();
        String v4_4 = p24.iterator();
        while (v4_4.hasNext()) {
            Object v9_5;
            int v5_1 = ((com.google.android.gms.internal.measurement.zzfd) v4_4.next());
            if (!v5_1.zza()) {
                v9_5 = 0;
            } else {
                v9_5 = Integer.valueOf(v5_1.zzb());
            }
            v0_41.add(v9_5);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
        this.zzaw();
        this.zzg();
        String v7_18 = this.zze();
        StringBuilder v8_6 = this.zzay("select count(1) from audience_filter_values where app_id=?", new String[] {p23}));
        long v11_0 = 0;
        Integer v10_17 = Math.max(0, Math.min(2000, this.zzu.zzc().zzm(p23, com.google.android.gms.measurement.internal.zzfy.zzU)));
        if (v8_6 > ((long) v10_17)) {
            StringBuilder v8_9 = new java.util.ArrayList();
            while (v11_0 < v0_41.size()) {
                Object v9_2 = ((Integer) v0_41.get(v11_0));
                if (v9_2 == null) {
                    v20_0.setTransactionSuccessful();
                    v20_0.endTransaction();
                    return;
                } else {
                    v8_9.add(Integer.toString(v9_2.intValue()));
                    v11_0++;
                }
            }
            com.google.android.gms.measurement.internal.zzgs v0_56 = android.text.TextUtils.join(",", v8_9);
            Object v9_25 = new StringBuilder((String.valueOf(v0_56).length() + 2));
            v9_25.append("(");
            v9_25.append(v0_56);
            v9_25.append(")");
            com.google.android.gms.measurement.internal.zzgs v0_0 = v9_25.toString();
            StringBuilder v8_1 = new StringBuilder((v0_0.length() + 140));
            v8_1.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            v8_1.append(v0_0);
            v8_1.append(" order by rowid desc limit -1 offset ?)");
            v7_18.delete("audience_filter_values", v8_1.toString(), new String[] {p23, Integer.toString(v10_17)}));
            v20_0.setTransactionSuccessful();
            v20_0.endTransaction();
            return;
        } else {
            v20_0.setTransactionSuccessful();
            v20_0.endTransaction();
            return;
        }
    }

    public final com.google.android.gms.measurement.internal.zzbc zzaf(String p24, com.google.android.gms.internal.measurement.zzhs p25, String p26)
    {
        Boolean v1_5 = this.zzaC("events", p24, p25.zzd());
        if (v1_5 != null) {
            return new com.google.android.gms.measurement.internal.zzbc(v1_5.zza, v1_5.zzb, (v1_5.zzc + 1), (v1_5.zzd + 1), (v1_5.zze + 1), v1_5.zzf, v1_5.zzg, v1_5.zzh, v1_5.zzi, v1_5.zzj, v1_5.zzk);
        } else {
            Boolean v1_2 = this.zzu;
            v1_2.zzaV().zze().zzc("Event aggregate wasn\'t created during raw event logging. appId, event", com.google.android.gms.measurement.internal.zzgu.zzl(p24), v1_2.zzl().zza(p26));
            return new com.google.android.gms.measurement.internal.zzbc(p24, p25.zzd(), 1, 1, 1, p25.zzf(), 0, 0, 0, 0, 0);
        }
    }

    public final boolean zzag()
    {
        boolean v0_0 = this.zzu;
        android.content.Context v1 = v0_0.zzaY();
        v0_0.zzc();
        return v1.getDatabasePath("google_app_measurement.db").exists();
    }

    public final synthetic long zzah(String p1, String[] p2, long p3)
    {
        return this.zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", p2, -1);
    }

    public final synthetic com.google.android.gms.measurement.internal.zzog zzas()
    {
        return this.zzn;
    }

    public final void zzat(String p20, long p21, long p23, com.google.android.gms.measurement.internal.zzpc p25)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p25);
        this.zzg();
        this.zzaw();
        String v4_0 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;";
        String v6_10 = 0;
        int v3_0;
        boolean v0_22;
        com.google.android.gms.measurement.internal.zzgs v7_0 = this.zze();
        String v10_1 = "";
        try {
            if (!android.text.TextUtils.isEmpty(p20)) {
                String v5_2;
                String v8_9;
                v4_0 = p23 cmp -1;
                if (v4_0 == null) {
                    v8_9 = p20;
                    v5_2 = new String[] {p20});
                } else {
                    v8_9 = p20;
                    v5_2 = new String[] {p20, String.valueOf(p23)});
                }
                if (v4_0 != null) {
                    v10_1 = " and rowid <= ?";
                }
                v4_0 = (v10_1.length() + 84);
                String v14_3 = new StringBuilder(v4_0);
                v14_3.append("select metadata_fingerprint from raw_events where app_id = ?");
                v14_3.append(v10_1);
                v14_3.append(" order by rowid limit 1;");
                v3_0 = v7_0.rawQuery(v14_3.toString(), v5_2);
                try {
                    if (v3_0.moveToFirst()) {
                        v0_22 = v3_0.getString(0);
                        v3_0.close();
                        v4_0 = v8_9;
                        v3_0 = v7_0.query("raw_events_metadata", new String[] {"metadata"}), "app_id = ? and metadata_fingerprint = ?", new String[] {v4_0, v0_22}), 0, 0, "rowid", "2");
                        if (v3_0.moveToFirst()) {
                            try {
                                String v8_5 = ((com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), v3_0.getBlob(0))).zzbc());
                            } catch (boolean v0_0) {
                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_0), v0_0);
                                if (v3_0 != 0) {
                                    v3_0.close();
                                }
                                return;
                            }
                            if (v3_0.moveToNext()) {
                                this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_0));
                            }
                            boolean v0_2;
                            boolean v0_1;
                            com.google.android.gms.measurement.internal.zzic v11_3;
                            boolean v0_3;
                            v3_0.close();
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v8_5);
                            p25.zza = v8_5;
                            String v8_7 = this.zzu;
                            String v10_3 = "app_id = ? and metadata_fingerprint = ?";
                            if (!v8_7.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbk)) {
                                if (p23 == -1) {
                                    v0_1 = new String[] {v4_0, v0_22});
                                    v11_3 = v0_1;
                                    v0_3 = v8_7;
                                } else {
                                    v0_2 = new String[] {v4_0, v0_22, String.valueOf(p23)});
                                    v11_3 = v0_2;
                                    v0_3 = v8_7;
                                    v10_3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                }
                            } else {
                                String v10_4;
                                String v14_0 = this.zzaz("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[] {v4_0, v0_22}), -1);
                                if (p23 != -1) {
                                    v10_4 = p23;
                                } else {
                                    if (v14_0 == -1) {
                                        v0_1 = new String[] {v4_0, v0_22});
                                    } else {
                                        v10_4 = -1;
                                    }
                                }
                                String v6_7 = v10_4 cmp -1;
                                if ((v6_7 == null) || (v14_0 == -1)) {
                                    if (v6_7 != null) {
                                        v14_0 = v10_4;
                                    }
                                } else {
                                    v14_0 = Math.min(v10_4, v14_0);
                                }
                                v0_2 = new String[] {v4_0, v0_22, String.valueOf(v14_0)});
                            }
                            v6_10 = v7_0.query("raw_events", new String[] {"rowid", "name", "timestamp", "data"}), v10_3, v11_3, 0, 0, "rowid", 0);
                            if (!v6_10.moveToFirst()) {
                                v0_3.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_0));
                                v3_0 = v6_10;
                            }
                            do {
                                com.google.android.gms.measurement.internal.zzgs v7_1 = v6_10.getLong(0);
                                boolean v0_9 = ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), v6_10.getBlob(3)));
                                v0_9.zzl(v6_10.getString(1));
                                v0_9.zzo(v6_10.getLong(2));
                                if (p25.zza(v7_1, ((com.google.android.gms.internal.measurement.zzhs) v0_9.zzbc()))) {
                                } else {
                                }
                            } while(v6_10.moveToNext());
                        } else {
                            this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_0));
                        }
                    } else {
                    }
                } catch (boolean v0_18) {
                    v6_10 = v3_0;
                    v4_0 = v8_9;
                    String v2_8 = this.zzu.zzaV().zzb();
                    v4_0 = com.google.android.gms.measurement.internal.zzgu.zzl(v4_0);
                    v2_8.zzc("Data loss. Error selecting raw event. appId", v4_0, v0_18);
                }
            } else {
                int v3_7;
                boolean v0_24 = p23 cmp -1;
                if (!v0_24) {
                    v3_7 = new String[] {String.valueOf(p21)});
                } else {
                    v3_7 = new String[] {String.valueOf(p23), String.valueOf(p21)});
                }
                if (v0_24) {
                    v10_1 = "rowid <= ? and ";
                }
                String v8_13 = new StringBuilder((v10_1.length() + 148));
                v8_13.append("select app_id, metadata_fingerprint from raw_events where ");
                v8_13.append(v10_1);
                v8_13.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                v3_0 = v7_0.rawQuery(v8_13.toString(), v3_7);
                try {
                    if (v3_0.moveToFirst()) {
                        v4_0 = v3_0.getString(0);
                        v0_22 = v3_0.getString(1);
                        v3_0.close();
                    } else {
                    }
                } catch (boolean v0_18) {
                    v4_0 = p20;
                }
            }
        } catch (boolean v0_19) {
            v6_10 = v3_0;
            if (v6_10 != null) {
                v6_10.close();
            }
            throw v0_19;
        } catch (boolean v0_18) {
        }
        v6_10 = v3_0;
    }

    public final void zzb()
    {
        this.zzaw();
        this.zze().beginTransaction();
        return;
    }

    public final boolean zzbb()
    {
        return 0;
    }

    public final void zzc()
    {
        this.zzaw();
        this.zze().setTransactionSuccessful();
        return;
    }

    public final void zzd()
    {
        this.zzaw();
        this.zze().endTransaction();
        return;
    }

    public final android.database.sqlite.SQLiteDatabase zze()
    {
        this.zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException v0_2) {
            this.zzu.zzaV().zze().zzb("Error opening database", v0_2);
            throw v0_2;
        }
    }

    public final com.google.android.gms.measurement.internal.zzbc zzf(String p2, String p3)
    {
        return this.zzaC("events", p2, p3);
    }

    public final void zzh(com.google.android.gms.measurement.internal.zzbc p2)
    {
        this.zzaD("events", p2);
        return;
    }

    public final void zzi(String p13)
    {
        this.zzaE("events_snapshot", p13);
        String[] v5_0 = new String[0];
        android.database.Cursor v2 = this.zze().query("events", ((String[]) java.util.Collections.singletonList("name").toArray(v5_0)), "app_id=?", new String[] {p13}), 0, 0, 0);
        if (!v2.moveToFirst()) {
            if (v2 != null) {
                v2.close();
            }
            return;
        }
        do {
            boolean v1_3 = v2.getString(0);
            if (v1_3) {
                boolean v1_4 = this.zzaC("events", p13, v1_3);
                if (v1_4) {
                    this.zzaD("events_snapshot", v1_4);
                }
            }
        } while(v2.moveToNext());
    }

    public final void zzj(String p20)
    {
        boolean v0_0 = new java.util.ArrayList(java.util.Arrays.asList(new String[] {"name", "lifetime_count"})));
        com.google.android.gms.measurement.internal.zzbc v6 = this.zzaC("events", p20, "_f");
        com.google.android.gms.measurement.internal.zzbc v8 = this.zzaC("events", p20, "_v");
        void v1_1 = this.zzaE("events", p20);
        int v10 = 0;
        try {
            int v13_0 = new String[0];
            android.database.Cursor v9 = v1_1.zze().query("events_snapshot", ((String[]) v0_0.toArray(v13_0)), "app_id=?", new String[] {p20}), 0, 0, 0);
        } catch (boolean v0_5) {
            int v12_1 = 0;
            try {
                v1_1.zzu.zzaV().zzb().zzc("Error querying snapshot. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p20), v0_5);
                int v11_1 = v10;
            } catch (boolean v0_4) {
                if (v9 != null) {
                    v9.close();
                }
                if (v10 != 0) {
                    if (v12_1 == 0) {
                        if (v8 != null) {
                            v1_1 = v1_1.zzaD("events", v8);
                        }
                    }
                } else {
                    if (v6 != null) {
                        v1_1 = v1_1.zzaD("events", v6);
                    }
                }
                v1_1.zzaE("events_snapshot", p20);
                throw v0_4;
            }
            if (v9 != null) {
                v9.close();
            }
            if ((v11_1 != 0) || (v6 == null)) {
                if ((v12_1 != 0) || (v8 == null)) {
                    v1_1.zzaE("events_snapshot", p20);
                    return;
                } else {
                    v1_1 = v1_1.zzaD("events", v8);
                    v1_1.zzaE("events_snapshot", p20);
                    return;
                }
            } else {
                v1_1 = v1_1.zzaD("events", v6);
                v1_1.zzaE("events_snapshot", p20);
                return;
            }
        } catch (boolean v0_4) {
            v12_1 = 0;
        }
        if (v9.moveToFirst()) {
            v11_1 = 0;
            v12_1 = 0;
            do {
                boolean v0_6 = v9.getString(0);
                if (v9.getLong(1) >= 1) {
                    if (!"_f".equals(v0_6)) {
                        if ("_v".equals(v0_6)) {
                            v12_1 = 1;
                        }
                    } else {
                        v11_1 = 1;
                    }
                }
                if (v0_6) {
                    boolean v0_7 = v1_1.zzaC("events_snapshot", p20, v0_6);
                    if (v0_7) {
                        v1_1 = v1_1.zzaD("events", v0_7);
                    }
                }
            } while(v9.moveToNext());
        } else {
            v9.close();
            if (v6 == null) {
                if (v8 == null) {
                    v1_1.zzaE("events_snapshot", p20);
                    return;
                } else {
                }
            } else {
            }
        }
    }

    public final void zzk(String p5, String p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        this.zzg();
        this.zzaw();
        try {
            this.zze().delete("user_attributes", "app_id=? and name=?", new String[] {p5, p6}));
            return;
        } catch (android.database.sqlite.SQLiteException v0_0) {
            String v1_0 = this.zzu;
            v1_0.zzaV().zzb().zzd("Error deleting user property. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5), v1_0.zzl().zzc(p6), v0_0);
            return;
        }
    }

    public final boolean zzl(com.google.android.gms.measurement.internal.zzpn p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        this.zzg();
        this.zzaw();
        Object v0_0 = p10.zza;
        com.google.android.gms.measurement.internal.zzgs v1_0 = p10.zzc;
        if (this.zzm(v0_0, v1_0) == null) {
            if (!com.google.android.gms.measurement.internal.zzpp.zzh(v1_0)) {
                if (!"_npa".equals(v1_0)) {
                    long v4_1 = this.zzay("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[] {v0_0, p10.zzb}));
                    this.zzu.zzc();
                    if (v4_1 >= 25) {
                        return 0;
                    }
                }
            } else {
                if (this.zzay("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[] {v0_0})) >= ((long) this.zzu.zzc().zzn(v0_0, com.google.android.gms.measurement.internal.zzfy.zzV, 25, 100))) {
                    return 0;
                }
            }
        }
        String v2_12 = new android.content.ContentValues();
        v2_12.put("app_id", v0_0);
        v2_12.put("origin", p10.zzb);
        v2_12.put("name", v1_0);
        v2_12.put("set_timestamp", Long.valueOf(p10.zzd));
        com.google.android.gms.measurement.internal.zzav.zzau(v2_12, "value", p10.zze);
        try {
            if (this.zze().insertWithOnConflict("user_attributes", 0, v2_12, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_0));
            }
        } catch (Object v0_1) {
            this.zzu.zzaV().zzb().zzc("Error storing user property. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p10.zza), v0_1);
        }
        return 1;
    }

    public final com.google.android.gms.measurement.internal.zzpn zzm(String p11, String p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p12);
        this.zzg();
        this.zzaw();
        int v1 = 0;
        try {
            int v2_0 = this.zze().query("user_attributes", new String[] {"set_timestamp", "value", "origin"}), "app_id=? and name=?", new String[] {p11, p12}), 0, 0, 0);
            try {
                if (v2_0.moveToFirst()) {
                    long v7_1 = v2_0.getLong(0);
                    Object v9_1 = this.zzL(v2_0, 1);
                    if (v9_1 != null) {
                        int v4_1 = p11;
                        String v6_1 = p12;
                        try {
                            com.google.android.gms.measurement.internal.zzpn v3_1 = new com.google.android.gms.measurement.internal.zzpn(p11, v2_0.getString(2), p12, v7_1, v9_1);
                        } catch (Object v0_6) {
                        }
                        if (v2_0.moveToNext()) {
                            this.zzu.zzaV().zzb().zzb("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p11));
                        }
                        v2_0.close();
                        return v3_1;
                    } else {
                        if (v2_0 != 0) {
                            v2_0.close();
                        }
                        return 0;
                    }
                } else {
                }
            } catch (Object v0_6) {
                v4_1 = p11;
                v6_1 = p12;
            }
            com.google.android.gms.measurement.internal.zzgs v11_2 = v0_6;
            String v12_2 = this.zzu;
            v12_2.zzaV().zzb().zzd("Error querying user property. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_1), v12_2.zzl().zzc(v6_1), v11_2);
        } catch (Object v0_1) {
            v4_1 = p11;
            v6_1 = p12;
            v11_2 = v0_1;
            v2_0 = 0;
        } catch (Object v0_0) {
            com.google.android.gms.measurement.internal.zzgs v11_1 = v0_0;
            if (v1 != 0) {
                v1.close();
            }
            throw v11_1;
        } catch (Object v0_10) {
            v11_1 = v0_10;
            v1 = v2_0;
        }
    }

    public final java.util.List zzn(String p13)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p13);
        this.zzg();
        this.zzaw();
        android.database.sqlite.SQLiteException v0_2 = new java.util.ArrayList();
        try {
            com.google.android.gms.measurement.internal.zzgs v1_9 = this.zze();
            String v5_1 = new String[] {p13});
            com.google.android.gms.measurement.internal.zzic v11 = this.zzu;
            v11.zzc();
            android.database.Cursor v10 = v1_9.query("user_attributes", new String[] {"name", "origin", "set_timestamp", "value"}), "app_id=?", v5_1, 0, 0, "rowid", "1000");
        } catch (android.database.sqlite.SQLiteException v0_0) {
            com.google.android.gms.measurement.internal.zzgs v3_2 = p13;
            this.zzu.zzaV().zzb().zzc("Error querying user properties. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v3_2), v0_0);
            v0_2 = java.util.Collections.EMPTY_LIST;
            if (v10 != null) {
                v10.close();
            }
            return v0_2;
        }
        if (!v10.moveToFirst()) {
        }
        while(true) {
            String v5_2 = v10.getString(0);
            com.google.android.gms.measurement.internal.zzgs v1_3 = v10.getString(1);
            if (v1_3 == null) {
                v1_3 = "";
            }
            String v4_2 = v1_3;
            long v6_2 = v10.getLong(2);
            Object v8_1 = this.zzL(v10, 3);
            if (v8_1 != null) {
                v3_2 = p13;
                try {
                    v0_2.add(new com.google.android.gms.measurement.internal.zzpn(p13, v4_2, v5_2, v6_2, v8_1));
                } catch (android.database.sqlite.SQLiteException v0_0) {
                }
            } else {
                v11.zzaV().zzb().zzb("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p13));
                v3_2 = p13;
            }
            if (!v10.moveToNext()) {
                break;
            }
            p13 = v3_2;
        }
    }

    public final java.util.List zzo(String p23, String p24, String p25)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
        this.zzg();
        this.zzaw();
        java.util.List v2_3 = new java.util.ArrayList();
        try {
            String v14_1;
            boolean v4_1 = new java.util.ArrayList(3);
            String v15 = p23;
            v4_1.add(p23);
            com.google.android.gms.measurement.internal.zzgs v5_4 = new StringBuilder("app_id=?");
        } catch (android.database.sqlite.SQLiteException v0_1) {
            v14_1 = p24;
            android.database.Cursor v12_0 = 0;
            try {
                this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzgu.zzl(p23), v14_1, v0_1);
                v2_3 = java.util.Collections.EMPTY_LIST;
                android.database.Cursor v3_1 = v12_0;
            } catch (android.database.sqlite.SQLiteException v0_4) {
                if (v12_0 != null) {
                    v12_0.close();
                }
                throw v0_4;
            }
            if (v3_1 != null) {
                v3_1.close();
            }
            return v2_3;
        }
        if (android.text.TextUtils.isEmpty(p24)) {
            v14_1 = p24;
        } else {
            v14_1 = p24;
            v4_1.add(p24);
            v5_4.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(p25)) {
            int v8_1 = new StringBuilder((String.valueOf(p25).length() + 1));
            v8_1.append(p25);
            v8_1.append("*");
            v4_1.add(v8_1.toString());
            v5_4.append(" and name glob ?");
        }
        android.database.Cursor v3_5 = new String[v4_1.size()];
        Object v7_2 = ((String[]) v4_1.toArray(v3_5));
        android.database.Cursor v3_8 = this.zze();
        com.google.android.gms.measurement.internal.zzgs v5_5 = v5_4.toString();
        int v8_3 = this.zzu;
        v8_3.zzc();
        com.google.android.gms.measurement.internal.zzic v21 = v8_3;
        v3_1 = v3_8.query("user_attributes", new String[] {"name", "set_timestamp", "value", "origin"}), v5_5, v7_2, 0, 0, "rowid", "1001");
        try {
            if (!v3_1.moveToFirst()) {
            }
        } catch (android.database.sqlite.SQLiteException v0_1) {
            v12_0 = v3_1;
        }
        while(true) {
            boolean v4_8 = v2_3.size();
            v21.zzc();
            if (v4_8 >= 1000) {
                break;
            }
            String v16;
            String v17_1 = v3_1.getString(0);
            long v18 = v3_1.getLong(1);
            Object v20 = this.zzL(v3_1, 2);
            boolean v4_0 = v3_1.getString(3);
            if (v20 != null) {
                v16 = v4_0;
                try {
                    v14_1 = new com.google.android.gms.measurement.internal.zzpn(v15, v16, v17_1, v18, v20);
                    v2_3.add(v14_1);
                } catch (android.database.sqlite.SQLiteException v0_1) {
                    v12_0 = v3_1;
                    v14_1 = v16;
                }
            } else {
                v21.zzaV().zzb().zzd("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.zzgu.zzl(v15), v4_0, p25);
                v16 = v4_0;
            }
            if (v3_1.moveToNext()) {
                v15 = p23;
                v14_1 = v16;
            }
        }
        android.database.sqlite.SQLiteException v0_3 = v21.zzaV().zzb();
        v21.zzc();
        v0_3.zzb("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(1000));
    }

    public final boolean zzp(com.google.android.gms.measurement.internal.zzah p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        this.zzg();
        this.zzaw();
        Object v0_1 = p8.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        if (this.zzm(v0_1, p8.zzc.zzb) == null) {
            String v1_5 = this.zzay("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] {v0_1}));
            this.zzu.zzc();
            if (v1_5 >= 1000) {
                return 0;
            }
        }
        String v1_8 = new android.content.ContentValues();
        v1_8.put("app_id", v0_1);
        v1_8.put("origin", p8.zzb);
        v1_8.put("name", p8.zzc.zzb);
        com.google.android.gms.measurement.internal.zzav.zzau(v1_8, "value", com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.zzc.zza()));
        v1_8.put("active", Boolean.valueOf(p8.zze));
        v1_8.put("trigger_event_name", p8.zzf);
        v1_8.put("trigger_timeout", Long.valueOf(p8.zzh));
        Object v2_15 = this.zzu;
        v1_8.put("timed_out_event", v2_15.zzk().zzae(p8.zzg));
        v1_8.put("creation_timestamp", Long.valueOf(p8.zzd));
        v1_8.put("triggered_event", v2_15.zzk().zzae(p8.zzi));
        v1_8.put("triggered_timestamp", Long.valueOf(p8.zzc.zzc));
        v1_8.put("time_to_live", Long.valueOf(p8.zzj));
        v1_8.put("expired_event", v2_15.zzk().zzae(p8.zzk));
        try {
            if (this.zze().insertWithOnConflict("conditional_properties", 0, v1_8, 5) == -1) {
                v2_15.zzaV().zzb().zzb("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.zzgu.zzl(v0_1));
            }
        } catch (int v8_1) {
            this.zzu.zzaV().zzb().zzc("Error storing conditional user property", com.google.android.gms.measurement.internal.zzgu.zzl(v0_1), v8_1);
        }
        return 1;
    }

    public final com.google.android.gms.measurement.internal.zzah zzq(String p26, String p27)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p26);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p27);
        this.zzg();
        this.zzaw();
        int v8 = 0;
        try {
            com.google.android.gms.measurement.internal.zzpl v13 = "active";
            int v15 = "trigger_timeout";
            String v17 = "creation_timestamp";
            long v19 = "triggered_timestamp";
            int v9_0 = this.zze().query("conditional_properties", new String[] {"origin", "expired_event"}), "app_id=? and name=?", new String[] {p26, p27}), 0, 0, 0);
        } catch (String v0_1) {
            String v3_0 = p27;
            v9_0 = 0;
            com.google.android.gms.measurement.internal.zzgs v2_3 = this.zzu;
            v2_3.zzaV().zzb().zzd("Error querying conditional property", com.google.android.gms.measurement.internal.zzgu.zzl(p26), v2_3.zzl().zzc(v3_0), v0_1);
            if (v9_0 != 0) {
                v9_0.close();
            }
            return 0;
        } catch (String v0_5) {
            if (v8 != 0) {
                v8.close();
            }
            throw v0_5;
        }
        if (v9_0.moveToFirst()) {
            com.google.android.gms.measurement.internal.zzgs v2_6 = v9_0.getString(0);
            if (v2_6 == null) {
                v2_6 = "";
            }
            String v7 = v2_6;
            int v16_1;
            Object v6_1 = this.zzL(v9_0, 1);
            if (v9_0.getInt(2) == 0) {
                v16_1 = 0;
            } else {
                v16_1 = 1;
            }
            String v0_10 = this.zzg;
            String v4_3 = com.google.android.gms.measurement.internal.zzbg.CREATOR;
            v3_0 = p27;
            try {
                com.google.android.gms.measurement.internal.zzah v10_1 = new com.google.android.gms.measurement.internal.zzah(p26, v7, new com.google.android.gms.measurement.internal.zzpl(p27, v9_0.getLong(8), v6_1, v7), v9_0.getLong(6), v16_1, v9_0.getString(3), ((com.google.android.gms.measurement.internal.zzbg) v0_10.zzp().zzl(v9_0.getBlob(5), v4_3)), v9_0.getLong(4), ((com.google.android.gms.measurement.internal.zzbg) v0_10.zzp().zzl(v9_0.getBlob(7), v4_3)), v9_0.getLong(9), ((com.google.android.gms.measurement.internal.zzbg) v0_10.zzp().zzl(v9_0.getBlob(10), v4_3)));
            } catch (String v0_1) {
            }
            if (v9_0.moveToNext()) {
                String v0_2 = this.zzu;
                v0_2.zzaV().zzb().zzc("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.zzgu.zzl(p26), v0_2.zzl().zzc(p27));
            }
            v9_0.close();
            return v10_1;
        } else {
        }
    }

    public final int zzr(String p5, String p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        this.zzg();
        this.zzaw();
        try {
            int v5_1 = this.zze().delete("conditional_properties", "app_id=? and name=?", new String[] {p5, p6}));
            return v5_1;
        } catch (android.database.sqlite.SQLiteException v0_0) {
            String v1_0 = this.zzu;
            v1_0.zzaV().zzb().zzd("Error deleting conditional property", com.google.android.gms.measurement.internal.zzgu.zzl(v5_1), v1_0.zzl().zzc(p6), v0_0);
            return 0;
        }
    }

    public final java.util.List zzs(String p3, String p4, String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.zzg();
        this.zzaw();
        java.util.ArrayList v0_1 = new java.util.ArrayList(3);
        v0_1.add(p3);
        java.util.List v3_4 = new StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(p4)) {
            v0_1.add(p4);
            v3_4.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(p5)) {
            v0_1.add(String.valueOf(p5).concat("*"));
            v3_4.append(" and name glob ?");
        }
        String[] v4_7 = new String[v0_1.size()];
        return this.zzt(v3_4.toString(), ((String[]) v0_1.toArray(v4_7)));
    }

    public final java.util.List zzt(String p29, String[] p30)
    {
        this.zzg();
        this.zzaw();
        java.util.List v0_1 = new java.util.ArrayList();
        boolean v2_13 = this.zze();
        String v14 = "name";
        com.google.android.gms.measurement.internal.zzpl v16 = "active";
        String v18 = "trigger_timeout";
        String v20 = "creation_timestamp";
        long v22 = "triggered_timestamp";
        com.google.android.gms.measurement.internal.zzic v12_1 = this.zzu;
        v12_1.zzc();
        android.database.Cursor v11 = v2_13.query("conditional_properties", new String[] {"app_id", "expired_event"}), p29, p30, 0, 0, "rowid", "1001");
        if (!v11.moveToFirst()) {
            if (v11 != null) {
                v11.close();
            }
            return v0_1;
        }
        do {
            boolean v2_8 = v0_1.size();
            v12_1.zzc();
            if (v2_8 < 1000) {
                int v19;
                v14 = v11.getString(0);
                String v15_1 = v11.getString(1);
                String v5_1 = v11.getString(2);
                Object v8_1 = this.zzL(v11, 3);
                if (v11.getInt(4) == 0) {
                    v19 = 0;
                } else {
                    v19 = 1;
                }
                boolean v2_12 = this.zzg;
                long v6_2 = com.google.android.gms.measurement.internal.zzbg.CREATOR;
                String v9_0 = v15_1;
                v0_1.add(new com.google.android.gms.measurement.internal.zzah(v14, v9_0, new com.google.android.gms.measurement.internal.zzpl(v5_1, v11.getLong(10), v8_1, v9_0), v11.getLong(8), v19, v11.getString(5), ((com.google.android.gms.measurement.internal.zzbg) v2_12.zzp().zzl(v11.getBlob(7), v6_2)), v11.getLong(6), ((com.google.android.gms.measurement.internal.zzbg) v2_12.zzp().zzl(v11.getBlob(9), v6_2)), v11.getLong(11), ((com.google.android.gms.measurement.internal.zzbg) v2_12.zzp().zzl(v11.getBlob(12), v6_2))));
            } else {
                boolean v2_3 = v12_1.zzaV().zzb();
                v12_1.zzc();
                v2_3.zzb("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                break;
            }
        } while(v11.moveToNext());
    }

    public final com.google.android.gms.measurement.internal.zzh zzu(String p52)
    {
        Object v2 = p52;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p52);
        this.zzg();
        this.zzaw();
        int v3 = 0;
        try {
            int v8 = "resettable_device_id_hash";
            String v10 = "last_bundle_start_timestamp";
            String v12 = "app_version";
            String v14 = "gmp_version";
            String v16 = "measurement_enabled";
            String v18 = "daily_public_events_count";
            String v20 = "daily_conversions_count";
            String v22 = "failed_config_fetch_time";
            String v24 = "firebase_instance_id";
            String v26 = "daily_realtime_events_count";
            String v28 = "android_id";
            String v30 = "admob_app_id";
            String v32 = "safelisted_events";
            String v34 = "session_stitching_token";
            String v36 = "target_os_version";
            String v38 = "ad_services_version";
            String v40 = "npa_metadata_value";
            String v42 = "sgtm_preview_key";
            String v44 = "daily_realtime_dcu_count";
            String v46 = "serialized_npa_metadata";
            String v48 = "unmatched_uwa";
            int v4_0 = this.zze().query("apps", new String[] {"app_instance_id", "client_upload_eligibility"}), "app_id=?", new String[] {p52}), 0, 0, 0);
        } catch (com.google.android.gms.measurement.internal.zzh v0_0) {
            v4_0 = 0;
            com.google.android.gms.measurement.internal.zzgs v5_17 = this.zzu.zzaV().zzb();
            v2 = com.google.android.gms.measurement.internal.zzgu.zzl(v2);
            v5_17.zzc("Error querying app. appId", v2, v0_0);
            if (v4_0 != 0) {
                v4_0.close();
            }
            return 0;
        } catch (com.google.android.gms.measurement.internal.zzh v0_1) {
            if (v3 != 0) {
                v3.close();
            }
            throw v0_1;
        }
        if (v4_0.moveToFirst()) {
            com.google.android.gms.measurement.internal.zzgs v5_18 = this.zzg;
            com.google.android.gms.measurement.internal.zzh v0_4 = new com.google.android.gms.measurement.internal.zzh(v5_18.zzag(), p52);
            Object v7_17 = com.google.android.gms.measurement.internal.zzjk.zzb;
            int v8_0 = 0;
            if (v5_18.zzB(p52).zzo(v7_17)) {
                v0_4.zze(v4_0.getString(0));
            }
            v0_4.zzg(v4_0.getString(1));
            if (v5_18.zzB(p52).zzo(com.google.android.gms.measurement.internal.zzjk.zza)) {
                v0_4.zzk(v4_0.getString(2));
            }
            boolean v9_15;
            v0_4.zzF(v4_0.getLong(3));
            v0_4.zzo(v4_0.getLong(4));
            v0_4.zzq(v4_0.getLong(5));
            v0_4.zzs(v4_0.getString(6));
            v0_4.zzw(v4_0.getString(7));
            v0_4.zzy(v4_0.getLong(8));
            v0_4.zzA(v4_0.getLong(9));
            if ((!v4_0.isNull(10)) && (v4_0.getInt(10) == 0)) {
                v9_15 = 0;
            } else {
                v9_15 = 1;
            }
            boolean v9_30;
            v0_4.zzE(v9_15);
            v0_4.zzO(v4_0.getLong(11));
            v0_4.zzQ(v4_0.getLong(12));
            v0_4.zzS(v4_0.getLong(13));
            v0_4.zzU(v4_0.getLong(14));
            v0_4.zzI(v4_0.getLong(15));
            v0_4.zzK(v4_0.getLong(16));
            if (!v4_0.isNull(17)) {
                v9_30 = ((long) v4_0.getInt(17));
            } else {
                v9_30 = -2147483648;
            }
            boolean v9_41;
            v0_4.zzu(v9_30);
            v0_4.zzm(v4_0.getString(18));
            v0_4.zzY(v4_0.getLong(19));
            v0_4.zzW(v4_0.getLong(20));
            v0_4.zzab(v4_0.getString(21));
            if ((!v4_0.isNull(23)) && (v4_0.getInt(23) == 0)) {
                v9_41 = 0;
            } else {
                v9_41 = 1;
            }
            boolean v9_43;
            v0_4.zzad(v9_41);
            if (!v4_0.isNull(25)) {
                v9_43 = v4_0.getLong(25);
            } else {
                v9_43 = 0;
            }
            v0_4.zzC(v9_43);
            if (!v4_0.isNull(26)) {
                v0_4.zzah(java.util.Arrays.asList(v4_0.getString(26).split(",", -1)));
            }
            if (v5_18.zzB(p52).zzo(v7_17)) {
                v0_4.zzi(v4_0.getString(28));
            }
            if ((v4_0.isNull(29)) || (v4_0.getInt(29) == 0)) {
                com.google.android.gms.measurement.internal.zzgs v5_6 = 0;
            } else {
                v5_6 = 1;
            }
            v0_4.zzaj(v5_6);
            v0_4.zzaE(v4_0.getLong(39));
            v0_4.zzaz(v4_0.getString(36));
            v0_4.zzal(v4_0.getLong(30));
            v0_4.zzan(v4_0.getLong(31));
            com.google.android.gms.internal.measurement.zzqp.zza();
            com.google.android.gms.measurement.internal.zzgs v5_12 = this.zzu;
            if (v5_12.zzc().zzp(p52, com.google.android.gms.measurement.internal.zzfy.zzaP)) {
                v0_4.zzap(v4_0.getInt(32));
                v0_4.zzax(v4_0.getLong(35));
            }
            if ((v4_0.isNull(33)) || (v4_0.getInt(33) == 0)) {
                Object v7_8 = 0;
            } else {
                v7_8 = 1;
            }
            String v6_0;
            v0_4.zzar(v7_8);
            if (!v4_0.isNull(34)) {
                if (v4_0.getInt(34) != 0) {
                    v8_0 = 1;
                }
                v6_0 = Boolean.valueOf(v8_0);
            } else {
                v6_0 = 0;
            }
            String v6_8;
            v0_4.zzaf(v6_0);
            v0_4.zzaB(v4_0.getInt(37));
            v0_4.zzaD(v4_0.getInt(38));
            if (!v4_0.isNull(40)) {
                v6_8 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0.getString(40)));
            } else {
                v6_8 = "";
            }
            v0_4.zzaG(v6_8);
            if (!v4_0.isNull(41)) {
                v0_4.zzat(Long.valueOf(v4_0.getLong(41)));
            }
            if (!v4_0.isNull(42)) {
                v0_4.zzav(Long.valueOf(v4_0.getLong(42)));
            }
            v0_4.zzaI(v4_0.getBlob(43));
            if (!v4_0.isNull(44)) {
                v0_4.zzaK(v4_0.getInt(44));
            }
            v0_4.zzb();
            if (v4_0.moveToNext()) {
                v5_12.zzaV().zzb().zzb("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p52));
            }
            v4_0.close();
            return v0_4;
        } else {
        }
    }

    public final void zzv(com.google.android.gms.measurement.internal.zzh p9, boolean p10, boolean p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        this.zzg();
        this.zzaw();
        String v0_1 = p9.zzc();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        long v1_2 = new android.content.ContentValues();
        v1_2.put("app_id", v0_1);
        if (p10 == null) {
            if (this.zzg.zzB(v0_1).zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                v1_2.put("app_instance_id", p9.zzd());
            }
        } else {
            v1_2.put("app_instance_id", 0);
        }
        v1_2.put("gmp_app_id", p9.zzf());
        String v10_14 = this.zzg;
        if (v10_14.zzB(v0_1).zzo(com.google.android.gms.measurement.internal.zzjk.zza)) {
            v1_2.put("resettable_device_id_hash", p9.zzj());
        }
        v1_2.put("last_bundle_index", Long.valueOf(p9.zzG()));
        v1_2.put("last_bundle_start_timestamp", Long.valueOf(p9.zzn()));
        v1_2.put("last_bundle_end_timestamp", Long.valueOf(p9.zzp()));
        v1_2.put("app_version", p9.zzr());
        v1_2.put("app_store", p9.zzv());
        v1_2.put("gmp_version", Long.valueOf(p9.zzx()));
        v1_2.put("dev_cert_hash", Long.valueOf(p9.zzz()));
        v1_2.put("measurement_enabled", Boolean.valueOf(p9.zzD()));
        v1_2.put("day", Long.valueOf(p9.zzN()));
        v1_2.put("daily_public_events_count", Long.valueOf(p9.zzP()));
        v1_2.put("daily_events_count", Long.valueOf(p9.zzR()));
        v1_2.put("daily_conversions_count", Long.valueOf(p9.zzT()));
        v1_2.put("config_fetched_time", Long.valueOf(p9.zzH()));
        v1_2.put("failed_config_fetch_time", Long.valueOf(p9.zzJ()));
        v1_2.put("app_version_int", Long.valueOf(p9.zzt()));
        v1_2.put("firebase_instance_id", p9.zzl());
        v1_2.put("daily_error_events_count", Long.valueOf(p9.zzX()));
        v1_2.put("daily_realtime_events_count", Long.valueOf(p9.zzV()));
        v1_2.put("health_monitor_sample", p9.zzZ());
        v1_2.put("android_id", Long.valueOf(0));
        v1_2.put("adid_reporting_enabled", Boolean.valueOf(p9.zzac()));
        v1_2.put("dynamite_version", Long.valueOf(p9.zzB()));
        if (v10_14.zzB(v0_1).zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            v1_2.put("session_stitching_token", p9.zzh());
        }
        v1_2.put("sgtm_upload_enabled", Boolean.valueOf(p9.zzai()));
        v1_2.put("target_os_version", Long.valueOf(p9.zzak()));
        v1_2.put("session_stitching_token_hash", Long.valueOf(p9.zzam()));
        com.google.android.gms.internal.measurement.zzqp.zza();
        String v10_11 = this.zzu;
        if (v10_11.zzc().zzp(v0_1, com.google.android.gms.measurement.internal.zzfy.zzaP)) {
            v1_2.put("ad_services_version", Integer.valueOf(p9.zzao()));
            v1_2.put("attribution_eligibility_status", Long.valueOf(p9.zzaw()));
        }
        v1_2.put("unmatched_first_open_without_ad_id", Boolean.valueOf(p9.zzaq()));
        v1_2.put("npa_metadata_value", p9.zzae());
        v1_2.put("bundle_delivery_index", Long.valueOf(p9.zzaF()));
        v1_2.put("sgtm_preview_key", p9.zzay());
        v1_2.put("dma_consent_state", Integer.valueOf(p9.zzaA()));
        v1_2.put("daily_realtime_dcu_count", Integer.valueOf(p9.zzaC()));
        v1_2.put("serialized_npa_metadata", p9.zzaH());
        v1_2.put("client_upload_eligibility", Integer.valueOf(p9.zzaL()));
        int v2_35 = p9.zzag();
        if (v2_35 != 0) {
            if (!v2_35.isEmpty()) {
                v1_2.put("safelisted_events", android.text.TextUtils.join(",", v2_35));
            } else {
                v10_11.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", v0_1);
            }
        }
        com.google.android.gms.internal.measurement.zzpr.zza();
        if ((v10_11.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaK)) && (!v1_2.containsKey("safelisted_events"))) {
            v1_2.put("safelisted_events", 0);
        }
        v1_2.put("unmatched_pfo", p9.zzas());
        v1_2.put("unmatched_uwa", p9.zzau());
        v1_2.put("ad_campaign_info", p9.zzaJ());
        try {
            com.google.android.gms.measurement.internal.zzgs v9_2 = this.zze();
        } catch (com.google.android.gms.measurement.internal.zzgs v9_4) {
            this.zzu.zzaV().zzb().zzc("Error storing app. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_1), v9_4);
            return;
        }
        if ((((long) v9_2.update("apps", v1_2, "app_id = ?", new String[] {v0_1}))) != 0) || (v9_2.insertWithOnConflict("apps", 0, v1_2, 5) != -1)) {
            return;
        } else {
            v10_11.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_1));
            return;
        }
    }

    public final com.google.android.gms.measurement.internal.zzar zzw(long p14, String p16, boolean p17, boolean p18, boolean p19, boolean p20, boolean p21, boolean p22, boolean p23)
    {
        return this.zzx(p14, p16, 1, 0, 0, p19, 0, p21, p22, p23);
    }

    public final com.google.android.gms.measurement.internal.zzar zzx(long p14, String p16, long p17, boolean p19, boolean p20, boolean p21, boolean p22, boolean p23, boolean p24, boolean p25)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p16);
        this.zzg();
        this.zzaw();
        String v0_4 = new String[] {p16, p16});
        com.google.android.gms.measurement.internal.zzar v1_1 = new com.google.android.gms.measurement.internal.zzar();
        Object v3_1 = this.zze();
        String[] v7 = "daily_public_events_count";
        int v9 = "daily_error_events_count";
        String v11 = "daily_realtime_dcu_count";
        android.database.Cursor v2 = v3_1.query("apps", new String[] {"day", "daily_registered_triggers_count"}), "app_id=?", new String[] {p16, p16}), 0, 0, 0);
        if (v2.moveToFirst()) {
            if (v2.getLong(0) == p14) {
                v1_1.zzb = v2.getLong(1);
                v1_1.zza = v2.getLong(2);
                v1_1.zzc = v2.getLong(3);
                v1_1.zzd = v2.getLong(4);
                v1_1.zze = v2.getLong(5);
                v1_1.zzf = v2.getLong(6);
                v1_1.zzg = v2.getLong(7);
            }
            if (p19) {
                v1_1.zzb = (v1_1.zzb + p17);
            }
            if (p20) {
                v1_1.zza = (v1_1.zza + p17);
            }
            if (p21) {
                v1_1.zzc = (v1_1.zzc + p17);
            }
            if (p22) {
                v1_1.zzd = (v1_1.zzd + p17);
            }
            if (p23) {
                v1_1.zze = (v1_1.zze + p17);
            }
            if (p24) {
                v1_1.zzf = (v1_1.zzf + p17);
            }
            if (p25) {
                v1_1.zzg = (v1_1.zzg + p17);
            }
            android.content.ContentValues v4_34 = new android.content.ContentValues();
            v4_34.put("day", Long.valueOf(p14));
            v4_34.put("daily_public_events_count", Long.valueOf(v1_1.zza));
            v4_34.put("daily_events_count", Long.valueOf(v1_1.zzb));
            v4_34.put("daily_conversions_count", Long.valueOf(v1_1.zzc));
            v4_34.put("daily_error_events_count", Long.valueOf(v1_1.zzd));
            v4_34.put("daily_realtime_events_count", Long.valueOf(v1_1.zze));
            v4_34.put("daily_realtime_dcu_count", Long.valueOf(v1_1.zzf));
            v4_34.put("daily_registered_triggers_count", Long.valueOf(v1_1.zzg));
            v3_1.update("apps", v4_34, "app_id=?", v0_4);
            if (v2 != null) {
                v2.close();
            }
            return v1_1;
        } else {
            this.zzu.zzaV().zze().zzb("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p16));
        }
    }

    public final com.google.android.gms.measurement.internal.zzaq zzy(String p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11);
        this.zzg();
        this.zzaw();
        int v1 = 0;
        try {
            int v2_0 = this.zze().query("apps", new String[] {"remote_config", "config_last_modified_time", "e_tag"}), "app_id=?", new String[] {p11}), 0, 0, 0);
        } catch (byte[] v0_1) {
            v2_0 = 0;
            this.zzu.zzaV().zzb().zzc("Error querying remote config. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p11), v0_1);
            if (v2_0 != 0) {
                v2_0.close();
            }
            return 0;
        } catch (byte[] v0_0) {
            p11 = v0_0;
            if (v1 != 0) {
                v1.close();
            }
            throw p11;
        }
        if (v2_0.moveToFirst()) {
            byte[] v0_4 = v2_0.getBlob(0);
            String v3_1 = v2_0.getString(1);
            String v4_2 = v2_0.getString(2);
            if (v2_0.moveToNext()) {
                this.zzu.zzaV().zzb().zzb("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p11));
            }
            if (v0_4 != null) {
                com.google.android.gms.measurement.internal.zzaq v5_6 = new com.google.android.gms.measurement.internal.zzaq(v0_4, v3_1, v4_2);
                v2_0.close();
                return v5_6;
            } else {
            }
        } else {
        }
    }

    public final boolean zzz(com.google.android.gms.internal.measurement.zzid p8, boolean p9)
    {
        this.zzg();
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8.zzA());
        com.google.android.gms.common.internal.Preconditions.checkState(p8.zzn());
        this.zzI();
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        int v1_1 = v0_0.zzaZ().currentTimeMillis();
        long v3_1 = p8.zzo();
        v0_0.zzc();
        if (v3_1 < (v1_1 - com.google.android.gms.measurement.internal.zzal.zzI())) {
            v0_0.zzaV().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzgu.zzl(p8.zzA()), Long.valueOf(v1_1), Long.valueOf(p8.zzo()));
        } else {
            long v3_3 = p8.zzo();
            v0_0.zzc();
            if (v3_3 > (com.google.android.gms.measurement.internal.zzal.zzI() + v1_1)) {
            }
        }
        try {
            com.google.android.gms.measurement.internal.zzgs v0_11 = this.zzg.zzp().zzv(p8.zzcc());
            String v2_6 = this.zzu;
            v2_6.zzaV().zzk().zzb("Saving bundle, size", Integer.valueOf(v0_11.length));
            long v3_10 = new android.content.ContentValues();
            v3_10.put("app_id", p8.zzA());
            v3_10.put("bundle_end_timestamp", Long.valueOf(p8.zzo()));
            v3_10.put("data", v0_11);
            v3_10.put("has_realtime", Integer.valueOf(p9));
        } catch (com.google.android.gms.measurement.internal.zzgs v9_10) {
            this.zzu.zzaV().zzb().zzc("Data loss. Failed to serialize bundle. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p8.zzA()), v9_10);
            return 0;
        }
        if (p8.zzaa()) {
            v3_10.put("retry_count", Integer.valueOf(p8.zzab()));
        }
        try {
            if (this.zze().insert("queue", 0, v3_10) != -1) {
                return 1;
            } else {
                v2_6.zzaV().zzb().zzb("Failed to insert bundle (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p8.zzA()));
                return 0;
            }
        } catch (com.google.android.gms.measurement.internal.zzgs v9_5) {
            this.zzu.zzaV().zzb().zzc("Error storing bundle. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p8.zzA()), v9_5);
            return 0;
        }
    }
}
