package Patterns.Prototype;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public interface PrototypeCapable extends Cloneable{
    public PrototypeCapable clone()throws CloneNotSupportedException;
}
