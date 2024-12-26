<h2>SOLID</h2>

<h3>2. OCP(개방 / 폐쇄 원칙) : Open / Closed Principle</h3>

> 확장에는 열려 있고 변경에는 닫혀 있어야 한다.

- ex1) XML이 추가시 ReportGenerator 클래스의 코드가 영향범위내로 들어온다.

    - Report 생성 방식에 따라 클래스를 분리하고 Report Interface를 통해 실행