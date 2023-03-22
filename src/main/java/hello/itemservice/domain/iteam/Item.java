package hello.itemservice.domain.iteam;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//@Getter @Setter
@Data // @Data는 주의해야한다.
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
