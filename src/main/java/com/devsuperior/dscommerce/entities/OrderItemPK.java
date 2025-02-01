package com.devsuperior.dscommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    // É manytoOne pq a classe do meio criada, esta entre dois
    // manyToMany .. e com isso é necessario o @ManyToOne
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItemPK(){

    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
