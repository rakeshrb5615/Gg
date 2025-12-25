package com.chilllive.chillwallpaperproject;
public class MyWallpaperService extends android.service.wallpaper.WallpaperService {

    public MyWallpaperService()
    {
        return;
    }

    public final android.service.wallpaper.WallpaperService$Engine onCreateEngine()
    {
        return new i2.n0(this);
    }
}
