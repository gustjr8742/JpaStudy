package jpabook.japshop;

import jpabook.japshop.domain.Order;
import jpabook.japshop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Order order = new Order();
//            order.addOrderItem(new OrderItem()); // 양방향 매핑을 사용할 때 사용 예시


            //양방향 매핑 안해도 되는것을 보여주는 코드
            Order order = new Order();
            em.persist(order);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);

            em.persist(orderItem);


            tx.commit();
        } catch (Exception e) {
            tx.rollback();

        } finally {
            em.close();
        }

        emf.close();

    }

}
