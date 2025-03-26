package emp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class EmpDTO {
    private int empNo;
    private String ename;
    private String job;
    private int mgr;
    private String hirDate;
    private int sal;
    private int comm;
    private int deptNo;

}
