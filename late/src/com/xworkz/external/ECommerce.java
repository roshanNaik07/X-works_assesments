package com.xworkz.external;

import com.xworkz.internal.CourierService;

public class ECommerce {
    CourierService courier;

    public ECommerce(CourierService courier) {
        this.courier = courier;
        System.out.println("ECommerce constructor with CourierService");
    }

    public void shipProduct() {
        if (courier != null) {
            System.out.println("Shipping product via courier");
            courier.deliverParcel();
        }
    }
}
