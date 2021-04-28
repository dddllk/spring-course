package com.dlkyy.excep;

/**
 * Created by dlkyy on 2021/4/27 21:18
 */
public class NotEnoughException extends RuntimeException{
  public NotEnoughException(){
    super();
  }
  public NotEnoughException(String msg){
    super(msg);
  }
}
