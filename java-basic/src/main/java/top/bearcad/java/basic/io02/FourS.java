package top.bearcad.java.basic.io02;

import lombok.Data;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 19:58
 **/
@Data
public abstract class FourS implements Car{
    private Car car;
    public FourS(Car car){
        this.car=car;
    }

    @Override
    public void skin() {
        car.skin();
    }
}
