package com.loveincode.prototype;

/**
 * 
 * Beast
 *
 */
public abstract class Beast extends Prototype {

  @Override
  public abstract Beast copy() throws CloneNotSupportedException;

}