package j6;
public final class n implements java.io.Closeable {
    public final java.net.URL a;
    public volatile java.util.concurrent.Future b;
    public com.google.android.gms.tasks.Task c;

    public n(java.net.URL p1)
    {
        this.a = p1;
        return;
    }

    public final android.graphics.Bitmap c()
    {
        String v2_0 = this.a;
        if (android.util.Log.isLoggable("FirebaseMessaging", 4)) {
            java.io.IOException v0_21 = new StringBuilder("Starting download of: ");
            v0_21.append(v2_0);
            android.util.Log.i("FirebaseMessaging", v0_21.toString());
        }
        java.io.IOException v0_2 = v2_0.openConnection();
        if (v0_2.getContentLength() > 1048576) {
            throw new java.io.IOException("Content-Length exceeds max size of 1048576");
        } else {
            java.io.IOException v0_5 = v0_2.getInputStream();
            try {
                StringBuilder v3_3 = q4.b.T(new j6.d(v0_5));
            } catch (String v1_2) {
                if (v0_5 != null) {
                    try {
                        v0_5.close();
                    } catch (java.io.IOException v0_7) {
                        v1_2.addSuppressed(v0_7);
                    }
                }
                throw v1_2;
            }
            if (v0_5 != null) {
                v0_5.close();
            }
            if (android.util.Log.isLoggable("FirebaseMessaging", 2)) {
                java.io.IOException v0_11 = new StringBuilder("Downloaded ");
                v0_11.append(v3_3.length);
                v0_11.append(" bytes from ");
                v0_11.append(v2_0);
                android.util.Log.v("FirebaseMessaging", v0_11.toString());
            }
            if (v3_3.length > 1048576) {
                throw new java.io.IOException("Image exceeds max size of 1048576");
            } else {
                java.io.IOException v0_18 = android.graphics.BitmapFactory.decodeByteArray(v3_3, 0, v3_3.length);
                if (v0_18 == null) {
                    String v1_5 = new StringBuilder("Failed to decode image: ");
                    v1_5.append(v2_0);
                    throw new java.io.IOException(v1_5.toString());
                } else {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        StringBuilder v3_9 = new StringBuilder("Successfully downloaded image: ");
                        v3_9.append(v2_0);
                        android.util.Log.d("FirebaseMessaging", v3_9.toString());
                    }
                    return v0_18;
                }
            }
        }
    }

    public final void close()
    {
        this.b.cancel(1);
        return;
    }
}
