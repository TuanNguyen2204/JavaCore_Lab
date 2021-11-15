/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTree;

import Entity.Book;

/**
 *
 * @author Tuan
 */
public class Node {
    public Book data;
    public Node left, right;

    public Node() {
    }

    public Node(Book data) {
        this.data = data;
        this.left = this.right = null;
    }
}
