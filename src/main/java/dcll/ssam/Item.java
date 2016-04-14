package dcll.ssam;

/**
 * Created by mousa on 14/04/2016.
 */
public class Item {

    private Object value ;
    Item(Object value){ setValue(value);}

    /**
     * Exigence nume 3
     */

    public Object getValue(){
        return value ;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

