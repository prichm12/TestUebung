/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuebungen.testClient1;

import javax.swing.AbstractListModel;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author primus
 */
public class ClientListModel extends AbstractTableModel
{
  private String columnNames[] = {"builder","typ"};
  private final CarList carlist;

  public ClientListModel (CarList carlist)
  {
    this.carlist = carlist;
  }

  @Override
  public int getRowCount ()
  {
    return carlist.getSize();
  }


  @Override
  public int getColumnCount ()
  {
    return columnNames.length;
  }


  @Override
  public Object getValueAt (int rowIndex, int columnIndex)
  {
    Car car;
    car = carlist.getCarAt(rowIndex);
    switch(columnIndex)
    {
      case 0: car.getMark();
      case 1: car.getTyp();
      default: throw new IllegalStateException();
    }
  }

  @Override
  public String getColumnName(int column)
  {
    return columnNames[column];
  }
}
