package test;

import dao.OrdersDAO;
import model.OrderDetail;
import model.Orders;

public class OrdersTest {

    public static void main(String[] args) {
        OrdersDAO ordersDAO = new OrdersDAO();
        ordersDAO.getConnection();

//        // 新增一筆訂單
//        Orders orders = new Orders();
//        OrderDetail orderDetail = new OrderDetail();
//        orders.setCustomerId(2); // 會員下訂單
//        int[] productId = {1, 3, 4}; // 下商品id
//        int[] number = {2, 4, 1}; // 對應的商品數量
//        orderDetail.setProductId(productId);
//        orderDetail.setNumber(number);
//        ordersDAO.insert(orders, orderDetail);
        
        //查詢所有訂單資料
        ordersDAO.selectAll();
        
//        // 查詢一筆訂單資料
//        Orders orders = new Orders();
//        orders.setId(24); // 請輸入欲查詢訂單id
//        ordersDAO.select(orders);
        
//        // 刪除一筆訂單
//        Orders orders = new Orders();
//        orders.setId(24); // 請輸入欲刪除訂單id
//        ordersDAO.delete(orders);

        ordersDAO.closeConnection();
    }
}
