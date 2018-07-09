package com.dasharath.dpatterns;

public class SingletonClone implements Cloneable{

    private static SingletonClone singletonClone = null;

    private SingletonClone() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return getInstance();
        return super.clone();
    }

    protected Object readResolve() {
        return getInstance();
    }
    //-----> This is my implementation to stop it but Its not working. :(
    public Object newInstance() throws InstantiationException {
        throw new InstantiationError( "Creating of this object is not allowed." );
    }

    public static SingletonClone getInstance() {
        if (singletonClone == null)
            singletonClone = new SingletonClone();
        return singletonClone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonClone singletonClone1 = SingletonClone.getInstance();
        SingletonClone singletonClone2 = SingletonClone.getInstance();
        SingletonClone singletonClone3 = (SingletonClone) singletonClone2.clone();

        System.out.println(singletonClone1.hashCode());
        System.out.println(singletonClone2.hashCode());
        System.out.println(singletonClone3.hashCode());

    }
}
