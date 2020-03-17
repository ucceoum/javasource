package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookVO {
	//book 테이블
	private String code;
	private String title;
	private String writer;
	private int price;
}
