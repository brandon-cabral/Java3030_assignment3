package edu.uml.bcabral;

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
        return this.myArrayList.contains(o);
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
        return this.myArrayList.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return this.myArrayList.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.myArrayList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.myArrayList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.myArrayList.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return this.myArrayList.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.myArrayList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.myArrayList.retainAll(c);
    }

    @Override
    public void clear() {
        this.myArrayList.clear();
    }

    @Override
    public E get(int index) {
        return this.myArrayList.get(index);
    }

    @Override
    public E set(int index, E element) {
        return this.myArrayList.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        this.myArrayList.add(index, element);
    }

    @Override
    public E remove(int index) {
        return this.myArrayList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return this.myArrayList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.myArrayList.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.myArrayList.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return this.myArrayList.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return this.myArrayList.subList(fromIndex,toIndex);
    }
}
