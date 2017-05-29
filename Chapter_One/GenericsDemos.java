package Chapter_One;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sachin on 27/4/17.
 */
public class GenericsDemos {


    public static void main(String[] args) {
        List<Integer> ints=new ArrayList<>();
        ints.add(2);
        ints.add(22);
        ints.add(21);
        List<? extends Number> nums =ints;
        //nums.add(8); not fine as 8 is not a number its a int
        // and we cant create a number type object

        List<Object> objs =new ArrayList<>();
        objs.add(5);
        objs.add(5);
        objs.add(5);
        copythat(objs,ints);
        System.out.println(objs);
    }


    public static <T> void copythat(List<? super T> dst, List<? extends T> src) throws IllegalArgumentException{
        if(dst.size() != src.size()){
           throw  new  IllegalArgumentException("set not increase the capacity");
        }
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }
}
