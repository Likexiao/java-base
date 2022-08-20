package com.java.base.algorithm;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
            if(s == null)return false;
            Stack<Character> stack = new Stack<>();
            for (char c:
                 s.toCharArray()) {

              if (c == '(') {
                  stack.push(')');
              } else if (c == '[') {
                  stack.push(']');
              }else if (c == '{') {
                  stack.push('}');
              }
                if(c == ')'||c == '}'||c == ']'){
                    if(stack.isEmpty()) return false;
                  char com = stack.pop();
                  if(!(c == com)){
                      return false;
                  }
              }
            }
            if(stack.isEmpty()){
                return true;
            }else {
                return false;
            }

    }
}
