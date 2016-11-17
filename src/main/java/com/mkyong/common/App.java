package com.mkyong.common;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;
import com.mkyong.customer.model.MarkList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
    	//...

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

        CustomerDAO customerSimpleDAO = (CustomerDAO) context.getBean("customerSimpleDAO");

        List<MarkList> customerBs = customerSimpleDAO.findAllTest();
        for(MarkList cust: customerBs){
            System.out.println("time  : " + cust.getMarkTime()+"  totalcount  : " + cust.getTotalCount());
        }
    }
}
