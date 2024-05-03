package model;


public abstract class ObjTree<T> implements Comparable<T>  {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
