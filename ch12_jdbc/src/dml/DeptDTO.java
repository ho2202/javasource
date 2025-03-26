package dml;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DeptDTO {
    // 메소드에서 데이터를 전달하는 객체

    private int deptno;
    private String dname;
    private String loc;

}