package Interfaces;

public interface ArrayList<T> {

    T get( int index );

    T set( int index, T element );

    void add( int index, T element );

    T remove( int index );

    int size( );

    boolean isEmpty( );
}

