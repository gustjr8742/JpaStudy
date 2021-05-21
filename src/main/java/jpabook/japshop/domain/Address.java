package jpabook.japshop.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // 값 타입의 좋은 점은 의미있는 메소드를 만들 수 있음, 그러나 실무에선 잘 사용하지 않음.
    // 그냥 엔티티 객체로 만드는 경우가 많기 때문?
    // 또한 공통적으로 적용해야 되는 룰이 있는경우 장점이 있음
    // 예를들어 도시 글자제한(5자) 이런식으로 할때 @Column(length = 5) 이런식으로 할 수 있음


    //set 같은 경우는 지우거나 막는게 좋음
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getZipcode(), address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipcode());
    }
}
