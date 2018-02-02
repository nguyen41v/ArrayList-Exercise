public interface MyList<E> {
    public int size();
    public E get( int index );
    public int indexOf( E element );

    public void add( E element );
    public void remove( int index );
}