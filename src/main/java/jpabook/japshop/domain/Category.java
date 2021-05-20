package jpabook.japshop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
public class Category extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String name;
    // ManyToOne 연관관계는 LAZY(지연 로딩) 설정을 꼭 해줘야 한다. (즉시 로딩은 실무에서 잘 안씀)
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    // OneToMany이나 ManyToMany는 디폴트값이 지연로딩이기 때문에 따로 작성하지 않는다.
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //실무에서는 테이블 따로 만들어서 사용할 것! 다대다는 실무에서 안씀
    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item> items = new ArrayList<>();

}
