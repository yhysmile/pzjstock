package com.pzj.core.product.area;

/**
 * Created by Administrator on 2017-3-21.
 */
public enum AreaStage {
    ENABLE(1),
    DELTEED(0)
    ;

    private int value;

    AreaStage(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
