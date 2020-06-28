package com.arunveersingh.javanullinteroperatibility.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {
    private String title;

    // Using @NotNull we can tell kotlin in advance that
    // null is not allowed here
    public void addTitle(@NotNull String title){
        this.title = title;
    }

    // Using @Nullable annotation tells kotlin that
    // this method can return null
    public @Nullable String meetingTitle(){
        return title;
    }

    public String titleCanBeNull(){
        return title;
    }
}
