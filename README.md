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

## 3일차

## 4일차

## 5일차

## 6일차
