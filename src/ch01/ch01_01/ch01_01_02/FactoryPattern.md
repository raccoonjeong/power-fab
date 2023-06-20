## 팩토리 패턴

### 팩토리 패턴이란?
- 객체를 사용하는 코드에서 객체 생성 부분을 떼어내 추상화한 패턴이자 상속 관계에 있는 두 클래스에서 상위 클래스가 중요한 뼈대를 결정하고, 하위 클래스에서 객체 생성에 관한 구체적인 내용을 결정한다.
- 상위 클래스와 하위 클래스가 분리되기 때문에 느슨한 결합을 가짐.
- 상위 클래스에서는 인스턴스 생성 방식에 대해 전혀 알 필요가 없기 때문에 더 많은 유연성을 가짐.
- 객체 생성 로직이 따로 떼어져 있기 때문에 코드를 리팩터링하더라도 한 곳만 고칠 수 있어 유지 보수성이 증가됨.
- ex) 라떼 레시피/아메리카노 레시피/우유 레시피 라는 하위 클래스가 있고, 바리스타 공장이라는 상위 클래스에서 이 레시피들을 토대로 우유 등을 생산하는 생산 공정
