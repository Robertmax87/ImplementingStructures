package com.studying;

public class SLList {
    public class IntNode {
        public IntNode next;
        public int first;

        public IntNode(int first, IntNode next) {
            this.first = first;
            this.next = next;

        }
    }

    public IntNode firstly;
    public IntNode tail;
    public IntNode sentinal;
    public int size;

    public SLList() {
        sentinal = new IntNode(759, firstly);
    }
    public void addFirst(int x){
        firstly = new IntNode(x,tail);
        size++;

    }
    public void addLast(int x){
        if (firstly.next != null){
            IntNode p = firstly.next;
            while(p != null){
                p = p.next;
            }
            p = new IntNode(x,tail);
        } else{
            firstly.next =new IntNode (x,tail);
        }
    size++;
    }
    public int size(){
        return size;
    }

}
