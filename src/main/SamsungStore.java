package main;

/**
 *
 * @author Dell
 */
public class SamsungStore implements IAbstractFactory {
    
    public IComputadora crearComputadora(){
        return new GalaxyLaptop();
    }
    
    public ITablet crearTablet(){
        return new GalaxyTab();
    }
}
