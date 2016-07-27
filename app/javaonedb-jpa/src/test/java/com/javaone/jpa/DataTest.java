package com.javaone.jpa;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class DataTest {
    private Data data;

    @Before
    public void setup() {
        final Calendar calendar = (Calendar)Calendar.getInstance().clone();
        calendar.set(2016, 1, 1, 0, 0, 0);
        data = new Data();
        data.setCodData(1);
        data.setNameData(calendar.getTime().toString());
    }

    @Test
    public void print() {
        final Calendar calendar = (Calendar)Calendar.getInstance().clone();
        calendar.set(2016, 1, 1, 0, 0, 0);
        assertEquals("1 - " + calendar.getTime().toString(), data.print());
    }

}