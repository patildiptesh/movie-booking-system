package com.exam.ass;

import java.util.ArrayList;
import java.util.List;
class BookingSystem {
    private List<Screen> screens = new ArrayList<>();

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public List<Screen> getScreens() {
        return screens;
    }
}