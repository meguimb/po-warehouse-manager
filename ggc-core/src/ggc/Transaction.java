package ggc;

import java.io.IOException;
import java.io.Serializable;

public class Transaction implements Serializable {

    /** The Transaction's id */
    private static int _id;

    /** The date where this Transaction ocurred */
    private static int _date;

    /** The product that this Transaction refers to */
    private static Product _product;

    /** The Transaction's quantity */
    private static int _quantity;

    /** The Transaction's Partner */
    private static Partner _partner;

    

}