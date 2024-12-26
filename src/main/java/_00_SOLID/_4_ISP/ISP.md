<h2>SOLID</h2>

<h3>4. ISP(인터페이스 분리 원칙) : Interface Segregation Principle</h3>

> 클래스는 자신이 사용하지 않는 메서드를 구현하도록 강요받지 말아야 함

- ex1) Worker 인터페이스를 통해 eat()과 work()를 정의하였으나 로봇의 경우 eat()에 대한 구현이 안됨

    - Workable과 Eatable의 두가지 인터페이스로 분리하여 가능한 일만 상속 받도록 함
