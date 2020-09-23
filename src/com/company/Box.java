package com.company;

public class Box {
    private float height;
    private float width;
    private float depth;

    public Box(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(float sizes) {
        this.height = sizes;
        this.width = sizes;
        this.depth = sizes;
    }

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public float getArea() {
        return 2 * getHeight() * getDepth() + 2 * getHeight() * getWidth() +
                + 2 * getDepth() * getWidth();
    }

    public float getVolume() {
        return getDepth() * getWidth() * getHeight();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
}
