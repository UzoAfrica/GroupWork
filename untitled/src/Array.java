public class Array {

    private int[] items;
    private int count;
    public Array (int length){
        items = new int [length];
    }

    public void insert(int item){
        if (items.length == count) {
//            creating a new array(twice the size)
            int[] newItems = new int [count * 2];

//            Copy all the existing items
            for(int i = 0; i < count; i++ )
                newItems[i] = items[i];

//            Set "items" to this new arrays
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
// Validate the index
        if (index < 0 || index >= count)
            throw new illegalArgumentException();
    }
    public void print(){
        for(int i = 0; i < count; i++ )
            System.out.println(items[i]);
    }
}
