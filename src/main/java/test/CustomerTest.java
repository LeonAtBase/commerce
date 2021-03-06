package test;

import dao.CustomerDAO;
import java.sql.Date;
import model.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.getConnection();

//        // 新增一筆顧客資料
//        Customer customer = new Customer();
//        customer.setName("小龍女");
//        customer.setBirthday(Date.valueOf("1988-02-23"));
//        customer.setGender(0);
//        customer.setMail("CLN@gmail.com");
//        customer.setPhone("0923-323-980");
//        customer.setAddress("古墓");
//        customerDAO.insert(customer);
        
        // 查詢所有顧客資料
        customerDAO.selectAll();
        
//        // 查詢一筆顧客資料
//        Customer customer = new Customer();
//        customer.setId(3); // 請輸入欲查詢顧客id
//        customerDAO.select(customer);
        
//        // 修改顧客資料
//        Customer customer = new Customer();
//        customer.setId(1); // 請輸入欲修改顧客id
//        customer.setName("黃蓉");
//        customer.setBirthday(Date.valueOf("1970-05-12"));
//        customer.setGender(0);
//        customer.setMail("Hr@gmail.com");
//        customer.setPhone("0911-232-093");
//        customer.setAddress("桃花島");
//        customerDAO.update(customer);
        
//        // 刪除一筆顧客資料
//        Customer customer = new Customer();
//        customer.setId(3); // 請輸入欲刪除顧客id
//        customerDAO.delete(customer);
        
        customerDAO.closeConnection();
    }
}
