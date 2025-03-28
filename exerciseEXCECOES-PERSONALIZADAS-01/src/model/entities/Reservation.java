package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer rumNumber;
    private Date checkin;
    private Date checkout;


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation() {
    }

    public Reservation(Integer rumNumber, Date checkin, Date checkout) {
        if (!checkout.after(checkin)) {
            throw new DomainException("check-out date must abe after check-in date");
        }
        this.rumNumber = rumNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }


    public Integer getRumNumber() {
        return rumNumber;
    }

    public void setRumNumber(Integer rumNumber) {
        this.rumNumber = rumNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }


    public long duration() {
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) {

        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkout.after(checkin)) {
            throw new DomainException("check-out date must abe after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }


    @Override
    public String toString() {
        return "Room "
                + rumNumber
                + ", checkin: "
                + sdf.format(checkin)
                + ", checkout: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + " nights";
    }
}
