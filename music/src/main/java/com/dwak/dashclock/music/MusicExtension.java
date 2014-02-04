package com.dwak.dashclock.music;

import android.content.Intent;

import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

/**
 * Created by vrajeevan on 2/4/14.
 */
public class MusicExtension extends DashClockExtension {
    @Override
    protected void onUpdateData(int i) {
        // play
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra("command", "play");
        sendBroadcast(intent);
        publishUpdate(new ExtensionData()
                .visible(true)
                .icon(R.drawable.ic_launcher)
                .status("Music")
                .expandedTitle("Music")
                .clickIntent(intent));
    }
}
