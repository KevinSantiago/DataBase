package controllers;

import java.util.ArrayList;

/**
 * States the methods that Manager classes must have.
 * Created by Jose A Rodriguez Rivera on 10/2/16.
 */
public interface Manager<E> {
    ArrayList<E> getAll();
    E getByID(int id);
    int add(E elementToAdd);
    int remove(int id);
    int update(E elementToUpdate);
    int getNumberOfElements();
}
