package com.javaAlgos;

import java.util.ArrayList;

public class Node {
    private int value;
    private ArrayList<Node> children;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void addChild(Node node) {
        this.children.add(node);
    }

    public void depthFirstSearch(ArrayList<Boolean> visited) {
        if (visited.get(value)) return;
        visited.set(value, true);
        System.out.println(value);
        for (Node child : children) child.depthFirstSearch(visited);
    }
}
