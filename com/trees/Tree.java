package com.trees;

/**
 * Sort with Select sort.
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-05-15
 */
public final class Tree {
  int numberOfLeaves;
  int feetTall;
  String type;
  int age;

  /**
   * This is the constructor
   *
   * @param initNumberOfLeaves // initNumberOfLeaves
   * @param initFeetTall // initFeetTall
   * @param initType // initType
   * @param initAge // initAge
   */
  public Tree(int initNumberOfLeaves, int initFeetTall, String initType, int initAge) {
    this.numberOfLeaves = initNumberOfLeaves;
    this.feetTall = initFeetTall;
    this.type = initType;
    this.age = initAge;
  }

  // custom grow method so the user can input a specific amount of leaves
  public void grow(int numLeaves, int feet) {
    this.numberOfLeaves = this.numberOfLeaves + numLeaves;
    this.feetTall = this.feetTall + feet;
    this.age = this.age + 1;
  }

  // preset grow method
  public void grow() {
    this.feetTall = this.feetTall + 5;
    this.numberOfLeaves = this.numberOfLeaves + 10000;
    this.age = this.age + 1;
  }

  // lose all the leaves
  public void loseAllLeaves() {
    this.numberOfLeaves = 0;
  }

  // slower grow default method
  public void growSlow() {
    this.feetTall = this.feetTall + 1;
    this.numberOfLeaves = this.numberOfLeaves + 500;
  }
}
