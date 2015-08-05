package com.relferreira.recyclerview.data;

import com.relferreira.recyclerview.models.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonData {

    public static List<Person> getPersons(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        list.add(new Person("Ferreira", "Renan", 23));
        return list;
    }
}
