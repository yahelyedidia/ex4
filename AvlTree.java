package oop.ex4.data_structures;

import java.util.Iterator;

public class AvlTree implements Iterable<Integer>{

    private int size = 0;
    
    private static AvlTree root;


    /**
     * The default constructor.
     */
    public AvlTree(){

    }

    /**
     * A copy constructor that creates a deep copy of the given AvlTree.
     * @param tree - The AVL tree to be copied.
     */
    public AvlTree(AvlTree tree){

    }

    /**
     * A constructor that builds a new AVL tree containing all unique values in the input array.
     * @param data -  the values to add to tree.
     */
    public AvlTree(int[] data){

    }

    /**
     * Add a new node with the given key to the tree.
     * @param newValue - the value of the new node to add.
     * @return true if the value to add is not already in the tree and it was successfully added,
     * false otherwise.
     */
    public boolean add(int newValue){

    }

    /**
     * Check whether the tree contains the given input value.
     * @param searchValue - value to search for
     * @return if val is found in the tree, return the depth of the node (0 for the root)
     * with the given value if it was found in the tree, -1 otherwise.
     */
    public int contains(int searchValue){


    }

    /**
     * Removes the node with the given value from the tree, if it exists.
     * @param toDelete - the value to remove from the tree.
     * @return true if the given value was found and deleted, false otherwise.
     */
    public boolean delete(int toDelete){

    }

    /**
     * @return the number of nodes in the tree.
     */
    public int size(){
        return size;
    }

    /**
     * @return an iterator for the Avl Tree. The returned iterator iterates over the tree nodes in an
     * ascending order, and does NOT implement the remove() method.
     */
    public Iterator<Integer> iterator(){

    }

    /**
     * Calculates the minimum number of nodes in an AVL tree of height h.
     * @param h - the height of the tree (a non-negative number) in question.
     * @return the minimum number of nodes in an AVL tree of the given height.
     */
    public static int findMinNodes(int h){
        AvlTree curNode = root;
        for (int i = 0; i < h; i++){
            curNode = curNode.getLeftSon;
        return curNode.getData;
        }
    }

    /**
     * Calculates the maximum number of nodes in an AVL tree of height h.
     * @param h - the height of the tree (a non-negative number) in question.
     * @return the maximum number of nodes in an AVL tree of the given height.
     */
    public static int findMaxNodes(int h){
        AvlTree curNode = root;
        for (int i = 0; i < h; i++){
            curNode = curNode.getRightSon;
            return curNode.getData;
        }
    }
}
