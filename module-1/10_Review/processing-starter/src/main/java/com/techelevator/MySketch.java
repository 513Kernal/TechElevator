package com.techelevator;

import processing.core.PApplet;

public class MySketch extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        background(255,0,0);
    }

    @Override
    public void draw() {

        fill(255,255,100);

        circle(random(width), random(height), 50);
    }

    }


