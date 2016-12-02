package com.mercadolibre.demos.spark;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by ialvarez on 12/1/16.
 */
public class Summary implements Serializable{
    private Integer product;
    private BigDecimal summary;

    public Summary(Integer product, BigDecimal summary) {
        this.product = product;
        this.summary = summary;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public BigDecimal getSummary() {
        return summary;
    }

    public void setSummary(BigDecimal summary) {
        this.summary = summary;
    }
}
