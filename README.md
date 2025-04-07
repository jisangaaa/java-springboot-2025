# java-springboot-2025
2025년 java개발자 과정 springboot 레포지토리

## 1일차

### Spring Boot 웹 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트엔드) - 사용자 **요청**을 하고, 결과를 돌려받는 파트
    - 서버(백엔드) - 사용자의 요청을 받아서 DB에서 데이터를 가져와 처리하고, 사용자에게 **응답**하는 파트
    - 데이터베이스 - 가장 중요한 데이터가 저장되어 있는 파트
- 웹 개념
    - Reqiest(요청)에 대한 Response(응답)

### Spring Boot 개요
- Java - 컴퓨팅 세상 모든곳에서 사용될 수 있는 언어가 되고자 개발됨
- 웹개발
    1. CGI(common gateway interface) - HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹기술
    2. Servlet - CGI를 개선한 java 웹기술. 동적웹을 개발할 수 있음
    3. EJB(enterprise java bean) - 서블릿으로 대형 프로젝트를 개발할 수 있는 java 웹기술
        - HTML코드를 전부다 java에서 작성해야 함
    4. JSP(java server pages) - 웹페이지코드(HTML)에 자바소스를 포함시켜서 개발할 수 있는 java 웹기술
        - 확장자가 .jsp / 스파게티 코드
    5. Spring - java웹개발에 전성기. 웹페이지와 자바영역 분리.
        - 설정이 복잡
    6. Spring boot - Spring의 단점을 최소화. 설정을 간결화

- Spring Boot 
    - Spring 기술을 그대로 사용(마이그레이션이 간단)
    - JPA 기술을 사용하면 ERD나 DB설계를 하지 않고도 손쉽게 DB를 생성. DB연동도 쉬움
    - Tomcat webserver가 내장! (설치 필요없음)
    - 서포트하는 기능 다수 존재(개발을 쉽게 도와줌)
    - 테스트용 JUnit, 로그용 Log4J2 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원. JSP, **Thymeleaf**, Mustache 등
    - React 등의 자바스크립트 프론트엔드와 연계해서 풀스택 개발 가능
    - MVC(model view controller)로 영역을 분리. 각 부분별로 따로 개발

- MVC
    - View는 JSP포함, Thymeleaf, Mustache, HTML 등등
    <img src="./image/sb001.png" width="700">


### Spring Boot 개발환경 설정
- 필요요소
    - Java, 개발툴, 데이터베이스

- Java
    - Java Runtime과 JDK(java developer kit) 존재
        - Oracle 이외도 OpenJDK가 산재
        - https://www.azul.com/downloads/?package=jdk#zulu
        - https://adoptium.net/
        - https://jdk.java.net/
    - Java 17버전 이상설치
    - https://drive.google.com/file/d/18Sj82wcjeUvDYCQIS_uxOt7CpzJJDdJ1/view?usp=sharing
    - jdk-17.0.13_windows-x64_bin.msi 다운로드

    - 시스템정보에서 PATH 설정    -  sysdm.cpl 고급>환경변수 PATH 설정
        - 새로만들기
            - JAVA_HOME 
        - path에 %JAVA_HOME%\bin 추가, 맨 위로
    - powershell
        - java --version 으로 확인

- Visual Studio Code
    - 확장 설치
    - Java 검색
        - Extension Pack for Java 설치. Debugger for Java등 총 7가지 확장 설치

### Java 기본 실행
- VS Code에서 명령팔레트 실행(ctrl + shift + p)
    - java create
        1. build tool > Maven
        2. no archtype 선택
        3. group id 입력 (com.example)
        4. artifact id 입력 (demo)
        5. 저장위치 결정

### Visual Studio Code
- Visual Studio Code 확장 설치
    - spring 검색
        - Spring Boot Extension Pack 설치
        - spring initiaizr java support 설치
        - Spring Boot Dashboard 설치
    - gradle(빌드툴) 검색
        - gradle for java 설치

