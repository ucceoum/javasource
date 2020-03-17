package domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVO {
	private int num;
	private String category;
	private String name;
	private String content;
	private String goodssize;
	private String color;
	private int amount;
	private int price;
	private Date regdate;
}
