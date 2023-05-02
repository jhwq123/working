package study_230501;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {
	private int sno;
	private String name;
	private Subject[] subjects;
}