### spring boot 기본 실행(Java 프로젝트)
- VS Code에서 명령팔레트 실행
    - spring initializr: create a maven project
    - specify spring boot version: 3.3.10 선택
    - specify project language: Java
    - input group id: 본인아이디 입력/ com.rooda99
    - input artifact id: spring01
    - specify packaging type: Jar(Java archive, 압축파일)
    - specify Java version: 17
    - Choose dependencies: selected 0  dependencies
    - 저장위치 선택
    - **새 창 열기** - spring boot 프로젝트가 루트폴더가 된 개발환경

- 실행방법
    - 코드작성
    - spring boot dashboard > apps > 앱 실행

- 기초문법
    - [JAVA기초문법](./java_basic.md)


## 2일차
- 기초문법 계속
    - [JAVA기초문법](./java_basic.md)
    - 흐름제어(반복문), 배열, 메서드, 객체/클래스, 상속

## 3일차
- 기초문법 계속
    - [JAVA기초문법](./java_basic.md)
    - 상속, 인터페이스, 예외처리, 제네릭, 컬렉션 프레임워크, 입출력

#### Spring Boot Build Tool
- 개요
    - 프로젝트 빌드 과정을 자동화시켜주는 도구
    - 컴파일, 테스트, 패키징, 의존성 관리, 배포 등등 포함

- Maven
    - Java프로젝트 기본 빌드도구
    - 빌드, 패키징(jar/war 파일 생성), 테스트 등을 한번의 명령으로 간편하게 처리
    - 가장 큰 특징이 외부 라이브러리 자동으로 다운로드, 관리
    - pom.xml(Project Object Model) 파일로 빌드 설정 관리
    - 초기설정시 빠졌거나, 추가되어야 하면 xml 코딩으로 추가
    - VS Code 확장 중 Maven Dependency Explorer 등으로 확인

- Gradle
    1. 안드로이드용 오픈소스 빌드도구
    2. Maven Repository를 같이 사용
    3. Maven의 3, 4번 특징을 그대로 가지고 있음
    4. build.gradle 파일 사용. Groovy 스크립트 지원
    5. 빌드과정을 병렬처리, 캐싱사용으로 Maven보다 10~100배 향상된 성능 구현

### Gradle 설정
- Gradle로 프로젝트가 제대로 동작하지 않으면
    - https://gradle.org/ 에서 gradle 다운로드
    - 설치 경로 확인, 설치
    - 시스템 등록정보 PATH 지정. GRADLE_HOME 사용

### Spring Boot 로그 설정
- Spring Boot를 colorizing 해주는 기능
- src/resources/application.properties 

    ```shell
    spring.output.ansi.enabled=always
    ```
- 서버 재시작

## 4일차
- 기초문법 정리
    - 제네릭, 컬렉션 프레임워크, 입출력, 람다식, 스트림API

