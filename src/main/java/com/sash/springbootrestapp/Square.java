package com.sash.springbootrestapp;

import java.time.Instant;

public class Square
{
    int squareValue;
    Instant currentTime;

    public Square(int squareValue)
    {
        this.squareValue = squareValue;
    }

    public int getSquareValue()
    {
        return squareValue*squareValue;
    }

    public void setSquareValue(int squareValue)
    {
        this.squareValue = squareValue;
    }

    public Instant getCurrentTime()
    {
        return Instant.now();
    }

    public void setCurrentTime(Instant currentTime)
    {
        this.currentTime = currentTime;
    }
}
