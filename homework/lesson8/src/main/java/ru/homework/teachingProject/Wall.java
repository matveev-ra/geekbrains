package ru.homework.teachingProject;

/**
 * Стена
 */
public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }

}