- Gradle 오류 해결방법
    - [Gradle](https://gradle.org/install/)
    - C:\Gradle 위치에 압축해제
    - sysdm.cpl 환경변수 GRADLE_HOME 경로 입력, 확인(JAVA_HOME과 동일)

    <img src="./image/sb0005.png" width="600">

    - VS Code 설정
    
    <img src="./image/sb0003.png" width="700">
    
    - Gradle Build Server: Enabled 기본 on -> off

    <img src="./image/sb0004.png" width="700">

    - Gradle Home -> 환경변수 입력한 GRADLE_HOME의 경로 입력
    - Gradle Java Home -> 현경변수 JAVA_HOME의 경로 입력
    

    - VS Code 재시작.

## 5일차
- Spring Boot 웹시작
- 프로젝트 초기화
    - Spring Initializr: Create a Gradle Project
    - Specify Spring Boot version: 3.4.4
    - Specify project language: Java
    - Input Group Id: com.hugo83(각자 설정할 것)
    - Input Artifact Id: spring03
    - Specify packaging type: Jar(Java archive, 압축파일)
    - Specify Java version: 17
    - Choose dependencies: Selected 1 dependencies
        - Spring Web
    - 저장위치 선택
    - **새 창 열기** - Spring Boot 프로젝트가 루트폴더가 된 개발환경

- 기본설정
    - application.properties에 `spring.output.ansi.enabled=always` 추가

- 포트번호
    |프로토콜|포트번호|비고|
    |:---|---:|:---|
    |HTTP|80|웹 서비스 포트(보안취약)|
    |HTTPS|443|SSL를 적용한 웹 서비스(보안강화)|
    |FTP|21|웹을 통한 파일전송|
    |TELNET|23|원격서버접속 서비스|
    |SSH|22|보안강화된 텔넷|
    |SMTP|25|메일 전송서비스|

- 개발용포트
    - 포트는 중복안됨
    - 8080포트를 사용하고 있으면 다른 포트로 변경해야 함!
    - 포트 변경시 application.properties에 `server.port=8090` 추가

- 웹브라우저 열기
    - http://localhost:8090/ 오픈

    <img src="./image/sb0006.png" width="700">

- 접속위치 요청 처리
    - 컨트롤러 생성
        - HelloController 클래스 생성
        - http://localhost:8090/hello 

    - 각 기능별로 패키지를 구분
        - controller, model, 등...

### 로그출력
- Log-back
    - 스프링부트에 내장된 로그 모듈

    - application.properties 내 로그설정

    ```groovy
    logging.level.root = info
    logging.file.name = /logtest.log
    ```

    - 사용 시
    ```java
    // 클래스 내 작성
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 메서드 내 사용
    logger.info("hello URL 오픈!");
    // 문제발생시 로그를 남길때
    logger.debug("디버그시 필요한 로그입니다.");
    logger.trace("디버그시 필요한 로그예요.");

    logger.warn("경고표시 나타내는 로그입니다.");
    logger.error("오류표시 나타내는 로그입니다.");
    ```

- Log4J2 외부모듈 사용 권장.


### 스프링부트 배너(중요도 없음)
- resources 폴더에 banner.txt 생성
- 내용 추가
- [Spring Boot Banner Generator](https://devops.datenkollektiv.de/banner.txt/index.html)
- 배너제너레이터로 생성한 글자 복사 banner.txt 붙여넣기
- 서버 재시작

<img src="./image/sb0009.png" width="700">

### 메인페이지 추가
- resources/static/index.html 부터 시작


### 스프링부트 프로젝트구조
<img src="./image/sb0010.png" width="300">

- 각 폴더 구조
    - .gradle ~ gradle : 그레이들, VSCode, 빌드 등에 필요한 폴더(설명필요X)
    - `src/main/java` : 패키지와 자바 소스가 저장되는 위치
    - com.hugo83.spring03 : 패키지. 폴더로 구성
        - HelloController 클래스에 접근하려면
        - com.hugo83.spring03.controller.HelloController 접근해야 함
    - Spring03Application.java : 시작프로그램
    - src/main/resources : 자바파일 이외 HTML, CSS, JS, 환경파일 등 리소스파일 저장되는 위치
        - `static` : CSS, JS, 이미지 파일 저장되는 곳
        - `templates` : 스프링부트와 연계되는 HTML 파일 저장되는 곳
        - `application.properties` : 프로젝트 환경설정 파일. 환경변수, DB 설정
    - src/test/java : JUnit 스프링부트 테스트도구 자바파링 저장되는 위치
    - `build.gradle` : 그레이들 환경 파일. Groovy 기반으로 한 빌드도구. dependencies 만 잘 구성하면 됨
    - gradlew.bat : 중간에 직접 그레이들 빌드를 할때 사용하는 배치파일.
    - settings.gradle : 고급 그레이들 설정. 손댈일 없음

### 스프링부트 어노테이션

#### @SpringBootApplication
- 스프링부트 자동구성 매커니즘 활성화
- 어플리케이션 내 패키지에서 컴포넌트들 스캐닝
- 설정 클래스 임포트해서 활성화, 스프링부트 실행

#### @Controller
- 컴포넌트 구체화해서 해당클래스 IoC컨테이너 Bean으로 등록

#### @GetMapping
- Get, Post 중 Get(URL)으로 들어오는 주소를 매핑. 처리해주는 역할
- @PostMapping, @RequestMapping등 파악

#### @ResponseBody
- HTTP 요청의 자바객체가 처리한 body내용을 매핑하는 역할
- 자바의 String 문자열을 웹페이지에 렌더링

## 6일차(06-26)

