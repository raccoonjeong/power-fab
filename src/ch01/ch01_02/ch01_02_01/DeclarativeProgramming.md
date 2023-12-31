# 프로그래밍 패러다임

- 프로그래밍의 관점을 갖게 해주는 역할을 하는 개발 방법론
- jdk 1.8 이전의 자바는 객체지향 프로그래밍
- 하스켈은 함수형 프로그래밍

## 선언형과 함수형 프로그래밍
- 선언형 프로그래밍은 '무엇을' 풀어내는가에 집중하는 패러다임
- "프로그래밍은 함수로 이루어진 것이다"


### 함수형 프로그래밍이란
- 함수형 프로그래밍은 선언형 패러다임의 일종
- '순수 함수'들을 블록처럼 쌓아 로직을 구현하고 '고차 함수'를 통해 
재사용성을 높인 프로그래밍 패러다임
   - 순수 함수: 출력이 입력에만 의존하는 것
   - 고차 함수: 함수를 값처럼 매개변수로 받아 로직을 생성할 수 있는 것
     - 일급 객체: 고차 함수를 쓰기 위해서는 해당 언어가 일급 객체라는 특징을 가져야 함
        - 변수나 메서드에 함수를 할당할 수 있다
        - 함수 안에 함수를 매개변수로 담을 수 있다
        - 함수가 함수를 반환할 수 있다
- 자바스크립트는 함수가 일급 객체이기 때문에 함수형 프로그래밍이 선호된다.

