package com.example.gwl.foregroundservice;

public class Constants {


    public interface ACTION {
        String MAIN_ACTION = "com.example.gwl.foregroundservice.action.main";
        String INIT_ACTION = "com.example.gwl.foregroundservice.action.init";
        String PREV_ACTION = "com.example.gwl.foregroundservice.action.prev";
        String PLAY_ACTION = "com.example.gwl.foregroundservice.action.play";
        String NEXT_ACTION = "com.example.gwl.foregroundservice.action.next";
        String STARTFOREGROUND_ACTION = "com.example.gwl.foregroundservice.action.startforeground";
        String STOPFOREGROUND_ACTION = "com.example.gwl.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
    }
}