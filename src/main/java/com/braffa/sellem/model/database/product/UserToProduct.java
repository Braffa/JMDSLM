package com.braffa.sellem.model.database.product;

import java.util.Date;


public class UserToProduct {
    
    private String productId;
    
    private String productIndex;
    
    private String userId;

    private Date crDate;
    
    private Date updDate;
    
    public UserToProduct (String productId, String productIndex, String userId, Date crDate, Date updDate) {
        this.productId = productId;
        this.productIndex = productIndex;
        this.userId = userId;
        this.crDate = crDate;
        this.updDate = updDate;
    }

    
    public String getProductId() {
        return productId;
    }

    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    
    public String getProductIndex() {
        return productIndex;
    }

    
    public void setProductIndex(String productIndex) {
        this.productIndex = productIndex;
    }

    
    public String getUserId() {
        return userId;
    }

    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    public Date getCrDate() {
        return crDate;
    }

    
    public void setCrDate(Date crDate) {
        this.crDate = crDate;
    }

    
    public Date getUpdDate() {
        return updDate;
    }

    
    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

}
