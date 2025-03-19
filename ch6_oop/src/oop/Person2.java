package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString

public class Person2 {
    @Setter // 하나의 멤버변수의 setter 작성됨
    private String name;
    @NonNull
    private String pno;
    private String tel;
}
