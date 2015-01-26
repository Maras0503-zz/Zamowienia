package zamowienia;

import java.util.Date;

public class Zamowienie {
    private boolean realized;
    private Date orderDate;

    public boolean isRealized() {
        return realized;
    }

    public void setRealized(boolean realized) {
        this.realized = realized;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date zamowiono) {
        this.orderDate = zamowiono;
    }
    
}
