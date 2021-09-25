package com.javaAlgos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node node = new Node(0);

        for (int i = 1; i < 10; i++) {
            Node child = new Node(i);
            node.addChild(child);

            for (int j = i*10; j < (i*10) + 10; j++) {
                Node grandChild = new Node(j);
                child.addChild(grandChild);

                for (int k = j*10; k < (j*10) + 10; k++) {
                    Node greatGrandChild = new Node(k);
                    grandChild.addChild(greatGrandChild);
                }
            }
        }

        ArrayList<Boolean> visited = new ArrayList<Boolean>();

        for (int i = 0; i < 1000; i++) {
            visited.add(false);
        }

        node.depthFirstSearch(visited);
    }
}
