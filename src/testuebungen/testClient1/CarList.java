/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuebungen.testClient1;

import java.util.ArrayList;


/**
 *
 * @author primus
 */
public class CarList
{
  public final ArrayList<Car> carList = new ArrayList<>();


  public int getSize ()
  {
    return carList.size();
  }

  public void addCar(Car car)
  {
    carList.add(car);
  }


  public Car getCarAt (int row)
  {
    return carList.get(row);
  }
  
  
}
