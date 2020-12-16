package com.amit.grochousevendor;

public class ViewOrderModal {

    private String userName, timer, orderNum, itemNum, totalAmount;
    private int viewOrderButton;

    ViewOrderModal(String userName, String timer, String orderNum, String itemNum, String totalAmount, int viewOrderButton) {
        this.userName = userName;
        this.timer = timer;
        this.orderNum = orderNum;
        this.itemNum = itemNum;
        this.totalAmount = totalAmount;
        this.viewOrderButton = viewOrderButton;
    }


    public String getUserName() {
        return userName;
    }

    public String getTimer() {
        return timer;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public String getItemNum() {
        return itemNum;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public int getViewOrderButton() {
        return viewOrderButton;
    }
}
