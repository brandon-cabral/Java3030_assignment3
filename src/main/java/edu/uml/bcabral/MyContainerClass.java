package main.java.edu.uml.bcabral;

import java.util.*;

public class MyContainerClass<E> implements List<E>{

    private ArrayList<E> myArrayList = new ArrayList<>();

    @Override
    public int size() {
        return this.myArrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.myArrayList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.myArrayList.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.myArrayList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.myArrayList([] a);
    }

    @Override
    public boolean add(E e) {
        return this.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return this.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.retainAll(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return this.get(index);
    }

    @Override
    public E set(int index, E element) {
        return this.set(index, element);
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return this.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return this.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return this.subList(fromIndex,toIndex);
    }
}
