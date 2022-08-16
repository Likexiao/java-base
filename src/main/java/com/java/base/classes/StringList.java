package com.java.base.classes;

import lombok.Data;

import java.util.*;
@Data
public class StringList<T> {
  private T[] t;
  String s ;
  public StringList(){
    s="ggg";
  }
}
