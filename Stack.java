package com.OasisProject;

import java.util.ArrayList;
import java.util.Stack;

//Stack is LIFO type datastructure
//   ---we will implement it by using following---
//        1>array(which we will not use)
//        2>arraylist
//        3>Collection Framework
//        4>Linked List


class Stacks {
    //by using arraylist
    static class StackAL{
        ArrayList<Integer> list = new ArrayList<>();
        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }


    }

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next= null;
        }
    }
    static class StackLL{
        public static Node head= null;
        public static void push(int data){
            Node newNode=  new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static boolean isEmpty(){
            return head==null;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top= head;
            head=head.next;
            return top.data;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            Node top= head;
            return top.data;
        }
    }


    public static void main(String[] args) {
       //Stacks by ArrayList implementation
        StackAL s= new StackAL();
        s.push(9);
        s.push(99);
        s.push(90);
        s.push(39);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        //Stacks by LinkList implementation
        StackLL s1= new StackLL();
        s1.push(95);
        s1.push(96);
        s1.push(97);
        s1.push(98);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

        //Stacks by collection framework implementation
        Stack <Integer> s11= new Stack<>();
        s11.push(95);
        s11.push(96);
        s11.push(97);
        s11.push(98);

        while(!s11.isEmpty()){
            System.out.println(s11.peek());
            s11.pop();
        }


    }
}
