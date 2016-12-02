package com.mercadolibre.demos.spark;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by ialvarez on 12/1/16.
 */
public class Sale implements Serializable{
    private UUID uuid;
    private Integer product;
    private BigDecimal price;

    public Sale(){}

    public Sale(UUID uuid, Integer product, BigDecimal price) {
        this.uuid = uuid;
        this.product = product;
        this.price = price;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
