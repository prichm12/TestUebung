/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuebungen.testClient1;


/**
 *
 * @author primus
 */
public class Car
{
  private final String mark;
  private final String typ;


  public Car (String mark, String typ)
  {
    this.mark = mark;
    this.typ = typ;
  }


  public String getMark ()
  {
    return mark;
  }


  public String getTyp ()
  {
    return typ;
  }
  
}
