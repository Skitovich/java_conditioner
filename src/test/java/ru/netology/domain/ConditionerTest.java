package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int maxTempMinusOne = conditioner.getMaxTemperature() - 1;
        conditioner.setCurrentTemperature(maxTempMinusOne);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());


    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int minTempPlusOne = conditioner.getMinTemperature() + 1;
        conditioner.setCurrentTemperature(minTempPlusOne);
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }


}