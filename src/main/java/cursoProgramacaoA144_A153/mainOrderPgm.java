package cursoProgramacaoA144_A153;

import cursoProgramacaoA144_A153.entities.OrderStatus;

import java.util.Date;

public class mainOrderPgm {
    public static void main(String[] args) {

        Order order = new Order(1800, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        //Conversão de String para enum

        OrderStatus os1 = OrderStatus.DELIVERED;
        System.out.println(os1);

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os2);



    }
}
