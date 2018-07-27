package com.loveincode.Creational.prototype;

/**
 * 
 * Mage
 *
 */
public abstract class Mage extends Prototype {

  @Override
  public abstract Mage copy() throws CloneNotSupportedException;

}