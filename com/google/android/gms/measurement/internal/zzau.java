package com.google.android.gms.measurement.internal;
final class zzau extends com.google.android.gms.internal.measurement.zzby {
    final synthetic com.google.android.gms.measurement.internal.zzav zza;

    public zzau(com.google.android.gms.measurement.internal.zzav p2, android.content.Context p3, String p4)
    {
        java.util.Objects.requireNonNull(p2);
        this.zza = p2;
        super(p3, "google_app_measurement.db", 0, 1);
        return;
    }

    public final android.database.sqlite.SQLiteDatabase getWritableDatabase()
    {
        android.database.sqlite.SQLiteException v0_0 = this.zza;
        v0_0.zzu.zzc();
        if (!v0_0.zzas().zzc(3600000)) {
            throw new android.database.sqlite.SQLiteException("Database open failed");
        } else {
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException) {
                android.database.sqlite.SQLiteException v0_3 = this.zza;
                v0_3.zzas().zza();
                com.google.android.gms.measurement.internal.zzgs v1_3 = v0_3.zzu;
                v1_3.zzaV().zzb().zza("Opening the database failed, dropping and recreating it");
                v1_3.zzc();
                if (!v1_3.zzaY().getDatabasePath("google_app_measurement.db").delete()) {
                    v1_3.zzaV().zzb().zzb("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    com.google.android.gms.measurement.internal.zzgs v1_6 = super.getWritableDatabase();
                    v0_3.zzas().zzb();
                    return v1_6;
                } catch (android.database.sqlite.SQLiteException v0_6) {
                    this.zza.zzu.zzaV().zzb().zzb("Failed to open freshly created database", v0_6);
                    throw v0_6;
                }
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

    public final void onOpen(android.database.sqlite.SQLiteDatabase p14)
    {
        com.google.android.gms.measurement.internal.zzic v6 = this.zza.zzu;
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", com.google.android.gms.measurement.internal.zzav.zzai());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", com.google.android.gms.measurement.internal.zzav.zzaj());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", com.google.android.gms.measurement.internal.zzav.zzak());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", com.google.android.gms.measurement.internal.zzav.zzam());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", com.google.android.gms.measurement.internal.zzav.zzal());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", com.google.android.gms.measurement.internal.zzav.zzan());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", com.google.android.gms.measurement.internal.zzav.zzao());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", com.google.android.gms.measurement.internal.zzav.zzap());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", 0);
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", com.google.android.gms.measurement.internal.zzav.zzaq());
        com.google.android.gms.internal.measurement.zzqp.zza();
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", com.google.android.gms.measurement.internal.zzav.zzar());
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", com.google.android.gms.measurement.internal.zzav.zza);
        com.google.android.gms.internal.measurement.zzpo.zza();
        com.google.android.gms.measurement.internal.zzaw.zza(v6.zzaV(), p14, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", 0);
        return;
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        return;
    }
}
