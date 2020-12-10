package com.shiwen.entity;

import java.io.Serializable;

/**
 * 支付表(Payment)实体类
 *
 * @author wangjie
 * @since 2020-09-27 17:19:11
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = 341796940472081543L;

    private String name;
    /**
     * 支付的id
     */
    private Long id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}