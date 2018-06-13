package com.loveincode.prototype;

/**
 * 
 * ElfMage
 *
 */
public class ElfMage extends Mage {

  
  private String helpType;
  
  public ElfMage(String helpType) {
    this.helpType = helpType;
  }

  public ElfMage(ElfMage elfMage) {
    this.helpType = elfMage.helpType;
  }

  @Override
  public ElfMage copy() throws CloneNotSupportedException {
    return new ElfMage(this);
  }

  @Override
  public String toString() {
    return "Elven mage helps in " + helpType;
  }

}