package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand, IsMaintenance{
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
}
