import java.util.*;
/**
 * Write a description of class WareHouse here.
 * 
 * @author Javier Cumbres Tena
 * @version 12.10.2024
 */
public class WareHouse
{
    // instance variables - replace the example below with your own
    private int x;
    private Location location;
    private ArrayList <Order> orders;
    /**
     * Constructor for objects of class WareHouse
     */
    public WareHouse()
    {
        // initialise instance variables
        orders = new ArrayList <> ();
        x = 0;
    }
    /**
      *@return location of WareHouse
      *
     */
    public Location location()
    {
        return this.location;
    }
    /**
     * @param order  Añade un objeto tipo Order a la lista orders
     */
    public void addOrder(Order order)
    {
        if (orders.size()>0)
        {
            int index = 0 ;
            Order orderAux;
            while (index <= orders.size()-1)
            {   
                orderAux = orders.get(index);
                if (order.getDeliveryTime()< orderAux.getDeliveryTime())
                {
                    orders.add(index,order);
                    break;
                }
                else if ( order.getDeliveryTime()== orderAux.getDeliveryTime()){
                    if (order.getDeliveryPersonName().compareTo(orderAux.getDeliveryPersonName()) < 0)
                    {
                         orders.add(index,order);
                    }
                }
                index++;
            }
            orders.add(order);
        }
        else{
            orders.add(order);
        }
    }
    /**
     * @return Devuelve la lista orders
     */
    public List<Order> getOrders()
    {
        return orders;
    }
    /**
     * @return devuelve un objeto Order segun algun campo&////////////////////////////////////////
     */
    public Order getOrder(int id)
    {
        //tenemos que especificar como lo va a devolver
        if (id >=0 && id < orders.size())
        {
            return orders.get(id);
        }
        else
        {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + id);
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
