package com.empty.sample;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by mr3mpty on 03.05.2016.
 */
public class MessageDispatcher {

    public static final String MESSAGE_BROADCAST_ACTION = "message_broadcast_action";
    public static final String MESSAGE_BROADCAST_CONTENT = "message_broadcast_content";

    public static void BroadcastMessage(String message) {
        Context context = App.getInstance().getApplicationContext();
        Intent intent = new Intent();
        intent.setAction(MESSAGE_BROADCAST_ACTION);
        intent.putExtra(MESSAGE_BROADCAST_CONTENT, message);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
