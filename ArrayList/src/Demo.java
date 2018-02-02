public class Demo {

    public static void run_integer_demo( MyList<Integer> list ) {
        for ( int ii = 0; ii < 20; ii++ )
        {
            list.add(ii);
        }

        for ( int jj = 0; jj < list.size(); jj++ )
        {
            System.out.print( list.get(jj) );
            System.out.print( " " );
        }

        System.out.println();

        // removing until need to resize
        for ( int kk = 0; kk < 18; kk++ )
        {
            list.remove(0);
        }

        System.out.println();

        // print remaining list items
        for ( int ll = 0; ll < list.size(); ll++ )
        {
            System.out.print( list.get(ll) );
            System.out.print( " " );
        }

        System.out.println();
    }

    public static void main ( String[] args ) {
        run_integer_demo( new MyArrayList<Integer>() );
    }
}