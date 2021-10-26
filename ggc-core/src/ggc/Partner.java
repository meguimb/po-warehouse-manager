package ggc;

import java.io.IOException;
import java.io.Serializable;

public class Partner implements Serializable {

    /** Serial number for serialization. */
    private static final long serialVersionUID = 202109192006L;

    /** The parner's id. */
    private static String _id;

    /** The partner's name. */
    private static String _name;

    /**  The partner's notifications */
    private Notification [] _notifications;

    /** The partner's current delivery address */
    private DeliveryMethod _address;

    /** The partner's transactions */
    private Transaction [] _transactions;

    /** The partner's status */
    private Status _status;


}