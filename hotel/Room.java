//P2.13
package ss.week3.hotel;

import ss.week3.hotel.Guest;

public class Room {

    private int number;
    private Guest guest;
    private Safe safe;
    private double price;
    // ------------------ Constructor ------------------------

    /**
     * Creates a <code>Room</code> with the given number, without a guest.
     * @param no number of the new <code>Room</code>
     */
    public Room(int no) 
    {
    	this.number = no;
    	safe=new Safe(); //initialize the safe, or unnecessary? 
    }
    
	/**P3.13 
	 * In the constructor a new PricedSafe should be created
	 *  and given to the parent(Room). 
	 *  Therefore you should add an extra constructor to 
	 *  Room which receives and uses that given Safe.*/
    public Room (int no,Safe priSafe)
    {
    	this.number = no;
    	this.safe=priSafe;
    }
    // ------------------ Queries --------------------------

    /**
     * Returns the number of this <code>Room</code>.
     */
    public int getNumber() {
    	return number;
    }
    
    /**
     * Returns the safe of this Room.
     */
    public Safe getSafe() 
    {
    	return this.safe;//
    }
    /**
     * Returns the current guest living in this <code>Room</code>.
     * @return the guest of this <code>Room</code>;
     *         <code>null</code> if this <code>Room</code> 
     *         is not currently rented
     */
    public Guest getGuest() {
    	return guest;
    }
    
    public double getPrice()
    {
    	return this.price;
    }
    // ------------------ Commands --------------------------

    /**
     * Assigns a <code>Guest</code> to this <code>Room</code>.
     * @param guest2 the next guest renting this <code>Room</code>;
     *        if <code>null</code> is passed, this <code>Room</code>
     *        is empty afterwards
     */
    public void setGuest(ss.week3.hotel.Guest guest2) {
    	this.guest = guest2;
    }
    
    public void setPrice(double thePrice)
    {
    	this.price=thePrice;
    }
    
    public String toString()
    {
    	return Integer.toString(this.number);
    }
}
