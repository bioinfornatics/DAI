package com.springrts.dai.event;
import com.springrts.ai.oo.AIFloat3;

public interface ISeismicPing {
    AIFloat3 getPos();

    float getStrength();
}
