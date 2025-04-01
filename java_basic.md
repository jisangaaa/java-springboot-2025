## java 기초문법

### 기본
- 소스코드 템플릿

    ```java
    // 한줄주석.
    /* 여러줄
       주석. */
    package com.rooda99.spring01; // 자기 패키지명(폴더)

    import org.springframework.boot.SpringApplication;  // 라이브러리, 클래스 가져오기
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication  // 자바프로젝트 실행을 도와주는 어노테이션
    public class Spring01Application {   // 자신 클래스명

        // 엔트리포인트(프로젝트당 하나만 존재)
        public static void main(String[] args) {
            SpringApplication.run(Spring01Application.class, args);

            System.out.println("hello, spring boot");
        }

    }
    ```

#### 연산자
- 연산자는 거의 대부분의 언어에서 동일하게 사용
    - 사칙연산: +, -, *, /, %
    - 대입연산: =, +=, -=, *=, /=, %=, ++(a++)
    - 비트연산:
    - 논리연산:
    - 관계연산: ==, >, >=, <, <=, !=

#### 흐름제어
- 조건문 : if문, switch문
    - if 

    ```java
    if (조건식) {
        // if문 안으로 들어와서
        실행코드 블럭;
    } else if (조건식) {
        실행코드 블럭;
    } else {
        // 어디에도 참이 되지 않으면...
        실행코드 블럭;
    }
    ```

    - switch문 - 조건값에 따라 여러 분기로 나눌때 좋음. if문으로 대체 가능

    ```java
    switch (입력변수) {
        case 조건값:
            실행코드 블럭;
            break;
        case 조건값2:
            실행코드 블럭;
        case 조건값3:
            실행코드 블럭;
            break; //조건값2에서 시작하면 조건값3까지 모두수행
        default:
            기본실행코드 블럭;
            break; // case나 default에 되도록이면 빼지말것.
    }
    ```

    - 3항 연산 - 간단하게 구현할 조건문 if-else 대신 사용. 실행코드 블럭이 한줄일때

    ```java
    String result = (isLogin) ? "로그인 성공!" : "로그인 실패";

    if (isLogin) {
        result = "로그인성공!";
    } else {
        result = "로그인실패";
    }
    ```

- 반복문 : for문, while문, do-while문

    - for문 - 대표적인 반복문

    ```java
    // 일반적인 반복문
    for (초기값; 조건식; 증감식) {
        실행코드 블럭;
    }

    // 배열, 컬렉션을 처리하는 반복문
    for (변수 : 컬렉션데이터) {
        실행코드 블럭;
    }
    ```

    - while문 - 조건식이 참인동안 계속 반복

    ```java
    while (조건식) {
        실행코드 블럭;
    }
    ```

    - do-while문 - 우선 실행코드를 한번 수행 후 조건을 검사후 반복

    ```java
    do {
        실행코드 블럭;
    } while(조건식);
    ```

- 반복제어 키워드 : break, continue
    - for문, while문 내에서 사용
    - break - 조건에 맞아 반복문을 탈출
    - continue - 특수 조건만 비켜서 반복문을 계속할 때