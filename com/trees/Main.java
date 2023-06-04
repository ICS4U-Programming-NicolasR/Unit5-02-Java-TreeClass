package com.trees;

/**
 * Balloon program.
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-05-15
 */
public final class Main {

  /**
   * This is the main method.
   *
   * @param args //unused
   */
  public static void main(final String[] args) {
    Tree tree1 = new Tree(5000, 4, "birch", 9);

    // use all the methods and print all the info
    System.out.printf("Tree size and leaves are: %d, %d%n", tree1.feetTall, tree1.numberOfLeaves);
    tree1.grow();
    System.out.printf("Tree size and leaves are: %d, %d%n", tree1.feetTall, tree1.numberOfLeaves);
    tree1.grow(5, 20);
    System.out.printf("Tree size and leaves are: %d, %d%n", tree1.feetTall, tree1.numberOfLeaves);
    tree1.loseAllLeaves();
    System.out.printf("In winter the tree has %d leaves%n", tree1.numberOfLeaves);
    tree1.growSlow();
    System.out.printf("Tree size and leaves are: %d, %d%n", tree1.feetTall, tree1.numberOfLeaves);
  }
}
