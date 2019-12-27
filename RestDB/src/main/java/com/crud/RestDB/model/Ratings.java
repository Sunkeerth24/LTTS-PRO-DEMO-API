package com.crud.RestDB.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "customer_exp")
public class Ratings {
    @Id
    @GeneratedValue
    private Long p_id;
@NotBlank
    private String cust_id;
@NotBlank
    private int prod_r;
@NotBlank
    private int sel_r;
@NotBlank
private int cust_ex;
@NotBlank
private String feedback;

public Ratings(){
        super();
    }
public Ratings(Long p_id, String cust_id, int prod_r, int sel_r,int cust_ex,String feedback) {
        super();
        this.p_id=p_id;
        this.cust_id=cust_id;
        this.prod_r=prod_r;
        this.sel_r=sel_r;
        this.cust_ex=cust_ex;
        this.feedback=feedback;
    }
public Long getP_id() {
	return p_id;
}
public void setP_id(Long p_id) {
	this.p_id = p_id;
}
public String getCust_id() {
	return cust_id;
}
public void setCust_id(String cust_id) {
	this.cust_id = cust_id;
}
public int getProd_r() {
	return prod_r;
}
public void setProd_r(int prod_r) {
	this.prod_r = prod_r;
}
public void setSel_r(int sel_r) {
	this.sel_r = sel_r;
}

public int getSel_r() {
	return sel_r;
}

public int getCust_ex() {
	return cust_ex;
}
public void setCust_ex(int cust_ex) {
	this.cust_ex = cust_ex;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}


}