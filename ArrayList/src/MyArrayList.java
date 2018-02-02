public class MyArrayList<E> implements MyList<E> {
    private static final int MAX = 10;
    private int size;  // number of objects in ArrayList
    private Object[] array;

    // constructor
    public MyArrayList() {
        // begin with array of capacity MAX
        this.size = 0;
        this.array = new Object[MAX];
    }

    // get size of ArrayList
    public int size() {
        return this.size;
    }

    // get element in ArrayList at an index
    public E get( int index ) {
        return (E)this.array[index];
    }

    // get index of named element in ArrayList
    public int indexOf( E element )	{
        for ( int ii = 0; ii < this.size; ii++ )
        {
            if ( this.array[ii] == element )
            {
                return ii;
            }
        }

        return -1; // if element does not exist, return -1
    }

    // add element to end of ArrayList
    // increase size
    public void add( E element ) {
        // check whether ArrayList needs to be expanded to a larger size
        if ( this.size == this.array.length )
        {
            // need to make room for more elements, increase size by doubling array
            Object[] array2 = new Object[this.array.length * 2];

            // copy old array into new (deep copy)
            for ( int jj = 0; jj < this.array.length; jj++ )
            {
                array2[jj] = this.array[jj];
            }

            // set new array as ArrayList array (shallow copy)
            this.array = array2;
        }

        // add element to ArrayList
        this.array[this.size] = element;

        // update size
        this.size++;
    }

    // remove element at index from ArrayList
    // save space by reducing size of array when appropriate
    // decrease size
    public void remove( int index ) {
        // check whether index exceeds bounds
        if ( index >= this.size || index < 0 )
        {
            // print error message
            System.out.println( "ERROR: Element at " + index + " exceeds bounds." );
            return;
        }

        // find element in ArrayList
        // remove element, shift latter elements back
        for ( int kk = index; kk < this.size() - 1; kk++ )
        {
            this.array[kk] = this.array[kk + 1];
        }

        // update size
        this.size--;

        // cut size of internal array in half, when appropriate
        if ( this.size * 4 <= this.array.length && this.array.length / 2 >= this.MAX) //added the things after &&
        {
            // ******** YOUR CODE HERE ********
            // create new array which is half the size of old array
            // new array size should not drop below MAX

            // copy old array into new (What kind of copy is this?)

            // set new array as ArrayList array (What kind of copy is this?)
            // ******** END YOUR CODE HERE ********
            Object[] array2 = new Object[this.array.length / 2];

            for ( int jj = 0; jj < this.array.length / 2; jj++ )
            {
                array2[jj] = this.array[jj];
            }
            this.array = array2;
        }
    }
}