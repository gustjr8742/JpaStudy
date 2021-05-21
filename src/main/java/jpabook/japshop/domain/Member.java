package jpabook.japshop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;

    @Embedded //생략해도 되긴 함 이미 @Embeddable 선언을 앞에서 했으므로
    private Address address;

    //실질적으로는 쓰이는 일이 잘 없으나, 예제이므로 작성
    //실무적으로 잘 사용하지 않음(잘못된 코드일 확률이 있음)
    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    private List<Order> orders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
