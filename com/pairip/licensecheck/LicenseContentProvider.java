package com.pairip.licensecheck;
public class LicenseContentProvider extends android.content.ContentProvider {

    public LicenseContentProvider()
    {
        return;
    }

    public int delete(android.net.Uri p1, String p2, String[] p3)
    {
        throw new UnsupportedOperationException("Delete is not supported ");
    }

    public String getType(android.net.Uri p2)
    {
        throw new UnsupportedOperationException("GetType is not supported ");
    }

    public android.net.Uri insert(android.net.Uri p1, android.content.ContentValues p2)
    {
        throw new UnsupportedOperationException("Insert is not supported ");
    }

    public boolean onCreate()
    {
        new com.pairip.licensecheck.LicenseClient(this.getContext()).initializeLicenseCheck();
        return 1;
    }

    public android.database.Cursor query(android.net.Uri p1, String[] p2, String p3, String[] p4, String p5)
    {
        throw new UnsupportedOperationException("Query is not supported ");
    }

    public int update(android.net.Uri p1, android.content.ContentValues p2, String p3, String[] p4)
    {
        throw new UnsupportedOperationException("Update is not supported ");
    }
}
