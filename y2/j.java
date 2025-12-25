package y2;
public final class j extends android.database.sqlite.SQLiteOpenHelper {
    public static final String c;
    public static final int d;
    public static final java.util.List e;
    public final int a;
    public boolean b;

    static j()
    {
        java.util.List v0_4 = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        v0_4.append(System.currentTimeMillis());
        v0_4.append(")");
        y2.j.c = v0_4.toString();
        y2.j.d = 7;
        y2.i v1_2 = new y2.i(0);
        new y2.i(1);
        new y2.i(2);
        new y2.i(3);
        new y2.i(4);
        new y2.i(5);
        y2.j.e = java.util.Arrays.asList(new y2.i[] {v1_2, new y2.i(6)}));
        return;
    }

    public j(android.content.Context p2, int p3, String p4)
    {
        super(p2, p4, 0, p3);
        super.b = 0;
        super.a = p3;
        return;
    }

    public static void c(android.database.sqlite.SQLiteDatabase p3, int p4, int p5)
    {
        java.util.List v0 = y2.j.e;
        if (p5 > v0.size()) {
            String v1_25 = new StringBuilder("Migration from ");
            v1_25.append(p4);
            v1_25.append(" to ");
            v1_25.append(p5);
            v1_25.append(" was requested, but cannot be performed. Only ");
            v1_25.append(v0.size());
            v1_25.append(" migrations are provided");
            throw new IllegalArgumentException(v1_25.toString());
        }
        while (p4 < p5) {
            switch (((y2.i) v0.get(p4)).a) {
                case 0:
                    p3.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    p3.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    p3.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    p3.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    p3.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    p3.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    p3.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    p3.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    p3.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    p3.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    p3.execSQL("DROP TABLE IF EXISTS event_payloads");
                    p3.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                case 4:
                    p3.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    p3.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    p3.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    p3.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    p3.execSQL(y2.j.c);
                    break;
                case 5:
                    p3.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                    break;
                default:
                    p3.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                    p3.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                    p3.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
            }
            p4++;
        }
        return;
    }

    public final void onConfigure(android.database.sqlite.SQLiteDatabase p4)
    {
        this.b = 1;
        android.database.Cursor v1_1 = new String[0];
        p4.rawQuery("PRAGMA busy_timeout=0;", v1_1).close();
        p4.setForeignKeyConstraintsEnabled(1);
        return;
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase p3)
    {
        if (!this.b) {
            this.onConfigure(p3);
        }
        y2.j.c(p3, 0, this.a);
        return;
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
    {
        p1.execSQL("DROP TABLE events");
        p1.execSQL("DROP TABLE event_metadata");
        p1.execSQL("DROP TABLE transport_contexts");
        p1.execSQL("DROP TABLE IF EXISTS event_payloads");
        p1.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        p1.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.b) {
            this.onConfigure(p1);
        }
        y2.j.c(p1, 0, p3);
        return;
    }

    public final void onOpen(android.database.sqlite.SQLiteDatabase p2)
    {
        if (!this.b) {
            this.onConfigure(p2);
        }
        return;
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p2, int p3, int p4)
    {
        if (!this.b) {
            this.onConfigure(p2);
        }
        y2.j.c(p2, p3, p4);
        return;
    }
}
