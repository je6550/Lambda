package org.spetaxintegrated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class  Application {

    public static void main(String[] args) {

        //new Thread(()-> System.out.println("I AM THREAD1")).start();;
       // thread1.start();

        List<Data> list = new ArrayList<>();
        list.add(new Data("Prince"));
        list.add(new Data("John"));
        list.add(new Data("Legend"));
        list.add(new Data("Trump"));

        Collections.sort(list, (o1, o2)->
                {
                    return o1.getName().compareTo(o2.getName());
                }
                );

        for(Data data: list){
            System.out.println(data);
        }
    }

}
